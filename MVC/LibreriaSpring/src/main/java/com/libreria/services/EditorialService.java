package com.libreria.services;

import com.libreria.entidades.Editorial;
import com.libreria.entidades.Libro;
import com.libreria.errores.ErrorServicio;
import com.libreria.repositorios.EditorialRepositorio;
import com.libreria.repositorios.LibroRepositorio;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EditorialService {

    @Autowired
    private EditorialRepositorio editorialRepositorio;
    @Autowired
    private LibroRepositorio libroRepositorio;

    @Transactional(rollbackFor = {Exception.class})
    public void agregarEditorial(String nombre) throws ErrorServicio {
        validarDatos(nombre);

        Editorial editorial = new Editorial();

        editorial.setNombre(nombre);
        editorial.setAlta(true);
        editorial.setFechaAltaEditorial(new Date());
        editorial.setFechaBajaEditorial(null);

        editorialRepositorio.save(editorial);
    }

    @Transactional
    public void moficarEditorial(String id, String nombre) throws Exception {

        validarDatos(nombre);

        Optional<Editorial> respuesta = editorialRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Editorial editorial = respuesta.get();
            editorial.setNombre(nombre);
            editorialRepositorio.save(editorial);
        } else {
            throw new ErrorServicio("No se encontro el Editorial");
        }
    }

    @Transactional
    public void bajaEditorial(String id) throws ErrorServicio {
        Optional<Editorial> respuesta = editorialRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Editorial editorial = respuesta.get();
            editorial.setFechaBajaEditorial(new Date());

            editorialRepositorio.save(editorial);
        } else {
            throw new ErrorServicio("No se encontro el Editorial");
        }
    }

    @Transactional
    public void altaEditorial(String id) throws ErrorServicio {
        Optional<Editorial> respuesta = editorialRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Editorial editorial = respuesta.get();
            editorial.setFechaBajaEditorial(null);

            editorialRepositorio.save(editorial);
        } else {
            throw new ErrorServicio("No se encontro el Editorial");
        }
    }

    @Transactional(readOnly = true)
    public Editorial buscarPorId(String id) throws ErrorServicio {
        Optional<Editorial> respuesta = editorialRepositorio.findById(id);
        if (respuesta.isPresent()) {
            return respuesta.get();
        } else {
            throw new ErrorServicio("No se encontro la Editorial");
        }
    }

    @Transactional(readOnly = true)
    public List<Editorial> listarEditoriales() {
        List<Editorial> editoriales = editorialRepositorio.findAll();
        return editoriales;
    }

    @Transactional(readOnly = true)
    public Editorial buscarPorNombre(String nombre) throws ErrorServicio {
        Editorial editorial = editorialRepositorio.buscarPorNombre(nombre);
        if (!(editorial == null)) {
            return editorial;
        } else {
            throw new ErrorServicio("No se encontro la Editorial");
        }
    }

    @Transactional(rollbackFor = {Exception.class})
    public void eliminarEditorial(String id) throws ErrorServicio {
        Optional<Editorial> respuestaEditorial = editorialRepositorio.findById(id);
        List<Libro> respuestaLibro = libroRepositorio.buscarPorIdEditorial(respuestaEditorial.get().getId());
        if (respuestaEditorial.isPresent()) {
            if (!respuestaLibro.isEmpty()) {
                String errorMessage = "La editorial ''" + respuestaEditorial.get().getNombre() + "'' tiene asignado los siguientes libros: \n";
                for (Libro libro : respuestaLibro) {
                    errorMessage += "''" + libro.getTitulo() + "'' \n"; //validar que si es el ultimo libro no muestre el espacio en el mensaje
                }
                throw new ErrorServicio(errorMessage);
            }
            editorialRepositorio.deleteById(respuestaEditorial.get().getId());
        } else {
            throw new ErrorServicio("No se encontro la Editorial");
        }
    }

    public void validarDatos(String nombre) throws ErrorServicio {
        if (nombre == null || nombre.isEmpty()) {
            throw new ErrorServicio("El nombre de la editorial no puede ser nulo");
        }

//        if (fechaAltaLibro == null && fechaBajaLibro == null) {
//            throw new ErrorServicio("La fecha alta y la fecha baja no pueden ser ambas nulas");
//        }
    }

}
