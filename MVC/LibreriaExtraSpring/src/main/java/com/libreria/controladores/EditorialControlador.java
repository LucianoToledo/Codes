package com.libreria.controladores;

import com.libreria.entidades.Autor;
import com.libreria.entidades.Editorial;
import com.libreria.errores.ErrorServicio;
import com.libreria.services.AutorService;
import com.libreria.services.EditorialService;
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
@RequestMapping("/editorial")
public class EditorialControlador {

    @Autowired
    private EditorialService editorialService;
    @Autowired
    private AutorService autorService;

    @GetMapping("/agregarEditorial")
    public String agregarEditorial() {
        return "agregarEditorial.html";
    }

    @PostMapping("/agregarEditorial")
    public String agregarEditorial(RedirectAttributes attr, @RequestParam String nombre, ModelMap model, HttpServletRequest request) {
        String referer = request.getHeader("Referer");

        try {
            editorialService.agregarEditorial(nombre);
            attr.addFlashAttribute("exito", "Editorial cargada correctamente");
        } catch (ErrorServicio ex) {
            attr.addFlashAttribute("error", ex.getMessage());
            java.util.logging.Logger.getLogger(PortalControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "redirect:" + referer;
    }

    @GetMapping("/listarEditoriales")
    public String listarEditoriales(String id, ModelMap model) throws ErrorServicio {
        List<Autor> autores = autorService.listarAutores();  //Traigo la lista de editoriales yclientes por si quiero agregar un libro desde esta vista
        List<Editorial> editoriales = editorialService.listarEditoriales();
        model.put("editoriales", editoriales);
        model.put("autores", autores);
        return "editorial.html";
    }

    @GetMapping("/eliminarEditorial/{id}")
    public String eliminarEditorial(@PathVariable("id") String id, RedirectAttributes attr, HttpServletRequest request) {
        String referer = request.getHeader("Referer");
        try {
            editorialService.eliminarEditorial(id);
            attr.addFlashAttribute("exito", "Editorial eliminada correctamente");
        } catch (ErrorServicio ex) {
            Logger.getLogger(EditorialControlador.class.getName()).log(Level.SEVERE, null, ex);
            attr.addFlashAttribute("error", ex.getMessage());
        }
        return "redirect:" + referer;
    }

    @GetMapping("/editarEditorial/{id}")
    public String editarEditorial(@PathVariable("id") String id, ModelMap model) {

        Editorial editorial = new Editorial();
        try {
            editorial = editorialService.buscarPorId(id);
            model.put("editorial", editorial);
        } catch (ErrorServicio ex) {
            Logger.getLogger(EditorialControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "modificar-editorial.html";
    }

    @PostMapping("/editarEditorial")
    public String editarEditorial(@RequestParam String id, @RequestParam(required = false) String nombre, RedirectAttributes attr) throws Exception {
        try {
            editorialService.modificarEditorial(id, nombre);
        } catch (ErrorServicio ex) {
            Logger.getLogger(EditorialControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "redirect:/listadoEditoriales";
    }

    @GetMapping("/bajaEditorial/{id}")
    public String bajaEditorial(@PathVariable("id") String id, RedirectAttributes attr) {
        try {
            editorialService.bajaEditorial(id);
            attr.addFlashAttribute("exito", "Editorial dada de baja");
        } catch (ErrorServicio ex) {
            Logger.getLogger(EditorialControlador.class.getName()).log(Level.SEVERE, null, ex);
            attr.addFlashAttribute("error", ex.getMessage());
        }
        return "redirect:/listadoEditoriales";
    }

    @GetMapping("/altaEditorial/{id}")
    public String altaEditorial(@PathVariable("id") String id, RedirectAttributes attr) {
        try {
            editorialService.altaEditorial(id);
            attr.addFlashAttribute("exito", "Editorial dado de alta");
        } catch (ErrorServicio ex) {
            Logger.getLogger(EditorialControlador.class.getName()).log(Level.SEVERE, null, ex);
            attr.addFlashAttribute("error", ex.getMessage());
        }
        return "redirect:/listadoEditoriales";
    }
}
