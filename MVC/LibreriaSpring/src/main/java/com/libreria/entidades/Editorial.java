/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.libreria.entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Editorial {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String nombre;
    private boolean activo;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAltaLibro;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBajaLibro;

    public Editorial() {
    }

    public Editorial(String id, String nombre, Boolean activo, Date fechaAltaLibro, Date fechaBajaLibro) {
        this.id = id;
        this.nombre = nombre;
        this.activo = activo;
        this.fechaAltaLibro = fechaAltaLibro;
        this.fechaBajaLibro = fechaBajaLibro;
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

    @Override
    public String toString() {
        return "Editorial{" + "id=" + id + ", nombre=" + nombre + ", activo=" + activo + ", fechaAltaLibro=" + fechaAltaLibro + ", fechaBajaLibro=" + fechaBajaLibro + '}';
    }
}
