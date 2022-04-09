package com.libreria.controladores;

import com.libreria.entidades.Autor;
import com.libreria.entidades.Editorial;
import com.libreria.entidades.Libro;
import com.libreria.errores.ErrorServicio;
import com.libreria.services.AutorService;
import com.libreria.services.EditorialService;
import com.libreria.services.LibroService;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/libro")
public class LibroControlador {

    @Autowired
    private LibroService libroService;

    @Autowired
    private AutorService autorService;

    @Autowired
    private EditorialService editorialService;

    @PostMapping("/agregarLibro")
    public String agregarLibro(@RequestParam String titulo, @RequestParam Integer ejemplares, @RequestParam String anio,@RequestParam String idAutor, @RequestParam String idEditorial, ModelMap model, HttpServletRequest request) throws ErrorServicio {
    String referer = request.getHeader("Referer");
        try {
            libroService.agregarLibro(titulo, anio, ejemplares, idAutor, idEditorial);
            model.addAttribute("exito", "Libro cargado correctamente");
        } catch (ErrorServicio ex) {
            Logger.getLogger(LibroControlador.class.getName()).log(Level.SEVERE, null, ex);
            model.put("error", ex.getMessage());
            model.put("titulo", titulo);
            model.put("anio", anio);
            model.put("ejemplares", ejemplares);
            model.put("idAutor", idAutor);
            model.put("idEditorial", idEditorial);

            List<Autor> autores = autorService.listarAutores();
            model.put("autores", autores);

            List<Editorial> editoriales = editorialService.listarEditoriales();
            model.put("editoriales", editoriales);
        }
        return "redirect:" + referer;
    }

    @GetMapping("/agregarLibro")
    public String agregarAutorLibro(ModelMap model) throws ErrorServicio {

        List<Autor> autores = autorService.listarAutores();
        model.put("autores", autores);

        List<Editorial> editoriales = editorialService.listarEditoriales();
        model.put("editoriales", editoriales);

        return "agregarLibro.html";
    }

    @GetMapping("/eliminarLibro/{id}")
    public String eliminarLibro(@PathVariable("id") String id) {
        try {
            libroService.eliminarLibro(id);
        } catch (ErrorServicio ex) {
            Logger.getLogger(AutorControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "redirect:/listadoLibros";
    }

    @GetMapping("/prestamoLibro")
    public String prestamoLibro() {
        return "prestamo-libro.html";
    }

    @GetMapping("/listarLibros")
    public String listarLibros(String id, ModelMap model, @RequestParam(required = false) String query) throws ErrorServicio {
//        List<Libro> libros = new ArrayList();
//        
//        if (query == null) {
//            libros = libroService.listarLibros();
//        } else {
//            libros = libroService.buscarPor(query);
//        }
        List<Libro> libros = libroService.listarLibros();
        model.put("libros", libros);
        return "libro.html";
    }

    @GetMapping("/prestamoLibros")
    public String buscarPor(ModelMap model, @RequestParam(required = false) String query) throws ErrorServicio {
        List<Libro> libros = new ArrayList();

        if (query == null) {
            libros = libroService.listarLibros();
        } else {
            libros = libroService.buscarPor(query);
        }
        model.put("libros", libros);
        return "prestamo-libro.html";
    }

    @GetMapping("/editarLibro/{id}")
    public String editarLibro(@PathVariable("id") String id, ModelMap model) {

        Libro libro = new Libro();
        try {
            libro = libroService.buscarPorId(id);
            List<Autor> autores = autorService.listarAutores();
            List<Editorial> editoriales = editorialService.listarEditoriales();

            model.put("autores", autores);
            model.put("editoriales", editoriales);
            model.put("libro", libro);

        } catch (ErrorServicio ex) {
            Logger.getLogger(AutorControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "modificar-libro.html";
    }

    @PostMapping("/editarLibro")
    public String editarLibro(@RequestParam String id, @RequestParam(required = false) String titulo, @RequestParam(required = false) Integer ejemplares, @RequestParam(required = false) String anio, @RequestParam(required = false) String idAutor, @RequestParam(required = false) String idEditorial, ModelMap model) throws Exception {
        try {
            libroService.modificarLibro(id, titulo, anio, ejemplares, idAutor, idEditorial);
            model.addAttribute("exito", "Libro editado correctamente");
        } catch (ErrorServicio ex) {
            Logger.getLogger(AutorControlador.class.getName()).log(Level.SEVERE, null, ex);
            model.addAttribute("error", "Error inesperado");
        }
        return "redirect:/listadoLibros";

    }
      @GetMapping("/bajaLibro/{id}")
    public String bajaLibro(@PathVariable("id") String id, RedirectAttributes attr) {
        try {
            libroService.bajaLibro(id);
            attr.addFlashAttribute("exito", "Libro dado de baja");
        } catch (ErrorServicio ex) {
            Logger.getLogger(AutorControlador.class.getName()).log(Level.SEVERE, null, ex);
            attr.addFlashAttribute("error", ex.getMessage());
        }
        return "redirect:/listadoLibros";
    }
    
    @GetMapping("/altaLibro/{id}")
    public String altaLibro(@PathVariable("id") String id, RedirectAttributes attr) {
        try {
            libroService.altaLibro(id);
            attr.addFlashAttribute("exito", "Libro dado de alta");
        } catch (ErrorServicio ex) {
            Logger.getLogger(AutorControlador.class.getName()).log(Level.SEVERE, null, ex);
            attr.addFlashAttribute("error", ex.getMessage());
        }
        return "redirect:/listadoLibros";
    }
}
