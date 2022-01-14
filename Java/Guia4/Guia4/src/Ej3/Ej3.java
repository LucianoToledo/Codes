package Ej3;

import Ej3.entidades.Carta;
import Ej3.servicio.CartaServicio;
import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        CartaServicio cs = new CartaServicio();
        cs.crearCartas();
        int opc;
        do {
            System.out.println("MENU\n"
                    + "1- Barajar\n"
                    + "2- Mostrar Carta\n"
                    + "3- Cartas Disponibles\n"
                    + "4- Dar Cartas\n"
                    + "5- Cartas Descartadas\n"
                    + "6- Mostrar Baraja\n"
                    + "7- Salir");
            opc = input.nextInt();

            switch (opc) {
                case 1:
                    cs.barajar();
                    break;
                case 2:
                    cs.siguienteCarta();
                    break;
                case 3:
                    cs.cartasDisponibles();
                    break;
                case 4:
                    cs.darCartas();
                    break;
                case 5:
                    cs.cartasDescartadas();
                    break;
                case 6:
                    cs.mostrarBaraja();
                    break;
                default:
                    if (opc != 7) {
                        System.out.println("Opcion no valida, ingrese nuevamente:");
                    }
            }
        } while (opc != 7);

    }
}
