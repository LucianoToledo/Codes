////13. Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
//la nota se pedirá de nuevo hasta que la nota sea correcta
package guia1;

import java.util.Scanner;

public class Ej13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int nota = 11;
        int i = 0;
        while (nota <= 0 || nota >= 10) {
            if (i == 0) {
                System.out.println("Ingrese nota");
                nota = leer.nextInt();
                i++;
            }else{
                System.out.println("Nota no valida, ingrese nuevamente");
                nota = leer.nextInt();
            }
        }
        System.out.println("Nota ingresada correctamente");
    }

}
