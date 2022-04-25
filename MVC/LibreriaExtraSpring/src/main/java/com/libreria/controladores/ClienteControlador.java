package com.libreria.controladores;

import com.libreria.entidades.Autor;
import com.libreria.entidades.Cliente;
import com.libreria.entidades.Editorial;
import com.libreria.errores.ErrorServicio;
import com.libreria.services.AutorService;
import com.libreria.services.ClienteService;
import com.libreria.services.EditorialService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
    @Autowired
    private AutorService autorService;
    @Autowired
    private EditorialService editorialService;
    
    @GetMapping("/agregarCliente")
    public String agregarCliente(HttpServletRequest request) {
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;
    }

    @PostMapping("/agregarCliente")
    public String agregarCliente(@RequestParam String nombre, @RequestParam String apellido, @RequestParam String telefono, @RequestParam String email, @RequestParam String password, @RequestParam String confirmarPassword, HttpServletRequest request, RedirectAttributes attr) {
        String referer = request.getHeader("Referer");
        try {
            clienteService.agregarCliente(nombre, apellido, telefono, email, password, confirmarPassword);
            attr.addFlashAttribute("exito", "Cliente cargado correctamente");
        } catch (ErrorServicio ex) {
            java.util.logging.Logger.getLogger(PortalControlador.class.getName()).log(Level.SEVERE, null, ex);
            attr.addFlashAttribute("error", ex.getMessage());
        }
        return "redirect:" + referer;
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @GetMapping("/listarClientes")
    public String listarClientes(String id, ModelMap model) throws ErrorServicio {
        List<Cliente> clientes = clienteService.listarClientes();
        List<Autor> autores = autorService.listarAutores();  //Traigo la lista de editoriales yclientes por si quiero agregar un libro desde esta vista
        List<Editorial> editoriales = editorialService.listarEditoriales();
        model.put("editoriales", editoriales);
        model.put("autores", autores);
        model.put("clientes", clientes);
        return "cliente.html";
    }

    @GetMapping("/eliminarCliente/{id}")
    public String eliminarCliente(@PathVariable("id") String id, RedirectAttributes attr, HttpServletRequest request) {
        String referer = request.getHeader("Referer");
        try {
            clienteService.eliminarCliente(id);
            attr.addFlashAttribute("exito", "Cliente eliminado correctamente");
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
