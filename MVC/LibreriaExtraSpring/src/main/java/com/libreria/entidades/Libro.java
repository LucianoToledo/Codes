package com.libreria.entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Libro {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private String titulo;

    private String anio;

    private Integer ejemplares;
    private Integer ejemplaresPrestados;
    private Integer ejemplaresRestantes;
    private boolean activo;
    private boolean prestamo;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAltaLibro;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBajaLibro;
    
    @Temporal(TemporalType.TIMESTAMP) //agregar clase PrestamoLibro donde se guarden las fechas de los prestamos
    private Date fechaPrestamo;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDevolucion;

    @ManyToOne
    private Autor autor;

    @ManyToOne
    private Editorial editorial;
    
    //contador cantidad de veces prestado

    public Libro(String id, String titulo, String anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, boolean activo, boolean prestamo, Date fechaAltaLibro, Date fechaBajaLibro, Date fechaPrestamo, Date fechaDevolucion, Autor autor, Editorial editorial) {
        this.id = id;
        this.titulo = titulo;
        this.anio = anio;
        this.ejemplares = ejemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
        this.ejemplaresRestantes = ejemplaresRestantes;
        this.activo = activo;
        this.prestamo = prestamo;
        this.fechaAltaLibro = fechaAltaLibro;
        this.fechaBajaLibro = fechaBajaLibro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.autor = autor;
        this.editorial = editorial;
    }



    public Libro() {
    }

    public boolean isPrestamo() {
        return prestamo;
    }

    public void setPrestamo(boolean prestamo) {
        this.prestamo = prestamo;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Integer getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(Integer ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public Integer getEjemplaresRestantes() {
        return ejemplaresRestantes;
    }

    public void setEjemplaresRestantes(Integer ejemplaresRestantes) {
        this.ejemplaresRestantes = ejemplaresRestantes;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Date getFechaAltaLibro() {
        return fechaAltaLibro;
    }

    public void setFechaAltaLibro(Date fechaAltaLibro) {
        this.fechaAltaLibro = fechaAltaLibro;
    }

    public Date getFechaBajaLibro() {
        return fechaBajaLibro;
    }

    public void setFechaBajaLibro(Date fechaBajaLibro) {
        this.fechaBajaLibro = fechaBajaLibro;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "id=" + id + ", titulo=" + titulo + ", anio=" + anio + ", ejemplares=" + ejemplares + ", ejemplaresPrestados=" + ejemplaresPrestados + ", ejemplaresRestantes=" + ejemplaresRestantes + ", activo=" + activo + ", prestamo=" + prestamo + ", fechaAltaLibro=" + fechaAltaLibro + ", fechaBajaLibro=" + fechaBajaLibro + ", fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion=" + fechaDevolucion + ", autor=" + autor + ", editorial=" + editorial + '}';
    }


}
