//Crear un programa que dado un numero determine si es par o impar
package guia1;

import java.util.Scanner;

public class Ej8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese un numero");
        int num = leer.nextInt();

        if ((num % 2) == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }

}
