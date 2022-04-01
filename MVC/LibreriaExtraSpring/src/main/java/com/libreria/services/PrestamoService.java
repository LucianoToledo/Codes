/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.libreria.services;

import com.libreria.entidades.Cliente;
import com.libreria.entidades.Libro;
import com.libreria.entidades.Prestamo;
import com.libreria.errores.ErrorServicio;
import com.libreria.repositorios.ClienteRepositorio;
import com.libreria.repositorios.PrestamoRepositorio;
import java.util.Date;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
class PrestamoService {

    @Autowired
    private PrestamoRepositorio prestamoRepositorio;
    @Autowired
    private LibroService libroService;
    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Transactional(rollbackFor = {Exception.class})
    public void crearPrestamo(String idLibro, String idCliente) throws ErrorServicio {

        Libro libro = libroService.buscarPorId(idLibro);
        
        Optional<Cliente> respuestaCliente = clienteRepositorio.findById(idCliente);
        Cliente cliente = respuestaCliente.get();

        validarDatos(libro, cliente);
        Prestamo prestamo = new Prestamo(true, new Date(), null, libro, cliente);
        prestamoRepositorio.save(prestamo);
    }

    @Transactional(readOnly = true)
    public Prestamo buscarPorId(String id) throws ErrorServicio {
        Optional<Prestamo> respuesta = prestamoRepositorio.findById(id);
        if (respuesta.isPresent()) {
            return respuesta.get();
        } else {
            throw new ErrorServicio("No se encontro el Libro");
        }
    }

    @Transactional(rollbackFor = {Exception.class})
    public void eliminarPrestamo(String id) throws ErrorServicio {
        Optional<Prestamo> respuesta = prestamoRepositorio.findById(id);
        if (respuesta.isPresent()) {
            prestamoRepositorio.deleteById(respuesta.get().getId());
        } else {
            throw new ErrorServicio("No se encontro el Prestamo");
        }
    }

    private void validarDatos(Libro libro, Cliente cliente) throws ErrorServicio {
        if (libro == null) {
            throw new ErrorServicio("No se encontro el Libro solicitado");
        }
        if (cliente == null) {
            throw new ErrorServicio("No se encontro el Cliente solicitado");
        }
    }

}
