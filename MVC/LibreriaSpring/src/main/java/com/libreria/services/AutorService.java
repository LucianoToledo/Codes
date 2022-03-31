package com.libreria.services;

import com.libreria.entidades.Autor;
import com.libreria.entidades.Libro;
import com.libreria.errores.ErrorServicio;
import com.libreria.repositorios.AutorRepositorio;
import com.libreria.repositorios.LibroRepositorio;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AutorService {

    @Autowired
    private AutorRepositorio autorRepositorio;

    @Autowired
    private LibroRepositorio libroRepositorio;

    @Transactional(rollbackFor = {Exception.class})
    public void agregarAutor(String nombre, String apellido) throws Exception {

        validarDatos(nombre, apellido);
        Autor autor = new Autor();

        autor.setNombre(nombre);
        autor.setApellido(apellido);
        autor.setActivo(true);
        autor.setFechaAltaAutor(new Date());
        autor.setFechaBajaAutor(null);

        autorRepositorio.save(autor);
    }

    @Transactional
    public void modificarAutor(String id, String nombre, String apellido) throws Exception {
        validarDatos(nombre, apellido);
        Optional<Autor> respuesta = autorRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Autor autor = respuesta.get();
            autor.setNombre(nombre);
            autor.setApellido(apellido);
            autorRepositorio.save(autor);
        } else {
            throw new ErrorServicio("No se encontro el Autor");
        }
    }

    @Transactional
    public void bajaAutor(String id) throws ErrorServicio {
        Optional<Autor> respuesta = autorRepositorio.findById(id);
        if (respuesta.isPresent()) {
            validarAutorAsignado(respuesta, "dar de baja");
            Autor autor = respuesta.get();
            if (autor.isActivo()) {
                autor.setFechaBajaAutor(new Date());
                autor.setActivo(false);
                autorRepositorio.save(autor);
            } else {
                throw new ErrorServicio("El Autor ya se encuentra dado de Baja");
            }
        } else {
            throw new ErrorServicio("No se encontro el Autor");
        }
    }

    @Transactional
    public void altaAutor(String id) throws ErrorServicio {
        Optional<Autor> respuestaAutor = autorRepositorio.findById(id);
        if (respuestaAutor.isPresent()) {
            Autor autor = respuestaAutor.get();
            if (!autor.isActivo()) {
                autor.setFechaBajaAutor(null);
                autor.setFechaAltaAutor(new Date());
                autor.setActivo(true);
                autorRepositorio.save(autor);
            } else {
                throw new ErrorServicio("El Autor ya se encuentra dado de Alta");
            }

        } else {
            throw new ErrorServicio("No se encontro el Autor");
        }
    }

    @Transactional(readOnly = true)
    public Autor buscarPorId(String id) throws ErrorServicio {
        Optional<Autor> respuesta = autorRepositorio.findById(id);
        if (respuesta.isPresent()) {
            return respuesta.get();
        } else {
            throw new ErrorServicio("No se encontro el Autor");
        }
    }

    @Transactional(readOnly = true)
    public Autor buscarPorNombre(String nombre) throws ErrorServicio {
        Autor autor = autorRepositorio.buscarPorNombre(nombre);
        if (!(autor == null)) {
            return autor;
        } else {
            throw new ErrorServicio("No se encontro el Autor");
        }
    }

    @Transactional(readOnly = true)
    public List<Autor> listarAutores() throws ErrorServicio {
        List<Autor> autores = autorRepositorio.findAll();
        return autores;
    }

    @Transactional(rollbackFor = {Exception.class})
    public void eliminarAutor(String id) throws ErrorServicio {

        Optional<Autor> respuestaAutor = autorRepositorio.findById(id);

        if (validarAutorAsignado(respuestaAutor, "eliminar")) {
            autorRepositorio.deleteById(id);
        }

    }

    @Transactional(readOnly = true)
    public boolean validarAutorAsignado(Optional<Autor> respuestaAutor, String mensajeError) throws ErrorServicio {

        boolean flag = true;
        List<Libro> respuestaLibro = libroRepositorio.buscarPorIdAutor(respuestaAutor.get().getId());

        if (respuestaAutor.isPresent()) {
            if (!respuestaLibro.isEmpty()) {
                String errorMessage = "No fue posible " + mensajeError + " al autor: ''" + respuestaAutor.get().getNombre() + " " + respuestaAutor.get().getApellido() + "'' porque tiene asignado los siguientes libros: \n";
                for (Libro libro : respuestaLibro) {
                    errorMessage += "-''" + libro.getTitulo() + "'' \n"; //validar que si es el ultimo libro no muestre el espacio en el mensaje
                    flag = false;
                }
                throw new ErrorServicio(errorMessage);
            }
        } else {
            throw new ErrorServicio("No se encontro el Autor");
        }
        return flag;
    }

    public void validarDatos(String nombre, String apellido) throws ErrorServicio {
        if (nombre == null || nombre.isEmpty()) {
            throw new ErrorServicio("El nombre del Autor no puede ser nulo");
        }
        if (apellido == null || apellido.isEmpty()) {
            throw new ErrorServicio("El apellido del Autor no puede ser nulo");
        }
//        if (fechaAltaLibro == null && fechaBajaLibro == null) {
//            throw new ErrorServicio("La fecha alta y la fecha baja no pueden ser ambas nulas");
//        }
    }

}
