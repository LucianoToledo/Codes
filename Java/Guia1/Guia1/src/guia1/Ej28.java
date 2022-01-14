//28. Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
//P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
//contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
//submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
//columnas, existe al menos una que coincida con la matriz P. En ese caso, el
//programa debe indicar la fila y la columna de la matriz M en la cual empieza el
//primer elemento de la submatriz P.
package guia1;

import static java.lang.Math.random;

public class Ej28 {

    public static void main(String[] args) {

        int m[][] = new int[10][10];
        int p[][] = new int[3][3];
        int aux[][] = new int[3][3];
        int temp, posc=0, posf=0;
        boolean bandera=false;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                m[i][j] = (int) (random() * 10);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                p[i][j] = (int) (random() * 10);
            }
        }

        temp = p[0][0];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (m[i][j] == p[0][0]) {
                    if ((m[i][j + 1] == p[0][1]) && (m[i][j + 2] == p[0][2])) {
                        if ((m[i + 1][j] == p[1][0]) && (m[i + 1][j + 1] == p[1][1]) && (m[i + 1][j + 2] == p[1][2])) {
                            if ((m[i + 2][j] == p[2][0]) && (m[i + 2][j + 1] == p[2][1]) && (m[i + 2][j + 2] == p[2][2])) {
                                bandera = true;
                                posc = i;
                                posf = j;
                            }
                        }
                    }
                }
            }
        }
        if (bandera) {
            System.out.println("La matriz se encontro a partir de la posicion ["+posc+","+posf+"]");
        }else{
            System.out.println("No se encontro la matriz");
        }
            System.out.println("Matriz");
        for (int i = 0; i < m.length ; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print("|" + m[i][j] + "|");
            }
            System.out.println(" ");
        }

        System.out.println("-----------");
        System.out.println("submatriz");
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                System.out.print("|" + p[i][j] + "|");
            }
            System.out.println(" ");
        }

    }
}
