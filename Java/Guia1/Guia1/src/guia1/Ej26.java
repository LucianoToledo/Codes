/*26. Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
viceversa) */
package guia1;

import java.util.Scanner;

public class Ej26 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cont = 0, temp1, temp2, cont2 = 0;
        boolean band = false;

        System.out.println("Ingrese dimension de la matriz");
        int n = leer.nextInt();

        int matriz[][] = new int[n][n];
        int mTras[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese num ,posicion [" + i + "," + j + "]");
                matriz[i][j] = leer.nextInt();
                mTras[i][j] = matriz[j][i];
                if (i == j && matriz[i][j] == 0) { //compruebo que la diagonal sea cero
                    cont++;
                }
                temp1 = matriz[i][j];
                temp2 = mTras[i][j];
                if (temp1 == -temp2) {
                    cont2++;
                }
            }
        }

        System.out.println("------------");
        if (cont == n && cont2 == (n + n)) {
            System.out.println("La matriz es antisimetrica");
        } else {
            System.out.println("La matriz no es antisimetrica");
        }
        System.out.println("--------");

        System.out.println("Matriz");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println(" ");
        }

        System.out.println("-----------");
        System.out.println("Antisimentrica");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("|" + mTras[i][j] + "|");
            }
            System.out.println(" ");
        }
    }

}
