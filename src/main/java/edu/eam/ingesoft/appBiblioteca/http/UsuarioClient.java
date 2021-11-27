package edu.eam.ingesoft.appBiblioteca.http;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.eam.ingesoft.appBiblioteca.model.APIError;
import edu.eam.ingesoft.appBiblioteca.model.Usuario;
import okhttp3.*;

public class UsuarioClient {
    public static final String HOST = "https://prestamo-libro-eam.herokuapp.com";

    private ObjectMapper objectMapper;
    private OkHttpClient client;

    public UsuarioClient() {
        objectMapper = new ObjectMapper();
        client = new OkHttpClient().newBuilder()
                .build();
    }

    public void createUsuario(Usuario usuario) throws Exception{
        String bodyStr = objectMapper.writeValueAsString(usuario);

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, bodyStr);

        Request request = new Request.Builder()
                .url(HOST +"/users")
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
