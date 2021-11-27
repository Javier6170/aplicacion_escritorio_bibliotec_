package edu.eam.ingesoft.appBiblioteca.gui.controller;


import edu.eam.ingesoft.appBiblioteca.http.EditorialClient;
import edu.eam.ingesoft.appBiblioteca.model.Editorial;

public class CrudEditorialController {
    private EditorialClient client;

    public CrudEditorialController() {client = new EditorialClient();}

    public void createAutor(String id, String nombre_editorial) throws Exception {
        Editorial editorial = new Editorial(id,nombre_editorial);

        client.createEditorial(editorial);
    }
}
