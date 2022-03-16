package com.libreria.services;

import com.libreria.entidades.Autor;
import com.libreria.entidades.Editorial;
import com.libreria.entidades.Libro;
import com.libreria.errores.ErrorServicio;
import com.libreria.repositorios.LibroRepositorio;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LibroService {

    @Autowired //INYECCION DE DEPENDENCIA
    private LibroRepositorio libroRepositorio;
    
    @Autowired
   private  AutorService autorServicio;
    
    @Autowired
    private EditorialService editorialService;
    

    @Transactional(rollbackFor = {Exception.class})
    public void agregarLibro(String titulo, Date anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, boolean activo, Date fechaAltaLibro, Date fechaBajaLibro, String idAutor, String idEditorial) throws ErrorServicio {

        validarDatos(titulo, ejemplares, ejemplaresPrestados, ejemplaresRestantes, fechaAltaLibro, fechaBajaLibro);
        Libro libro = new Libro();
        libro.setTitulo(titulo);
        libro.setAnio(anio);
        libro.setEjemplares(ejemplares);
        libro.setEjemplaresPrestados(ejemplaresPrestados);
        libro.setEjemplaresRestantes(libro.getEjemplares() - libro.getEjemplaresPrestados());
        libro.setActivo(true);
        libro.setFechaAltaLibro(new Date());
        libro.setFechaBajaLibro(null);
        libro.setAutor(autorServicio.buscarPorId(idAutor));
        libro.setEditorial(editorialService.buscarPorId(idEditorial));
        libroRepositorio.save(libro);
    }

    //no se utilizan las fechas alta y baja
    @Transactional
    public void modificarLibro(String id, String titulo, Date anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, boolean activo,Date fechaAltaLibro, Date fechaBajaLibro, Autor autor, Editorial editorial) throws ErrorServicio {

        validarDatos(titulo, ejemplares, ejemplaresPrestados, ejemplaresRestantes, fechaAltaLibro, fechaBajaLibro);
        Optional<Libro> respuesta = libroRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Libro libro = respuesta.get();
            libro.setTitulo(titulo);
            libro.setAnio(anio);
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(0);
            libro.setEjemplaresRestantes(libro.getEjemplares() - libro.getEjemplaresPrestados());
            libro.setActivo(activo);
            libro.setAutor(autor);
            libro.setEditorial(editorial);

            libroRepositorio.save(libro);
        } else {
            throw new ErrorServicio("No se encontro el Libro");
        }
    }

    @Transactional
    public void bajaLibro(String id) throws ErrorServicio {
        Optional<Libro> respuesta = libroRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Libro libro = respuesta.get();
            libro.setFechaBajaLibro(new Date()); //si existe el libro se le pone la fecha de baja
            libroRepositorio.save(libro);
        } else {
            throw new ErrorServicio("No se encontro el Libro");
        }
    }

    @Transactional
    public void altaLibro(String id) throws ErrorServicio {
        Optional<Libro> respuesta = libroRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Libro libro = respuesta.get();
            libro.setFechaBajaLibro(null); // si existe el libro se elimina la fecha de baja  agregar fechasAlta y fechaModificacion
            libroRepositorio.save(libro);
        } else {
            throw new ErrorServicio("No se encontro el Libro");
        }
    }
    
      @Transactional(readOnly = true)
    public Libro buscarPorId(String id) throws ErrorServicio{
        Optional<Libro> respuesta = libroRepositorio.findById(id);
         if (respuesta.isPresent()) {
            return respuesta.get();
        } else {
            throw new ErrorServicio("No se encontro el Libro");
        }
    }
    
    public List<Libro> buscarPorAutor(String nombre){
        return libroRepositorio.buscarPorAutor(nombre);
    }

    private void validarDatos(String titulo, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Date fechaAltaLibro, Date fechaBajaLibro) throws ErrorServicio {
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
        if (fechaAltaLibro == null && fechaBajaLibro == null) {
            throw new ErrorServicio("La fecha alta y la fecha baja no pueden ser ambas nulas");
        }
    }
}
