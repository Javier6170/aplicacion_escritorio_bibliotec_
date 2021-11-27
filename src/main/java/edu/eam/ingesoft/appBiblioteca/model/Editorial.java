package edu.eam.ingesoft.appBiblioteca.model;

public class Editorial {
    private String id;
    private String nombre_editorial;

    public Editorial() {
    }

    public Editorial(String id, String nombre_editorial) {
        this.id = id;
        this.nombre_editorial = nombre_editorial;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre_editorial() {
        return nombre_editorial;
    }

    public void setNombre_editorial(String nombre_editorial) {
        this.nombre_editorial = nombre_editorial;
    }

    @Override
    public String toString() {
        return "Editorial{" +
                "id='" + id + '\'' +
                ", nombre_editorial='" + nombre_editorial + '\'' +
                '}';
    }
}
