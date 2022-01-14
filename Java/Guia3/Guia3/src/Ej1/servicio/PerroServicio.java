/*/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList
 */
package Ej1.servicio;

import Ej1.entidades.Perro;
import java.util.Iterator;

import java.util.Scanner;

public class PerroServicio {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Perro crearPerro() {
        System.out.println("Ingrese Nombre del perro");
        String nombre = input.next();
        System.out.println("Ingrese Raza de " + nombre);
        String raza = input.next();
        System.out.println("Ingrese edad de " + nombre);
        int edad = input.nextInt();
        return new Perro(raza, nombre, edad);
    }
    
    

}
