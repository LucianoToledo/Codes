package Ej2Extra;

import Ej2Extra.Entidades.Cine;
import Ej2Extra.Entidades.Espectador;
import Ej2Extra.Entidades.Pelicula;
import Ej2Extra.Entidades.Sala;
import Ej2Extra.servicio.CineServicio;
import Ej2Extra.servicio.EspectadorServicio;
import Ej2Extra.servicio.PeliculaServicio;
import Ej2Extra.servicio.SalaServicio;
import java.util.Scanner;

public class Ej2ExtraPpal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useDelimiter("\n");

        CineServicio cS = new CineServicio();
        PeliculaServicio pS = new PeliculaServicio();
        EspectadorServicio eS = new EspectadorServicio();
        SalaServicio sS = new SalaServicio();
        Pelicula pelicula = pS.crearPelicula();
        Sala sala = sS.crearSala();
        Cine cine = cS.crearCine(pelicula, sala);
        String opc;
        do {
            System.out.println("Desea ingresar espectador? S/N");
            opc = input.next();
            if (opc.equalsIgnoreCase("s")) {
                Espectador espectador = eS.crearEspectador();
                sS.agrearEspectador(espectador, sala, pelicula);
                sS.mostrarSala(sala);
            } else if (!opc.equalsIgnoreCase("n")) {
                System.out.println("Opcion no valida");
            }
        } while (!opc.equalsIgnoreCase("n"));

        sS.mostrarSala(sala);

    }

}
