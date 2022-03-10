package com.libreria.services;

import com.libreria.entidades.Autor;
import com.libreria.entidades.Editorial;
import com.libreria.entidades.Libro;
import com.libreria.errores.ErrorServicio;
import com.libreria.repositorios.LibroRepositorio;
import java.util.Date;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroService {

    @Autowired
    private LibroRepositorio libroRepositorio;

    public void registrarLibro(String titulo, Date anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, boolean alta, Autor autor, Editorial editorial) throws ErrorServicio {

        validarDatos(titulo, ejemplares, ejemplaresPrestados, ejemplaresRestantes);

        Libro libro = new Libro();
        libro.setTitulo(titulo);
        libro.setAnio(anio);
        libro.setEjemplares(ejemplares);
        libro.setEjemplaresPrestados(ejemplaresPrestados);
        libro.setEjemplaresRestantes(libro.getEjemplares() - libro.getEjemplaresPrestados());
        libro.setAlta(true);
        libro.setAutor(autor);
        libro.setEditorial(editorial);

        libroRepositorio.save(libro);
    }

    public void modificarLibro(String id, String titulo, Date anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, boolean alta, Autor autor, Editorial editorial) throws ErrorServicio {

        validarDatos(titulo, ejemplares, ejemplaresPrestados, ejemplaresRestantes);

        Optional<Libro> respuesta = libroRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Libro libro = respuesta.get();
            libro.setTitulo(titulo);
            libro.setAnio(anio);
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(ejemplaresPrestados);
            libro.setEjemplaresRestantes(libro.getEjemplares() - libro.getEjemplaresPrestados());
            libro.setAlta(alta);
            libro.setAutor(autor);
            libro.setEditorial(editorial);

            libroRepositorio.save(libro);
        } else {
            throw new ErrorServicio("No se encontro el usuario");
        }

    }

    public void deshabilitarLibro(String id) throws ErrorServicio {
        Optional<Libro> respuesta = libroRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Libro libro = respuesta.get();
//            libro.setBaja(new Date()); si existe el libro se le pone la fecha de baja                     agregar fechasAlta y fechaModificacion
            libroRepositorio.save(libro);
        } else {
            throw new ErrorServicio("No se encontro el usuario");
        }
    }
    public void habilitarLibro(String id) throws ErrorServicio {
        Optional<Libro> respuesta = libroRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Libro libro = respuesta.get();
//            libro.setBaja(null);  si existe el libro se elimina la fecha de baja  agregar fechasAlta y fechaModificacion
            libroRepositorio.save(libro);
        } else {
            throw new ErrorServicio("No se encontro el usuario");
        }
    }

    private void validarDatos(String titulo, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes) throws ErrorServicio {
        if (titulo == null || titulo.isEmpty()) {
            throw new ErrorServicio("El nombre del titulo no puede ser nulo");
        }
        if (ejemplares == null || ejemplares < 0) {
            throw new ErrorServicio("La cantidad de ejemplares del titulo no puede ser nulo o menor a 1");
        }
        if (ejemplares < ejemplaresPrestados) {
            throw new ErrorServicio("La cantidad de ejemplares del titulo no puede ser menor que la cantidad de ejemplares prestado");
        }
        if (ejemplares < ejemplaresPrestados) {
            throw new ErrorServicio("La cantidad de ejemplares del titulo no puede ser menor que la cantidad de ejemplares restantes");
        }
        if (ejemplaresPrestados == null || ejemplaresPrestados < 0) {
            throw new ErrorServicio("La cantidad de ejemplares prestados del titulo no puede ser nulo");
        }
        if (ejemplaresRestantes == null || ejemplaresRestantes < 0) {
            throw new ErrorServicio("La cantidad de ejemplares restantes del titulo no puede ser nulo");
        }
    }
}
