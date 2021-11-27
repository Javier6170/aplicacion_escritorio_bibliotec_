package edu.eam.ingesoft.appBiblioteca.http;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.eam.ingesoft.appBiblioteca.model.APIError;
import edu.eam.ingesoft.appBiblioteca.model.Prestamo;
import okhttp3.*;

public class PrestamoClient {
    public static final String HOST = "https://prestamo-libro-eam.herokuapp.com";

    private ObjectMapper objectMapper;
    private OkHttpClient client;

    public PrestamoClient() {
        objectMapper = new ObjectMapper();
        client = new OkHttpClient().newBuilder()
                .build();
    }

    public void createPrestamo(Prestamo prestamo) throws Exception{
        String bodyStr = objectMapper.writeValueAsString(prestamo);

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, bodyStr);

        Request request = new Request.Builder()
                .url(HOST +"/borrows/{idUsuario}/{idBook}")
                .method("POST", body)
                .addHeader("Content-Type", "application/json")
                .build();

        Response response = client.newCall(request).execute();

        if (!response.isSuccessful()) {
            String bodyAsString = response.body().string();

            APIError error = objectMapper.readValue(bodyAsString, APIError.class);
            throw new Exception(error.getMessage());
        }
    }
}
