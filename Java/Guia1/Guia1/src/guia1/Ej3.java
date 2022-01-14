
package guia1;

//3. Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre 
//por pantalla
import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese su nombre");
        String nombre = leer.next();
        System.out.println("---------");
        System.out.println("Su nombre es " + nombre);
    }

}