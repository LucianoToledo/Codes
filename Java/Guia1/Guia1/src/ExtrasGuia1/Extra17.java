/*17. Realizar un algoritmo que calcule la suma de todos los elementos de un vector de
tamaño N, con los valores ingresados por el usuario.*/
package ExtrasGuia1;

import java.util.Scanner;

public class Extra17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int suma = 0;
        System.out.println("Ingrese el tamaño del vector");
        int n = input.nextInt();

        int[] vec = new int[n];

        for (int i = 0; i < vec.length; i++) {
            System.out.println("Ingre numero [" + (i + 1) + "]");
            vec[i] = input.nextInt();
            suma = suma + vec[i];
        }
        System.out.println("La suma de todos los elementos del vec es: " + suma);

        for (int i = 0; i < vec.length; i++) {
            System.out.print("|" + vec[i] + "|");
        }
        System.out.println("");
    }

}
