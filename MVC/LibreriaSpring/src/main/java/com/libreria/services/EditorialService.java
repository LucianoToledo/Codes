package com.libreria.services;

import com.libreria.entidades.Editorial;
import com.libreria.errores.ErrorServicio;
import com.libreria.repositorios.EditorialRepositorio;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EditorialService {

    @Autowired
    private EditorialRepositorio editorialRepositorio;

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

    public void validarDatos(String nombre) throws ErrorServicio {
        if (nombre == null || nombre.isEmpty()) {
            throw new ErrorServicio("El nombre de la editorial no puede ser nulo");
        }

//        if (fechaAltaLibro == null && fechaBajaLibro == null) {
//            throw new ErrorServicio("La fecha alta y la fecha baja no pueden ser ambas nulas");
//        }
    }

}
