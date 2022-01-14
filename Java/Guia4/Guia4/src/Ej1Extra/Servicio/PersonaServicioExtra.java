package Ej1Extra.Servicio;

import Ej1Extra.Entidades.PerroExtra;
import Ej1Extra.Entidades.PersonaExtra;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonaServicioExtra {

    private Scanner input;
    private ArrayList<PersonaExtra> personas;

    public PersonaServicioExtra() {
        input = new Scanner(System.in).useDelimiter("\n");
        personas = new ArrayList<>();
    }

    public PersonaExtra crearPersona() {
        System.out.println("Ingrese nombre");
        String nom = input.next();
        System.out.println("Ingrese Apellido");
        String ape = input.next();
        System.out.println("Ingrese Edad");
        int edad = input.nextInt();
        System.out.println("Ingrese DNI");
        int dni = input.nextInt();

        return new PersonaExtra(nom, ape, edad, dni);
    }

    public void agregarPersona(PersonaExtra p) {
        personas.add(p);
    }

    public PersonaExtra seleccionarPersona() {
        for (PersonaExtra aux : personas) {
            System.out.println(aux);
        }
        System.out.println("Ingrese nombre de la persona");
        String nom = input.next();

        for (PersonaExtra aux : personas) {
            if (nom.equalsIgnoreCase(aux.getNombre())) {
                return aux;
            } else {
                System.out.println("No se encontro a la persona");
            }
        }
        return null;
    }

    public void asignarPerro(PersonaExtra pers, PerroExtra e) {
        pers.setPerro(e);
    }

    public void mostrarPersonas() {
        System.out.println("------------------");
        for (PersonaExtra aux : personas) {
            System.out.println(aux);
        }
    }
}
