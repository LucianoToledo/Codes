package com.libreria.entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String nombre;
    private String Apellido;
    private String Telefono;
    private boolean activo;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAltaCliente;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBajaCliente;

    public Cliente(String nombre, String Apellido, String Telefono, boolean activo, Date fechaAltaCliente, Date fechaBajaCliente) {
        this.id = id;
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.activo = activo;
        this.fechaAltaCliente = fechaAltaCliente;
        this.fechaBajaCliente = fechaBajaCliente;
    }

    public Cliente() {
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

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Date getFechaAltaCliente() {
        return fechaAltaCliente;
    }

    public void setFechaAltaCliente(Date fechaAltaCliente) {
        this.fechaAltaCliente = fechaAltaCliente;
    }

    public Date getFechaBajaCliente() {
        return fechaBajaCliente;
    }

    public void setFechaBajaCliente(Date fechaBajaCliente) {
        this.fechaBajaCliente = fechaBajaCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", Apellido=" + Apellido + ", Telefono=" + Telefono + ", activo=" + activo + ", fechaAltaCliente=" + fechaAltaCliente + ", fechaBajaCliente=" + fechaBajaCliente + '}';
    }

}
