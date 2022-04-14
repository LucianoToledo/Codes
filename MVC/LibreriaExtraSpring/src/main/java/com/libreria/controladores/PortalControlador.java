package com.libreria.controladores;

import com.libreria.entidades.Autor;
import com.libreria.entidades.Editorial;
import com.libreria.errores.ErrorServicio;
import com.libreria.services.AutorService;
import com.libreria.services.EditorialService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/")
public class PortalControlador {

    @Autowired
    private AutorService autorService;

    @Autowired
    private EditorialService editorialService;

    @GetMapping("/")
    public String index(ModelMap model, RedirectAttributes attr) throws ErrorServicio {

        List<Autor> autores = autorService.listarAutores();
        model.put("autores", autores);

        List<Editorial> editoriales = editorialService.listarEditoriales();
        model.put("editoriales", editoriales);
        
        return "index.html";
    }
}
