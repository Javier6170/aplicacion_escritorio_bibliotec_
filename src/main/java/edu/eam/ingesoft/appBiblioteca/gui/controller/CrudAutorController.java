package edu.eam.ingesoft.appBiblioteca.gui.controller;

import java.io.IOException;
import java.util.List;

import edu.eam.ingesoft.appBiblioteca.http.AutorClient;
import edu.eam.ingesoft.appBiblioteca.model.Autor;
import okhttp3.MediaType;
import okhttp3.RequestBody;

public class CrudAutorController {

    private AutorClient client;

    public CrudAutorController() {client = new AutorClient();}

    public void createAutor(String id, String name,String lastname) throws Exception {
        Autor autor = new Autor(id,name,lastname);

        client.createAutor(autor);
    }

}
