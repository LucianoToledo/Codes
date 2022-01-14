/*27. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
programa que permita introducir un cuadrado por teclado y determine si este
cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.*/
package guia1;

public class Ej27 {

    public static void main(String[] args) {
        java.util.Scanner leer = new java.util.Scanner(System.in);
        int matriz[][] = new int[3][3];
        int num, n, f1 = 0, f2 = 0, f3 = 0, c1 = 0, c2 = 0, c3 = 0, d1 = 0, d2 = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese numero [" + i + "," + j + "]");
                num = leer.nextInt();
                while ((num > 9 || num < 1)) {
                    System.out.println("Debe ingresar un numero entre 1 y 9 [" + i + "," + j + "]");
                    num = leer.nextInt();
                }
                matriz[i][j] = num;
            }
        }

        for (int i = 0; i < 3; i++) {
            c1 = matriz[i][0] + c1;
            c2 = matriz[i][1] + c2;
            c3 = matriz[i][2] + c3;
            f1 = matriz[0][i] + f1;
            f2 = matriz[1][i] + f2;
            f3 = matriz[2][i] + f3;
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    d1 = matriz[i][j] + d1;
                }
            }
        }

        n = 2;
        for (int i = 0; i < 3; i++) {
            d2 = matriz[i][n] + d2;
            n--;
        }

        if (f1 == f2 && f2 == f3 && d1 == d2 && c1 == c2 && c2 == c3 && d2==f3 && d2==c3) {
            System.out.println("Cuadrado magico");
        } else {
            System.out.println("No es un cuadrado magico");
        }

        System.out.println(f1 + "+" + f2 + "+" + f3);
        System.out.println(c1 + "+" + c2 + "+" + c3);
        System.out.println(d1 + "+" + d2);
        System.out.println("");
        System.out.println("Matriz");
        for (int i = 0;
                i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println(" ");
        }
    }

}
