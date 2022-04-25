package com.libreria.entidades;

import com.libreria.enums.RolUsuario;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private RolUsuario rolUsuario;

    public Cliente() {
    }

    public Cliente(String nombre, String Apellido, String Telefono, boolean activo, Date fechaAltaCliente, Date fechaBajaCliente, String email, String password, RolUsuario rolUsuario) {
        this.id = id;
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.activo = activo;
        this.fechaAltaCliente = fechaAltaCliente;
        this.fechaBajaCliente = fechaBajaCliente;
        this.email = email;
        this.password = password;
        this.rolUsuario = rolUsuario;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RolUsuario getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(RolUsuario rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    
}
