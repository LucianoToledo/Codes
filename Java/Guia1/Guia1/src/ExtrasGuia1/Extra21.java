/*21. Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios
y muestre la suma de sus elementos.*/
package ExtrasGuia1;

import java.util.Scanner;

public class Extra21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, m;

        System.out.println("Ingrese cantidad de filas de la matriz");
        n = input.nextInt();
        System.out.println("Ingrese cantidad de columnas de la matriz");
        m = input.nextInt();

        int[][] matriz = new int[n][m];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("---------------");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println("");
        }
    }

}
