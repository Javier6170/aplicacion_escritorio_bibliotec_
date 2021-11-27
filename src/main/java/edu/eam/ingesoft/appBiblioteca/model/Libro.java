package edu.eam.ingesoft.appBiblioteca.model;

public class Libro {
    private String id;
    private String isbn_libro;
    private int cantidad;
    private String nombre_libro;
    private Editorial id_editorial;

    public Libro() {
    }

    public Libro(String id, String isbn_libro, int cantidad, String nombre_libro, Editorial id_editorial) {
        this.id = id;
        this.isbn_libro = isbn_libro;
        this.cantidad = cantidad;
        this.nombre_libro = nombre_libro;
        this.id_editorial = id_editorial;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIsbn_libro() {
        return isbn_libro;
    }

    public void setIsbn_libro(String isbn_libro) {
        this.isbn_libro = isbn_libro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre_libro() {
        return nombre_libro;
    }

    public void setNombre_libro(String nombre_libro) {
        this.nombre_libro = nombre_libro;
    }

    public Editorial getId_editorial() {
        return id_editorial;
    }

    public void setId_editorial(Editorial id_editorial) {
        this.id_editorial = id_editorial;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id='" + id + '\'' +
                ", isbn_libro='" + isbn_libro + '\'' +
                ", nombre_libro=" + nombre_libro +
                ", id_editorial='" + id_editorial + '\'' +
                '}';
    }
}
