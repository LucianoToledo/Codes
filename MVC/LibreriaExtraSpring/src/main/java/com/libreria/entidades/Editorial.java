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
    private Date fechaAltaEditorial;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBajaEditorial;
    //listar cantidad de libros por editorial

    public Editorial() {
    }

    public Editorial(String id, String nombre, Boolean activo, Date fechaAltaEditorial, Date fechaBajaEditorial) {
        this.id = id;
        this.nombre = nombre;
        this.activo = activo;
        this.fechaAltaEditorial = fechaAltaEditorial;
        this.fechaBajaEditorial = fechaBajaEditorial;
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
    public Date getFechaAltaEditorial() {
        return fechaAltaEditorial;
    }

    public void setFechaAltaEditorial(Date fechaAltaEditorial) {
        this.fechaAltaEditorial = fechaAltaEditorial;
    }

    public Date getFechaBajaEditorial() {
        return fechaBajaEditorial;
    }

    public void setFechaBajaEditorial(Date fechaBajaEditorial) {
        this.fechaBajaEditorial = fechaBajaEditorial;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Editorial{" + "id=" + id + ", nombre=" + nombre + ", activo=" + activo + ", fechaAltaEditorial=" + fechaAltaEditorial + ", fechaBajaEditorial=" + fechaBajaEditorial + '}';
    }
}
