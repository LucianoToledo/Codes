package Ej3.servicio;

import Ej3.entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CartaServicio {

    private ArrayList<Carta> baraja;
    private Scanner input;
    private ArrayList<Carta> cartasMonton;

    public CartaServicio() {
        input = new Scanner(System.in).useDelimiter("\n");
        baraja = new ArrayList();
        cartasMonton = new ArrayList();
    }

    public void crearCartas() {
        String[] palos = {"Oro", "Basto", "Espada", "Copa"};
        for (String palo : palos) {
            for (int i = 1; i < 13; i++) {
                if (i != 8 && i != 9) {
                    baraja.add(new Carta(i, palo));
                }
            }
        }

    }

    public void mostrarCarta() {
        System.out.println(baraja.get(1));
    }

    public void barajar() {
        Collections.shuffle(baraja);
        System.out.println("Cartas Barajadas");
    }

    public void siguienteCarta() {
        if (baraja.size() == 0) {
            System.out.println("No hay mas cartas");
        } else {
            System.out.println(baraja.get(0));
            cartasMonton.add(baraja.get(0));
            baraja.remove(0);
        }
    }

    public void darCartas() {
        int opc;
        System.out.println("Cuantas cartas desea?");
        opc = input.nextInt();

        if (opc > baraja.size()) {
            System.out.println("Error, quedan " + baraja.size() + " cartas");
        } else {
            for (int i = 0; i < opc; i++) {
                System.out.println(baraja.get(i));
                cartasMonton.add(baraja.get(i));
                baraja.remove(i);
            }
        }
    }

    public void cartasDisponibles() {
        System.out.println("Quedan " + baraja.size() + " cartas disponibles");
    }

    public void cartasDescartadas() {
        if (cartasMonton.size() == 0) {
            System.out.println("No ha salido ninguna carta");
        } else {
            for (Carta aux : cartasMonton) {
                System.out.println(aux);
            }
        }
    }

    public void mostrarBaraja() {
        for (Carta aux : baraja) {
            System.out.println(aux);
        }
    }

}
