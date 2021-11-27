package edu.eam.ingesoft.appBiblioteca.gui.controller;


import edu.eam.ingesoft.appBiblioteca.http.UsuarioClient;
import edu.eam.ingesoft.appBiblioteca.model.Usuario;

public class CrudUsuarioController {
    private UsuarioClient client;

    public CrudUsuarioController() {client = new UsuarioClient();}

    public void createLibro(String user_identification, String apellido_usuario, String nombre_usuario) throws Exception {
        Usuario usuario = new Usuario(user_identification,apellido_usuario,nombre_usuario);

        client.createUsuario(usuario);
    }
}
