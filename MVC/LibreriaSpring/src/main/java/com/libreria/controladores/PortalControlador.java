package com.libreria.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PortalControlador {
    
    @GetMapping("/")
    public String index(){
        return "index.html";
    }
    @GetMapping("/agregarLibro")
    public String agregarLibro(){
        return "agregarLibro.html";
    }
    
    @GetMapping("/agregarAutor")
    public String agregarAutor(){
        return "agregarAutor.html";
    }
    
    @GetMapping("/agregarEditorial")
    public String agregarEditorial(){
        return "agregarEditorial.html";
    }
        
}
