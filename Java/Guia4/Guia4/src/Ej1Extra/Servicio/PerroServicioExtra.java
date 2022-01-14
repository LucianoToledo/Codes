//1. Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa
//va a tener que contar con muchas personas y muchos perros. El programa deberá
//preguntarle a cada persona, que perro según su nombre, quiere adoptar. Dos personas
//no pueden adoptar al mismo perro, si la persona eligió un perro que ya estaba adoptado,
//se le debe informar a la persona.
//Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
//personas con sus respectivos perros.
package Ej1Extra.Servicio;

import Ej1Extra.Entidades.PerroExtra;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PerroServicioExtra {

    private Scanner input;
    private HashMap<String, PerroExtra> perros;
    private HashMap<String, PerroExtra> perrosAdopados;

    public PerroServicioExtra() {
        input = new Scanner(System.in).useDelimiter("\n");
        perros = new HashMap<>();
        perrosAdopados = new HashMap();
    }

    public PerroExtra crearPerro() {
        System.out.println("Ingrese nombre del perro");
        String nom = input.next();
        System.out.println("Ingrese raza del perro");
        String raza = input.next();
        System.out.println("Ingrese edad del perro");
        int edad = input.nextInt();
        System.out.println("Ingrese tamanio del perro");
        int tamanio = input.nextInt();
        return new PerroExtra(nom, raza, edad, tamanio);
    }

    public void agregarPerro(PerroExtra e) {
        perros.put(e.getNombre(), e);
    }

    public PerroExtra seleccionarPerro() {
        mostrarPerros();
        System.out.println("Seleccione perro");
        String opc = input.next();

        PerroExtra e = new PerroExtra();
        boolean band = false;

        for (Map.Entry<String, PerroExtra> entry : perros.entrySet()) {
            String key = entry.getKey();
            PerroExtra value = entry.getValue();
            if (opc.equalsIgnoreCase(key)) {
                e = value;
                band = true;
                break;
            }
        }

        if (band) {
            perrosAdopados.put(e.getNombre(), e);
            perros.remove(e.getNombre());
        }else{
            System.out.println("No se encontro el perro");
            return null;
        }
        return e;
    }

    public void mostrarPerros() {
        System.out.println("------------------");
        System.out.println("Perros NO adopados");
        for (Map.Entry<String, PerroExtra> entry : perros.entrySet()) {
            String key = entry.getKey();
            PerroExtra value = entry.getValue();
            System.out.println(value);
        }
    }

    public void mostrarPerrosAdoptados() {
        System.out.println("------------------");
        System.out.println("Perros ADOPTADOS");
        for (Map.Entry<String, PerroExtra> entry : perrosAdopados.entrySet()) {
            String key = entry.getKey();
            PerroExtra value = entry.getValue();
            System.out.println(value);
        }
    }
}
