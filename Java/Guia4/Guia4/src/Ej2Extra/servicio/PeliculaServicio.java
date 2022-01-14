package Ej2Extra.servicio;

import Ej2Extra.Entidades.Pelicula;
import java.util.Scanner;

public class PeliculaServicio {

    private Scanner input;

    public PeliculaServicio() {
        input = new Scanner(System.in).useDelimiter("\n");
    }

    public Pelicula crearPelicula() {
        System.out.println("Ingrese titulo");
        String titulo = input.next();
        System.out.println("Ingrese duracion de " + titulo);
        float dur = input.nextFloat();
        System.out.println("Ingrese la edad minima de " + titulo);
        int edad = input.nextInt();
        System.out.println("Ingrese Director de " + titulo);
        String direc = input.next();

        return new Pelicula(titulo, dur, edad, direc);
    }

}
