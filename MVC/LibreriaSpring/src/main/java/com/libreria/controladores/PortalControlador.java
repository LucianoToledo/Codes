package com.libreria.controladores;

import com.libreria.entidades.Autor;
import com.libreria.entidades.Editorial;
import com.libreria.errores.ErrorServicio;
import com.libreria.services.AutorService;
import com.libreria.services.EditorialService;
import com.libreria.services.LibroService;
import java.util.logging.Level;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class PortalControlador {

    @Autowired
    private AutorService autorService;

    @Autowired
    private EditorialService editorialService;

    @Autowired
    private LibroService libroService;

    @GetMapping("/")
    public String index() {
        return "index.html";
    }

    @GetMapping("/agregarLibro")
    public String agregarLibro() {
        return "agregarLibro.html";
    }

    @GetMapping("/agregarAutor")
    public String agregarAutor() {
        return "agregarAutor.html";
    }

    @GetMapping("/agregarEditorial")
    public String agregarEditorial() {
        return "agregarEditorial.html";
    }

    @PostMapping("/agregarLibro")
    public String agregarLibro(@RequestParam String titulo, @RequestParam Integer ejemplares, @RequestParam(required = false) String anio, @RequestParam(required = false) Autor autor, @RequestParam(required = false) Editorial editorial) {
        System.out.println("Titulo: " + titulo);
        System.out.println("Ejemplares: " + ejemplares);
        System.out.println("Anio: " + anio);
        System.out.println("Autor: " + autor);
        System.out.println("Editorial: " + editorial);
        System.out.println("----------");
        return "agregarLibro.html";
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
        }
        return "agregarAutor.html";
    }

    @PostMapping("/agregarEditorial")
    public String agregarEditorial(@RequestParam String nombre, ModelMap model) {
        System.out.println("Nombre: " + nombre);
        System.out.println("----------");
        try {
            editorialService.agregarEditorial(nombre);
            model.addAttribute("exito", "Editorial cargada correctamente");
        } catch (ErrorServicio ex) {
            java.util.logging.Logger.getLogger(PortalControlador.class.getName()).log(Level.SEVERE, null, ex);
        }

        return "agregarEditorial.html";
    }

}
