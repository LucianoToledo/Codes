package com.libreria.entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Autor {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String nombre;
    private boolean activo;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAltaAutor;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBajaAutor;

    public Autor() {
    }

    public Autor(String id, String nombre, Boolean activo, Date fechaAltaAutor, Date fechaBajaAutor) {
        this.id = id;
        this.nombre = nombre;
        this.activo = activo;
        this.fechaAltaAutor = fechaAltaAutor;
        this.fechaBajaAutor = fechaBajaAutor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getAlta() {
        return activo;
    }

    public void setAlta(Boolean activo) {
        this.activo = activo;
    }
    public Date getFechaAltaAutor() {
        return fechaAltaAutor;
    }

    public void setFechaAltaAutor(Date fechaAltaAutor) {
        this.fechaAltaAutor = fechaAltaAutor;
    }

    public Date getFechaBajaAutor() {
        return fechaBajaAutor;
    }

    public void setFechaBajaAutor(Date fechaBajaAutor) {
        this.fechaBajaAutor = fechaBajaAutor;
    }

    @Override
    public String toString() {
        return "Autor{" + "id=" + id + ", nombre=" + nombre + ", activo=" + activo + ", fechaAltaAutor=" + fechaAltaAutor + ", fechaBajaAutor=" + fechaBajaAutor + '}';
    }

 }
