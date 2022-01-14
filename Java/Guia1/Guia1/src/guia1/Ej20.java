/*20. Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el 
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo: 
 
5 ***** 
3 *** 
11 *********** 
2 ***/
package guia1;

import java.util.Scanner;

public class Ej20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1, n2, n3, n4;

        do {
            System.out.println("Ingrese el 1er numero");
            n1 = leer.nextInt();
        } while (n1 < 0 && n1 > 20);
        do {
            System.out.println("Ingrese el 2do numero");
            n2 = leer.nextInt();
        } while (n2 < 0 && n2 > 20);
        do {
            System.out.println("Ingrese el 3er numero");
            n3 = leer.nextInt();
        } while (n3 < 0 && n3 > 20);
        do {
            System.out.println("Ingrese 4to numero");
            n4 = leer.nextInt();
        } while (n4 < 0 && n4 > 20);

        System.out.print(n1 + " "); //N1
        for (int i = 0; i < n1; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
        
        System.out.print(n2 + " "); //N2
        for (int i = 0; i < n2; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
        
        System.out.print(n3 + " "); //N3
        for (int i = 0; i < n3; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
        
        System.out.print(n4 + " "); //N4
        for (int i = 0; i < n4; i++) {
            System.out.print("*");
        }
        System.out.println(" ");

    }

}
