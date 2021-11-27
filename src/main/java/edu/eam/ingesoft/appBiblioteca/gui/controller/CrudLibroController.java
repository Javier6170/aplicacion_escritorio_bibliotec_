package edu.eam.ingesoft.appBiblioteca.gui.controller;


import edu.eam.ingesoft.appBiblioteca.http.LibroClient;
import edu.eam.ingesoft.appBiblioteca.model.Editorial;
import edu.eam.ingesoft.appBiblioteca.model.Libro;

public class CrudLibroController {
    private LibroClient client;

    public CrudLibroController() {client = new LibroClient();}

    public void createLibro(String id, String isbn_libro, int cantidad, String nombre_libro, Editorial id_editorial) throws Exception {
        Libro libro = new Libro(id,isbn_libro,cantidad,nombre_libro,id_editorial);

        client.createLibro(libro);
    }
}
