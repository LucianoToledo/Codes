package EJ1.entidades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;

public class PersonaServicio {

    private Scanner input;
    private ArrayList<Persona> personas;

    public PersonaServicio() {
        input = new Scanner(System.in).useDelimiter("\n");
        personas = new ArrayList<>();
    }

    public Persona crearPersona() {
        System.out.println("Ingrese nombre");
        String nom = input.next();
        System.out.println("Ingrese Apellido");
        String ape = input.next();
        System.out.println("Ingrese Edad");
        int edad = input.nextInt();
        System.out.println("Ingrese DNI");
        int dni = input.nextInt();

        return new Persona(nom, ape, edad, dni);
    }

    public void agregarPersona(Persona p) {
        personas.add(p);
    }

    public void asignarPerro(Persona pers, Perro e) {
        pers.setPerro(e);
    }

    public void mostrarPersonas() {
        for (Persona aux : personas) {
            System.out.println(aux);
        }
    }
}
