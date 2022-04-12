package com.libreria.controladores;

import com.libreria.entidades.Cliente;
import com.libreria.errores.ErrorServicio;
import com.libreria.services.ClienteService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/cliente")
public class ClienteControlador {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/agregarCliente")
    public String agregarCliente(HttpServletRequest request) {
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;
    }

    @PostMapping("/agregarCliente")
    public String agregarCliente(RedirectAttributes attr, @RequestParam String nombre, @RequestParam String apellido, @RequestParam(required = false) String telefono, ModelMap model, HttpServletRequest request) {
        String referer = request.getHeader("Referer");
        try {
            clienteService.agregarCliente(nombre, apellido, telefono);
            attr.addFlashAttribute("exito", "Cliente cargado correctamente");

        } catch (ErrorServicio ex) {
            java.util.logging.Logger.getLogger(PortalControlador.class.getName()).log(Level.SEVERE, null, ex);
            attr.addFlashAttribute("error", ex.getMessage());
        }
        return "redirect:" + referer;
    }

    @GetMapping("/listarClientes")
    public String listarClientes(String id, ModelMap model) throws ErrorServicio {
        List<Cliente> clientes = clienteService.listarClientes();  //como se valida si vuelve nulo??
        model.put("clientes", clientes);
        return "cliente.html";
    }

    @GetMapping("/eliminarCliente/{id}")
    public String eliminarCliente(@PathVariable("id") String id, RedirectAttributes attr, HttpServletRequest request) {
        String referer = request.getHeader("Referer");
        try {
            clienteService.eliminarCliente(id);
            attr.addFlashAttribute("exito", "Cliente eliminado correctamente");
            return "redirect:/cliente";
        } catch (ErrorServicio ex) {
            Logger.getLogger(ClienteControlador.class.getName()).log(Level.SEVERE, null, ex);
            attr.addFlashAttribute("error", ex.getMessage());
        }
        //return getPreviousPageByRequest(request);
        return "redirect:" + referer;
    }

    @GetMapping("/bajaCliente/{id}")
    public String bajaCliente(@PathVariable("id") String id, RedirectAttributes attr, HttpServletRequest request) {
        String referer = request.getHeader("Referer");
        try {
            clienteService.bajaCliente(id);
            attr.addFlashAttribute("exito", "Cliente dado de baja");
        } catch (ErrorServicio ex) {
            Logger.getLogger(ClienteControlador.class.getName()).log(Level.SEVERE, null, ex);
            attr.addFlashAttribute("error", ex.getMessage());
        }
        return "redirect:" + referer;
    }

    @GetMapping("/altaCliente/{id}")
    public String altaCliente(@PathVariable("id") String id, RedirectAttributes attr, HttpServletRequest request) {
        String referer = request.getHeader("Referer");
        try {
            clienteService.altaCliente(id);
            attr.addFlashAttribute("exito", "Cliente dado de alta");
        } catch (ErrorServicio ex) {
            Logger.getLogger(ClienteControlador.class.getName()).log(Level.SEVERE, null, ex);
            attr.addFlashAttribute("error", ex.getMessage());
        }
        return "redirect:" + referer;
    }

    @GetMapping("/editarCliente/{id}")
    public String editarCliente(@PathVariable("id") String id, ModelMap model) {

        Cliente cliente = new Cliente();
        try {
            cliente = clienteService.buscarPorId(id);
            model.put("cliente", cliente);
        } catch (ErrorServicio ex) {
            Logger.getLogger(ClienteControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "modificar-cliente.html";
    }

//    @PostMapping("/editarCliente")
//    public String editarCliente(@RequestParam String id, @RequestParam(required = false) String nombre, @RequestParam(required = false) String apellido, RedirectAttributes attr) throws Exception {
//
//        try {
//            clienteService.modificarCliente(id, nombre, apellido);
//
//        } catch (ErrorServicio ex) {
//            Logger.getLogger(ClienteControlador.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return "redirect:/listadoClientees";
//    }
}
