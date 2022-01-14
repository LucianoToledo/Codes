/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList
 */
package Ej1.ppal;

import Ej1.entidades.Perro;
import Ej1.servicio.PerroServicio;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Perro> razaPerros = new ArrayList();
        PerroServicio perroServicio = new PerroServicio();
        String opc;

        do {
            Perro perro = perroServicio.crearPerro();
            razaPerros.add(perro);

            System.out.println("Desea ingresar otro perro?  S/N");
            opc = input.next();
        } while (opc.equalsIgnoreCase("s"));

        //forma convencional de mostrar los datos
//        for (Perro razaPerro : razaPerros) {
//            System.out.println(razaPerro);
        //otra forma
        razaPerros.forEach((razaPerro) -> System.out.println(razaPerro));

//Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
//pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
//Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
//la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
//y se mostrará la lista ordenada

        System.out.println("Ingrese la raza del animal que quiere eliminar");
        String opc1 = input.next();

        Iterator it = razaPerros.iterator();
        while (it.hasNext()) {  //ve si existe un 1er obj en la 1er vuelta (antes de entrar), 
            Perro aux = (Perro) it.next();
            if (aux.getRaza().equals(opc1)) {
                it.remove();
            }
        }
        razaPerros.forEach((razaPerro) -> System.out.println(razaPerro));

    }

}
