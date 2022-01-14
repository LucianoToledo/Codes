/*
4. Escribir un programa en Java que juegue con el usuario a adivinar un número. La
computadora debe generar un número aleatorio entre 1 y 500, y el usuario tiene
que intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, la
computadora debe decirle al usuario si el número que tiene que adivinar es mayor
o menor que el que ha introducido el usuario. Cuando consiga adivinarlo, debe
indicárselo e imprimir en pantalla el número de veces que el usuario ha intentado
adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se
debe contar el carácter fallido como un intento.
 */
package Ej4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int num, i;
        i = 0;
        int numAl = (int) (Math.random() * 500);

        System.out.println("---BIENVENIDO---\n"
                + "Intente adivinar el numero\n"
                + "----------");

        try {
            System.out.println(numAl);
            do {
                System.out.println("Ingrese un numero");
                num = input.nextInt();

                if (num < 0) {
                    System.out.println("Solo numeros positivos");
                    continue;
                }

                if (num > numAl) {
                    System.out.println("Te pasaste =(\n"
                            + "");
                    i++;
                } else if (num < numAl) {
                    System.out.println("Falta un poco mas \n"
                            + "");
                    i++;
                } else {
                    System.out.println("Felicidades!! has adivinado el numero");
                }
            } while (num != numAl);

        } catch (InputMismatchException e) {
            System.out.println("Caracter no valido");
            System.out.println(e.getMessage());
            i++;
        }
        System.out.println("Numero de intentos: " + i);
    }

//    public static int validarNumero() {
//        boolean band = false;
//        int num = 0;
//        try {
//            System.out.println("Ingrese un numero");
//            num = input.nextInt();
//            band = true;
//        } catch (InputMismatchException e) {
//            System.out.println("Caracter no valido");
//        }
//        return num;
//    }
}
