/*5. Se requiere un programa que lea y guarde países, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un
Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra
en el conjunto se le informará al usuario */
package Ej5.ppal;

import Ej5.Servicios.PaisServicio;
import Ej5.entidades.Pais;
import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useDelimiter("\n");
        PaisServicio paisServicio = new PaisServicio();
        String opc, opcPais;
        do {
            System.out.println("Desea agregar un pais S/N");
            opc = input.next();
            if (opc.equalsIgnoreCase("s")) {
                Pais pais = paisServicio.crearPais();
                paisServicio.agregarPais(pais);
            } else if (!opc.equalsIgnoreCase("n")) {
                System.out.println("Opcion no valida");
            }

        } while (!opc.equalsIgnoreCase("n"));

        paisServicio.mostrarPaises();

        do {
            System.out.println("Desea Eliminar un pais S/N");
            opc = input.next();
            if (opc.equalsIgnoreCase("s")) {
                System.out.println("Ingrese Pais a eliminar");
                opcPais = input.next();

                if (paisServicio.eliminarPais(opcPais)) {
                    System.out.println("Se ha eliminado " + opcPais + " De la lista");
                } else {
                    System.out.println("No se ha encontrado el pais ingresado");
                }

            } else if (!opc.equalsIgnoreCase("n")) {
                System.out.println("Opcion no valida");
            }

        } while (!opc.equalsIgnoreCase("n"));
        
        paisServicio.mostrarPaises();
    }

}
