package com.libreria.services;

import com.libreria.entidades.Autor;
import com.libreria.errores.ErrorServicio;
import com.libreria.repositorios.AutorRepositorio;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AutorService {

    @Autowired
    private AutorRepositorio autorRepositorio;

    @Transactional(rollbackFor = {Exception.class})
    public void agregarAutor(String nombre, String apellido) throws Exception {

        validarDatos(nombre);
        Autor autor = new Autor();

        autor.setNombre(nombre);
        autor.setApellido(apellido);
        autor.setAlta(true);
        autor.setFechaAltaAutor(new Date());
        autor.setFechaBajaAutor(null);

        autorRepositorio.save(autor);
    }

    @Transactional
    public void moficarAutor(String id, String nombre) throws Exception {
        
        validarDatos(nombre);

        Optional<Autor> respuesta = autorRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Autor autor = respuesta.get();
            autor.setNombre(nombre);
            autorRepositorio.save(autor);
        } else {
            throw new ErrorServicio("No se encontro el Autor");
        }
    }

    @Transactional
    public void bajaAutor(String id) throws ErrorServicio {
        Optional<Autor> respuesta = autorRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Autor autor = respuesta.get();
            autor.setFechaBajaAutor(new Date());

            autorRepositorio.save(autor);
        } else {
            throw new ErrorServicio("No se encontro el Autor");
        }
    }
    
    @Transactional
    public void altaAutor(String id) throws ErrorServicio {
        Optional<Autor> respuesta = autorRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Autor autor = respuesta.get();
            autor.setFechaBajaAutor(null);

            autorRepositorio.save(autor);
        } else {
            throw new ErrorServicio("No se encontro el Autor");
        }
    }
      @Transactional(readOnly = true)
    public Autor buscarPorId(String id) throws ErrorServicio{
        Optional<Autor> respuesta = autorRepositorio.findById(id);
         if (respuesta.isPresent()) {
            return respuesta.get();
        } else {
            throw new ErrorServicio("No se encontro el Libro");
        }
    }
    
    public void validarDatos(String nombre) throws ErrorServicio{
        if (nombre == null || nombre.isEmpty()) {
            throw new ErrorServicio("El nombre del nombre no puede ser nulo");
        }
        
//        if (fechaAltaLibro == null && fechaBajaLibro == null) {
//            throw new ErrorServicio("La fecha alta y la fecha baja no pueden ser ambas nulas");
//        }
        
    }

}
