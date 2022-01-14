/*16. Crea una aplicación que nos pida un número por teclado y con una función se lo
pasamos por parámetro para que nos indique si es o no un número primo, debe
devolver true si es primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25
no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.*/
package ExtrasGuia1;

import java.util.Scanner;

public class Extra16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0, temp;
        System.out.println("Ingrese un numero");
        int n = input.nextInt();
        temp = n;
        
        do {
            if ((n % temp) == 0) {
                i++;
            }
            temp--;
        } while (temp != 0);
        
//        System.out.println(i);
        if (i == 2) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }
    }

}
