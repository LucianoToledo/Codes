/*18. Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos)*/
package ExtrasGuia1;

import java.util.Scanner;

public class Extra18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector");
        int n = input.nextInt();
        boolean band = false;

        int[] vec1 = new int[n];
        int[] vec2 = new int[n];

        for (int i = 0; i < vec1.length; i++) {
            System.out.println("Ingrese numero, v1 [" + (i + 1) + "]");
            vec1[i] = input.nextInt();
        }
        System.out.println("--------------");
        for (int i = 0; i < vec2.length; i++) {
            System.out.println("Ingrese numero, v2 [" + (i + 1) + "]");
            vec2[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (vec1[i] != vec2[i]) {
                System.out.println("Se ha encontrado un elemento distinto entre los vectores");
                System.out.println("Posicion [" + (i + 1) + "]");
                System.out.println("v1 [" + vec1[i] + "]");
                System.out.println("v2 [" + vec2[i] + "]");
                band = false;
                break;
            }
        }

        if (!band) {
            System.out.println("Los vectores son iguales");
        }

        for (int i = 0; i < vec1.length; i++) {
            System.out.print("|" + vec1[i] + "|");
        }
        System.out.println("");
        for (int i = 0; i < vec2.length; i++) {
            System.out.print("|" + vec2[i] + "|");
        }
        System.out.println("");
    }

}
