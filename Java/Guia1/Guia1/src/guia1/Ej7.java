//7. Implementar un programa que dado dos números enteros determine cuál es el
//mayor y lo muestre por pantalla
package guia1;

import java.util.Scanner;

public class Ej7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int n1, n2;
        System.out.println("Ingrese el primer numero");
        n1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        n2 = leer.nextInt();

        if (n1 > n2) {
            System.out.println("El mayor num es " + n1);
        } else if (n2 > n1) {
            System.out.println("El mayor num es " + n2);
        } else {
            System.out.println("Ambos numeros son iguales");
        }

    }

}
