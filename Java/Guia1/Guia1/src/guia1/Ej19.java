/*19. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, 
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente: 
 
* * * *  
*      * 
*      * 
* * * **/
package guia1;

import java.util.Scanner;

public class Ej19 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese N");
        int n = leer.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        for (int j = 0; j < n-2; j++) {
            for (int i = 0; i < n; i++) {
                if (i == 0 || i == (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

}
