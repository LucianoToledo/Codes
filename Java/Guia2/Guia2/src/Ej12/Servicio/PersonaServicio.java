/*12. Implemente la clase Persona. Una persona tiene un nombre y una fecha de
nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los
siguientes métodos:

•
Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
21
•
Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.
•
Agregar a la clase el método menorQue(int edad) que recibe como parámetro
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario.
•
Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package Ej12.Servicio;

import Ej12.entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {

    Scanner input = new Scanner(System.in).useDelimiter("\n");
    Date fechaActual = new Date();
    
    public Persona crearPersona() {

        System.out.println("Ingrese nombre");
        String nom = input.next();

        System.out.println("Ingrese fecha de nacimiento\n"
                + "dia, mes anio");
        int dia = input.nextInt();
        int mes = input.nextInt();
        int anio = input.nextInt();

        Date fechaNac = new Date(anio - 1900, mes - 1, dia);

        return new Persona(nom, fechaNac);
    }
    
    public void calcularEdad(Persona persona){
        int edadCalculada = fechaActual.getYear()-persona.getFechaNacemiento().getYear();
        System.out.println(persona.getNombre()+" tiene "+edadCalculada+" anios\n"
                + "");
    }
    
    public boolean menorQue(Persona persona, Date fecha){ //habia que comparra con una edad, no con una fecha
        
        return persona.getFechaNacemiento().getYear()<fecha.getYear();
    }
    
    public void mostrarPersona(Persona persona){
        System.out.println("Nombre: "+persona.getNombre()+"\n"
                + "Fecha nacimiento "+persona.getFechaNacemiento());
    }
    
}
