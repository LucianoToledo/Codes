/*12. Crear un programa que dibuje una escalera de números, donde cada línea de 
números comience en uno y termine en el número de la línea. Solicitar la altura de 
la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:  
 
1 
12 
123
 */
package ExtrasGuia1;

import java.util.Scanner;

public class Extra12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String temp = "1";
        
        System.out.println("Ingrese numero");
        int n = input.nextInt();
        System.out.println("--------");
        
        for (int i = 1; i < n + 1; i++) {
            if (i != 1) {
                temp = temp + String.valueOf(i);
            }
            System.out.println(temp);
        }
        
    }
}
