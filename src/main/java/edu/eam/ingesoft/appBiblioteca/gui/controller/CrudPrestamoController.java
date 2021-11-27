package edu.eam.ingesoft.appBiblioteca.gui.controller;


import edu.eam.ingesoft.appBiblioteca.http.PrestamoClient;
import edu.eam.ingesoft.appBiblioteca.model.Libro;
import edu.eam.ingesoft.appBiblioteca.model.Prestamo;
import edu.eam.ingesoft.appBiblioteca.model.Usuario;

import java.util.Date;

public class CrudPrestamoController {
    private PrestamoClient client;

    public CrudPrestamoController() {client = new PrestamoClient();}

    public void createPrestamo(Long id, Date fecha_prestamo, Usuario id_user, Libro book) throws Exception {
        Prestamo libro = new Prestamo(id,fecha_prestamo,id_user,book);

        client.createPrestamo(libro);
    }
}
