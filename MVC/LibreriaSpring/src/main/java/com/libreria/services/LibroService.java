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
    private AutorService autorServicio;

    @Autowired
    private EditorialService editorialService;

    @Transactional(rollbackFor = {Exception.class})
    public void agregarLibro(String titulo, String anio, Integer ejemplares, String idAutor, String idEditorial) throws ErrorServicio {

        Autor autor = autorServicio.buscarPorId(idAutor);
        Editorial editorial = (editorialService.buscarPorId(idEditorial));

        validarDatos(titulo, ejemplares, autor, editorial);

        Libro libro = new Libro();
        libro.setTitulo(titulo);
        libro.setAnio(anio);  //validar que sea solo el año
        libro.setEjemplares(ejemplares);
        libro.setEjemplaresPrestados(0);
        libro.setEjemplaresRestantes(ejemplares);
        libro.setActivo(true);
        libro.setFechaAltaLibro(new Date());
        libro.setFechaBajaLibro(null);
        libro.setPrestamo(false);
        libro.setFechaPrestamo(null);
        libro.setFechaDevolucion(null);
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        libroRepositorio.save(libro);
    }

    @Transactional
    public void modificarLibro(String id, String titulo, String anio, Integer ejemplares, String idAutor, String idEditorial) throws ErrorServicio {

        Autor autor = autorServicio.buscarPorId(idAutor);
        Editorial editorial = (editorialService.buscarPorId(idEditorial));
        validarDatos(titulo, ejemplares, autor, editorial);

        Optional<Libro> respuesta = libroRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Libro libro = respuesta.get();
            libro.setTitulo(titulo);
            libro.setAnio(anio);

            if (ejemplares < libro.getEjemplaresPrestados()) {
                throw new ErrorServicio("No pueden haber menos ejemplares totales que los prestados \n"
                        + "Ejemplares total: " + libro.getEjemplares() + "\n"
                        + "Ejemplares prestados: " + libro.getEjemplaresPrestados() + "\n"
                        + "Ejemplares restantes: " + libro.getEjemplaresRestantes());
            } else {
                libro.setEjemplares(ejemplares);
            }

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
            if (libro.isActivo()) {
                libro.setFechaBajaLibro(new Date()); //si existe el libro se le pone la fecha de baja
                libro.setActivo(false);
                libroRepositorio.save(libro);
            } else {
                throw new ErrorServicio("El Libro ya se encuentra dado de Baja");
            }
        } else {
            throw new ErrorServicio("No se encontro el Libro");
        }
    }

    @Transactional
    public void altaLibro(String id) throws ErrorServicio {
        Optional<Libro> respuesta = libroRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Libro libro = respuesta.get();
            if (!libro.isActivo()) {
                libro.setFechaBajaLibro(null); // si existe el libro se elimina la fecha de baja  agregar fechasAlta y fechaModificacion
                libro.setFechaAltaLibro(new Date());
                libro.setActivo(true);
                libroRepositorio.save(libro);
            }else {
                throw new ErrorServicio("El Libro ya se encuentra dado de Alta");
            }
        } else {
            throw new ErrorServicio("No se encontro el Libro");
        }
    }

    @Transactional(readOnly = true)
    public Libro buscarPorId(String id) throws ErrorServicio {
        Optional<Libro> respuesta = libroRepositorio.findById(id);
        if (respuesta.isPresent()) {
            return respuesta.get();
        } else {
            throw new ErrorServicio("No se encontro el Libro");
        }
    }

    @Transactional(readOnly = true)
    public List<Libro> listarLibros() {
        List<Libro> libros = libroRepositorio.findAll();
        return libros;
    }

    @Transactional(rollbackFor = {Exception.class})
    public void eliminarLibro(String id) throws ErrorServicio {
        Optional<Libro> respuesta = libroRepositorio.findById(id);
        if (respuesta.isPresent()) {
            libroRepositorio.deleteById(respuesta.get().getId());
        } else {
            throw new ErrorServicio("No se encontro el Libro");
        }
    }

    @Transactional(readOnly = true)
    public List<Libro> buscarPor(String query) {
        return libroRepositorio.buscarPor(query);
    }

    private void validarDatos(String titulo, Integer ejemplares, Autor autor, Editorial editorial) throws ErrorServicio {
        if (titulo == null || titulo.isEmpty()) {
            throw new ErrorServicio("El nombre del titulo no puede ser nulo");
        }
        if (ejemplares == null || ejemplares < 0) {
            throw new ErrorServicio("La cantidad de ejemplares del titulo no puede ser nulo o menor a 1");
        }
        if (autor == null) {
            throw new ErrorServicio("No se encontro el autor solicitado");
        }
        if (editorial == null) {
            throw new ErrorServicio("No se encontro la editorial solicitada");
        }
    }

}
