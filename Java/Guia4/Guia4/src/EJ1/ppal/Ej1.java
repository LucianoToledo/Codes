/*1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de 
dos  clases.  Perro,  que  tendrá  como  atributos:  nombre,  raza,  edad  y  tamaño;  y  la  clase 
Persona con atributos: nombre, apellido, edad, documento y Perro. 
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener 
que  pensar  la  lógica  necesaria  para  asignarle  a  cada  Persona  un  Perro  y  por  ultimo, 
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package Ej1.ppal;

import EJ1.entidades.Perro;
import EJ1.entidades.PerroServicio;
import EJ1.entidades.Persona;
import EJ1.entidades.PersonaServicio;
import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useDelimiter("\n");
        PersonaServicio personaServicio = new PersonaServicio();
        PerroServicio perroServicio = new PerroServicio();

        String opc, opc1;
        do {
            System.out.println("Desea agregar una persona? S/N");
            opc = input.next();
            if (opc.equalsIgnoreCase("s")) {
                Persona persona = personaServicio.crearPersona();
                personaServicio.agregarPersona(persona);
                System.out.println(persona.getNombre() + " Tiene perro?  S/N");
                opc1 = input.next();
                if (opc1.equalsIgnoreCase("n")) {
                    Perro perro = perroServicio.crearPerro();
                    perroServicio.agregarPerro(perro);
                    personaServicio.asignarPerro(persona, perro);
                }

            } else if (!(opc.equalsIgnoreCase("n"))) {
                System.out.println("Opcion no valida");
            }
        } while (!"n".equalsIgnoreCase(opc));

        personaServicio.mostrarPersonas();
    }
}
