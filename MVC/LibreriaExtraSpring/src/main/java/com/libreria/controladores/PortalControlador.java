package com.libreria.controladores;

import com.libreria.entidades.Autor;
import com.libreria.entidades.Editorial;
import com.libreria.errores.ErrorServicio;
import com.libreria.services.AutorService;
import com.libreria.services.ClienteService;
import com.libreria.services.EditorialService;
import java.util.List;
import java.util.logging.Level;
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
@RequestMapping("/")
public class PortalControlador {

    @Autowired
    private AutorService autorService;

    @Autowired
    private EditorialService editorialService;

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/")
    public String index(ModelMap model, RedirectAttributes attr) throws ErrorServicio {

        List<Autor> autores = autorService.listarAutores();
        model.put("autores", autores);

        List<Editorial> editoriales = editorialService.listarEditoriales();
        model.put("editoriales", editoriales);

        return "index.html";
    }

    @GetMapping("/registro")
    public String registro() {
        return "registro.html";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam String nombre, @RequestParam String apellido, @RequestParam String telefono, @RequestParam String email, @RequestParam String password, @RequestParam String confirmarPassword, RedirectAttributes attr) {

        System.out.println("nombre " + nombre + " \n"
                + "apellido " + apellido + " \n"
                + "telefono " + telefono + " \n"
                + "email " + email + " \n"
                + "pass " + password + "\n"
                + "confirmar pass " + confirmarPassword);
        try {
            clienteService.agregarCliente(nombre, apellido, telefono, email, password, confirmarPassword);
            attr.addFlashAttribute("exito", "Cliente cargado correctamente");
        } catch (ErrorServicio ex) {
            java.util.logging.Logger.getLogger(PortalControlador.class.getName()).log(Level.SEVERE, null, ex);
            attr.addFlashAttribute("error", ex.getMessage());
        }
        return "redirect:/cliente/listarClientes";
    }

    @GetMapping("/login")
    public String login(@RequestParam(required = false) String error, @RequestParam(required = false) String logout, ModelMap model) {

        if (error != null) {
            model.put("error", "Usuario o Clave incorrectos >:(");
        }

        if (logout != null) {
            model.put("logout", "Has cerrado sesión exitosamente :)");
        }
        return "login.html";
    }

}
