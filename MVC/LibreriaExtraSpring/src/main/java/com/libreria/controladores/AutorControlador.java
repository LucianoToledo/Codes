package com.libreria.controladores;

import com.libreria.entidades.Autor;
import com.libreria.errores.ErrorServicio;
import com.libreria.services.AutorService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/")
public class AutorControlador {

    @Autowired
    private AutorService autorService;

    @GetMapping("/agregarAutor")
    public String agregarAutor() {

        return "agregarAutor.html";
    }

    @PostMapping("/agregarAutor")
    public String agregarAutor(@RequestParam String nombre, @RequestParam String apellido, ModelMap model) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("----------");

        try {
            autorService.agregarAutor(nombre, apellido);
            model.addAttribute("exito", "Autor cargado correctamente");
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(PortalControlador.class.getName()).log(Level.SEVERE, null, ex);
            model.put("error", ex.getMessage());
            model.put("nombre", nombre);
            model.put("apellido", apellido);
        }
        return "agregarAutor.html";
    }

    @GetMapping("/listadoAutores")
    public String listarAutores(String id, ModelMap model) throws ErrorServicio {
        List<Autor> autores = autorService.listarAutores();  //como se valida si vuelve nulo??
        model.put("autores", autores);
        return "listarAutores.html";
    }

    @GetMapping("/eliminarAutor/{id}")
    public String eliminarAutor(@PathVariable("id") String id, RedirectAttributes attr) {
        try {
            autorService.eliminarAutor(id);
            attr.addFlashAttribute("exito", "Autor eliminado correctamente");
        } catch (ErrorServicio ex) {
            Logger.getLogger(AutorControlador.class.getName()).log(Level.SEVERE, null, ex);
            attr.addFlashAttribute("error", ex.getMessage());
        }
        return "redirect:/listadoAutores";
    }
    
    @GetMapping("/bajaAutor/{id}")
    public String bajaAutor(@PathVariable("id") String id, RedirectAttributes attr) {
        try {
            autorService.bajaAutor(id);
            attr.addFlashAttribute("exito", "Autor dado de baja");
        } catch (ErrorServicio ex) {
            Logger.getLogger(AutorControlador.class.getName()).log(Level.SEVERE, null, ex);
            attr.addFlashAttribute("error", ex.getMessage());
        }
        return "redirect:/listadoAutores";
    }
    
    @GetMapping("/altaAutor/{id}")
    public String altaAutor(@PathVariable("id") String id, RedirectAttributes attr) {
        try {
            autorService.altaAutor(id);
            attr.addFlashAttribute("exito", "Autor dado de alta");
        } catch (ErrorServicio ex) {
            Logger.getLogger(AutorControlador.class.getName()).log(Level.SEVERE, null, ex);
            attr.addFlashAttribute("error", ex.getMessage());
        }
        return "redirect:/listadoAutores";
    }

    @GetMapping("/editarAutor/{id}")
    public String editarAutor(@PathVariable("id") String id, ModelMap model) {

            Autor autor = new Autor();
        try {
            autor = autorService.buscarPorId(id);
            model.put("autor", autor);
        } catch (ErrorServicio ex) {
            Logger.getLogger(AutorControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "modificar-autor.html";
    }
    @PostMapping("/editarAutor")
    public String editarAutor(@RequestParam String id, @RequestParam(required = false) String nombre, @RequestParam(required = false)  String apellido, RedirectAttributes attr) throws Exception {

        try {
            autorService.modificarAutor(id, nombre, apellido);

        } catch (ErrorServicio ex) {
            Logger.getLogger(AutorControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "redirect:/listadoAutores";
    }
}
