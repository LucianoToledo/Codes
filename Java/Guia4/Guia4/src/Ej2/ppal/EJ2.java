
package Ej2.ppal;

import Ej2.entidades.Juego;

public class EJ2 {

    public static void main(String[] args) { 
        Juego j = new Juego();
        j.llenarJuego();
       // j.mostrarJugadores();
        System.out.println("---------------");
        j.ronda();
    }
}
