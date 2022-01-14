/*14. Crea una aplicación que le pida dos números al usuario y este pueda elegir entre 
sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada 
operación matemática y deben devolver sus resultados para imprimirlos en el main. 
 */
package ExtrasGuia1;

import java.util.Scanner;

public class Extra14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, opc;
        
        System.out.println("Ingrese el primer numero");
        num1 = input.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        num2 = input.nextInt();
        
        System.out.println("--------");
        
        System.out.println("1-Sumar \n"
                + "2-Restar\n"
                + "3-Multiplicar\n"
                + "4-Dividir");
        opc = input.nextInt();
        
        switch (opc) {
            case 1:
                System.out.println(num1 + "+" + num2 + "=" + suma(num1, num2));
                break;
            case 2:
                System.out.println(num1 + "-" + num2 + "=" + resta(num1, num2));
                break;
            case 3:
                System.out.println(num1 + "*" + num2 + "=" + multiplicacion(num1, num2));
                break;
            case 4:
                System.out.println(num1 + "/" + num2 + "=" + division(num1, num2));
                break;
                
        }
    }

    public static int suma(int n1, int n2) {
        int suma;
        suma = n1 + n2;
        return suma;
    }

    public static int resta(int n1, int n2) {
        int resta;
        resta = n1 - n2;
        return resta;
    }

    public static float multiplicacion(int n1, int n2) {
        float multi;
        multi = n1 * n2;
        return multi;
    }

    public static float division(int n1, int n2) {
        int div;
        div = n1 / n2;
        return div;
    }

}
