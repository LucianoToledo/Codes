/*8. Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de
números pares y la cantidad de números impares. Al igual que en el ejercicio
anterior los números negativos no deben sumarse. Nota: recordar el uso de la
sentencia break*/
package ExtrasGuia1;

import java.util.Scanner;

public class Extra8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num, i = 0, par = 0, impar = 0;

        do {
            do { //no negativo
                System.out.println("Ingrese numero");
                num = leer.nextInt();
            } while (num < 0);
            
            if ((num % 5) == 0) {
                break;
            }
            i++;
            if (num % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        } while ((num % 5) != 0);

        System.out.println("Total-->" + i + "\n"
                + "Par-->" + par + "\n"
                + "Impar-->" + impar);
    }

}
