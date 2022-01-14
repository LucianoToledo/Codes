// 1. Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar
//de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el
//código con una cláusula try-catch para probar la nueva excepción que debe ser
//controlada
package Ej1.main;

import Ej1.Entidades.Persona;

public class EJ1 {

    public static void main(String[] args) {

        //Persona p = new Persona("Lucho", "Tole", 22);
        Persona p = null;
        try {
            p.esMayorDeEdad();

        } catch (NullPointerException e) {
            System.out.println("El objeto no se ha inicializado");
            System.out.println(e.getMessage());
        }
    }
}
