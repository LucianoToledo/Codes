package Ej2.entidades;

import EJ1.entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    private ArrayList<Jugador> jugadores;
    private Revolver revolver;
    private Scanner input;

    public Juego() {
        jugadores = new ArrayList();
        revolver = new Revolver();
        input = new Scanner(System.in);
    }

    public void llenarJuego() {
        revolver.llenarRevolver();
        boolean band = true;
        int opc;
        do {
            System.out.println("Ingrese de 1 a 6 jugadores");
            opc = input.nextInt();
            if (opc > 6 || opc < 1) {
                System.out.println("Cantidad no valida, ingrese nuevamente");
            } else {
                band = false;
            }
        } while (band);
        for (int i = 0; i < opc; i++) {
            Jugador j = new Jugador(i + 1);
            jugadores.add(j);
        }
    }

    public void ronda() {
        int i = 0;
        boolean band = false;
        do {
            for (Jugador aux : jugadores) {
                aux.disparo(revolver);
                System.out.println(aux + "" + revolver);
                if (aux.isMojado()) {
                    System.out.println("***" + aux.getNombre() + " Se ha disparado *** ");
                    band = true;
                    break;
                } else {

                    i++;
                }
            }
        } while (!band);
    }


    public void mostrarJugadores() {
        jugadores.forEach((aux) -> System.out.println(aux + "" + revolver));
    }
}
