package com.libreria.controladores;

import com.libreria.errores.ErrorServicio;
import com.libreria.services.EditorialService;
import java.util.logging.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
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
}
