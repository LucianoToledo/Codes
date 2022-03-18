package com.libreria.controladores;

import com.libreria.entidades.Autor;
import com.libreria.entidades.Editorial;
import com.libreria.entidades.Libro;
import com.libreria.errores.ErrorServicio;
import com.libreria.repositorios.AutorRepositorio;
import com.libreria.repositorios.EditorialRepositorio;
import com.libreria.services.LibroService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequestMapping("/")
public class LibroControlador {

    @Autowired
    private LibroService libroService;

    @Autowired
    private AutorRepositorio autorRepositorio;

    @Autowired
    private EditorialRepositorio editorialRepositorio;

    @PostMapping("/agregarLibro")
    public String agregarLibro(@RequestParam String titulo, @RequestParam Integer ejemplares, String anio,  String idAutor, String idEditorial, ModelMap model) {
        System.out.println("Titulo: " + titulo);
        System.out.println("Ejemplares: " + ejemplares);
        System.out.println("Anio: " + anio);
        System.out.println("Autor: " + idAutor);
        System.out.println("Editorial: " + idEditorial);
        System.out.println("----------");
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
            
            List<Autor> autores = autorRepositorio.findAll();
            model.put("autores", autores);
            
            List<Editorial> editoriales = editorialRepositorio.findAll();
            model.put("editoriales", editoriales);
        }
        return "agregarLibro.html";
    }

    @GetMapping("/agregarLibro")
    public String agregarAutorLibro(ModelMap model) {
        
        List<Autor> autores = autorRepositorio.findAll();
        model.put("autores", autores);
        
        List<Editorial> editoriales = editorialRepositorio.findAll();
        model.put("editoriales", editoriales);
        
        return "agregarLibro.html";
    }
    
      @GetMapping("/listadoLibros")
    public String listarLibros(String id, ModelMap model) throws ErrorServicio{
        List<Libro> libros = libroService.listarLibros();
        model.put("libros", libros);
        return "listarLibros.html";
    }
    
   @GetMapping("/eliminarLibro/{id}")
    public String eliminarLibro(@PathVariable("id") String id){
        try {
            libroService.eliminarLibro(id);
        } catch (ErrorServicio ex) {
            Logger.getLogger(AutorControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "redirect:/listadoLibros";
    }
}
