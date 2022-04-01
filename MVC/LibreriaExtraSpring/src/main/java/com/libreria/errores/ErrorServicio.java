package com.libreria.errores;

public class ErrorServicio extends Exception{ 
    
//    Se crea la clase ErrorServicio para diferenciar los errores de nuestra logica
//    de negocio de los que ocurren en el sistema

    public ErrorServicio(String msm){
        super(msm);
    }
    
}
