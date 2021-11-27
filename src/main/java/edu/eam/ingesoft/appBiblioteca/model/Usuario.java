package edu.eam.ingesoft.appBiblioteca.model;

public class Usuario {
    private String user_identification;
    private String apellido_usuario;
    private String nombre_usuario;

    public Usuario(String user_identification, String apellido_usuario, String nombre_usuario) {
        this.user_identification = user_identification;
        this.apellido_usuario = apellido_usuario;
        this.nombre_usuario = nombre_usuario;
    }

    public String getUser_identification() {
        return user_identification;
    }

    public void setUser_identification(String user_identification) {
        this.user_identification = user_identification;
    }

    public String getApellido_usuario() {
        return apellido_usuario;
    }

    public void setApellido_usuario(String apellido_usuario) {
        this.apellido_usuario = apellido_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "user_identification='" + user_identification + '\'' +
                ", apellido_usuario='" + apellido_usuario + '\'' +
                ", nombre_usuario=" + nombre_usuario +
                '}';
    }
}
