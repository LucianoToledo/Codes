/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner
para leer dos números en forma de cadena. A continuación, utilice el método
parseInt() de la clase Integer, para convertir las cadenas al tipo int y guardarlas en
dos variables de tipo int. Por ultimo realizar una división con los dos numeros y
mostrar el resultado.
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por
teclado puede causar una excepción de tipo InputMismatchException, el método
Integer.parseInt() si la cadena no puede convertirse a entero, arroja una
NumberFormatException y además, al dividir un número por cero surge una
ArithmeticException. Manipule todas las posibles excepciones utilizando bloques
try/catch para las distintas excepciones
 */
package Ej3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useDelimiter("\n");

        String numA = null, numB = null;
        Integer a, b, div;

        try {
            System.out.println("Ingrese dos numeros");
            numA = input.next();
            numB = input.next();

        } catch (InputMismatchException e) { //aca no entra porque siempre se ingresa una cadena
            System.out.println("Debe ingresar numeros");
            System.out.println(e.getMessage());
        }

        try {
            a = Integer.parseInt(numA);
            b = Integer.parseInt(numB);

            div = a / b;
            System.out.println("Division --> " + div);
        } catch (NumberFormatException e) {
            System.out.println("No se puede convertir lo ingresado a numero");
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("No se puede divir por cero");
            System.out.println(e.getMessage());
        }

    }

}
