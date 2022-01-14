package Ej2Extra.servicio;

import Ej2Extra.Entidades.Espectador;
import java.util.Scanner;

public class EspectadorServicio {

    private Scanner input;

    public EspectadorServicio() {
        input = new Scanner(System.in).useDelimiter("\n");
    }

    public Espectador crearEspectador() {
        System.out.println("Ingrese nombre del espectador");
        String nom = input.next();
        System.out.println("Ingrese edad de " + nom);
        int edad = input.nextInt();
        System.out.println("Ingrese dinero de " + nom);
        double dinero = input.nextDouble();

        return new Espectador(nom, edad, dinero);
    }
}
