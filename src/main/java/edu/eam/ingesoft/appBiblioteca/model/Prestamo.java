package edu.eam.ingesoft.appBiblioteca.model;

import java.util.Date;

public class Prestamo {
    private Long id;
    private Date fecha_prestamo;
    private Usuario id_user;
    private Libro book;

    public Prestamo() {
    }

    public Prestamo(Long id, Date fecha_prestamo, Usuario id_user, Libro book) {
        this.id = id;
        this.fecha_prestamo = fecha_prestamo;
        this.id_user = id_user;
        this.book = book;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha_prestamo() {
        return fecha_prestamo;
    }

    public void setFecha_prestamo(Date fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public Usuario getId_user() {
        return id_user;
    }

    public void setId_user(Usuario id_user) {
        this.id_user = id_user;
    }

    public Libro getBook() {
        return book;
    }

    public void setBook(Libro book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "id='" + id + '\'' +
                ", fecha_prestamo='" + fecha_prestamo + '\'' +
                ", id_user=" + id_user +
                ", book='" + book + '\'' +
                '}';
    }
}
