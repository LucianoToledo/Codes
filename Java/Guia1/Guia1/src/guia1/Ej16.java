/*16. Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.*/
package guia1;

import java.util.Scanner;

public class Ej16 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int suma = 0;
        int i = 0;
        int n;
        do {
            System.out.println("Ingrese numero");
            n = leer.nextInt();
            
            if (n < 0) {
                System.out.println("Se debe ingresar numeros positivos unicamente");
            } else if (n == 0) {
                break;
            } else {
                i++;
                suma = suma + n;
            }
        } while (i < 20);

        if (n == 0) {
            System.out.println("Se capturo el numero cero");
        }
        System.out.println("La suma de todos los numeros es " + suma);

    }

}
