package com.libreria.controladores;

import com.libreria.entidades.Editorial;
import com.libreria.errores.ErrorServicio;
import com.libreria.services.EditorialService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class EditorialControlador {

    @Autowired
    private EditorialService editorialService;

    @GetMapping("/agregarEditorial")
    public String agregarEditorial() {
        return "agregarEditorial.html";
    }

    @PostMapping("/agregarEditorial")
    public String agregarEditorial(@RequestParam String nombre, ModelMap model) {
        System.out.println("Nombre: " + nombre);
        System.out.println("----------");
        try {
            editorialService.agregarEditorial(nombre);
            model.addAttribute("exito", "Editorial cargada correctamente");
        } catch (ErrorServicio ex) {
            model.put("error", ex.getMessage());
            java.util.logging.Logger.getLogger(PortalControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "agregarEditorial.html";
    }
    
    @GetMapping("/listadoEditoriales")
    public String listarEditoriales(String id, ModelMap model){
        List<Editorial> editoriales = editorialService.listarEditoriales();
        model.put("editoriales", editoriales);
        return "listarEditoriales.html";
    }
    
    @GetMapping("/eliminarEditorial/{id}")
    public String eliminarAutor(@PathVariable("id") String id){
        try {
            editorialService.eliminarEditorial(id);
        } catch (ErrorServicio ex) {
            Logger.getLogger(AutorControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "redirect:/listadoEditoriales";
    }
    
}
