package com.libreria.services;

import com.libreria.entidades.Autor;
import com.libreria.errores.ErrorServicio;
import com.libreria.repositorios.AutorRepositorio;
import java.util.Date;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService {

    @Autowired
    private AutorRepositorio autorRepositorio;

    public void registrarAutor(String nombre, Boolean activo, Date fechaAltaLibro, Date fechaBajaLibro) throws Exception {

        validarDatos(nombre, activo, fechaAltaLibro, fechaBajaLibro);
        Autor autor = new Autor();

        autor.setNombre(nombre);
        autor.setAlta(true);
        autor.setFechaAltaLibro(new Date());
        autor.setFechaBajaLibro(null);

        autorRepositorio.save(autor);
    }

    public void moficarAutor(String id, String nombre, Boolean activo,Date fechaAltaLibro, Date fechaBajaLibro) throws Exception {
        
        validarDatos(nombre, activo, fechaAltaLibro, fechaBajaLibro);

        Optional<Autor> respuesta = autorRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Autor autor = respuesta.get();
            autor.setNombre(nombre);
            autor.setAlta(activo);

            autorRepositorio.save(autor);
        } else {
            throw new ErrorServicio("No se encontro el Autor");
        }
    }

    public void bajaAutor(String id) throws ErrorServicio {
        Optional<Autor> respuesta = autorRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Autor autor = respuesta.get();
            autor.setFechaBajaLibro(new Date());

            autorRepositorio.save(autor);
        } else {
            throw new ErrorServicio("No se encontro el Autor");
        }
    }
    
    public void altaAutor(String id) throws ErrorServicio {
        Optional<Autor> respuesta = autorRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Autor autor = respuesta.get();
            autor.setFechaBajaLibro(null);

            autorRepositorio.save(autor);
        } else {
            throw new ErrorServicio("No se encontro el Autor");
        }
    }
    
    public void validarDatos(String nombre, Boolean activo, Date fechaAltaLibro, Date fechaBajaLibro) throws ErrorServicio{
        if (nombre == null || nombre.isEmpty()) {
            throw new ErrorServicio("El nombre del nombre no puede ser nulo");
        }
        
        if (fechaAltaLibro == null && fechaBajaLibro == null) {
            throw new ErrorServicio("La fecha alta y la fecha baja no pueden ser ambas nulas");
        }
        
    }

}
