/*
22. Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a
medida que el usuario las va ingresando, construya una “sopa de letras para niños”
de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden
horizontal en una fila que será seleccionada de manera aleatoria. Una vez
concluida la ubicación de las palabras, rellene los espacios no utilizados con un
número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras
creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes
funciones de Java substring(), Length() y Math.random().
 */
package ExtrasGuia1;

import java.util.Scanner;

public class Extra22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        String[][] sopa = new String[20][20];
        String p1, p2, p3, p4, p5;

        p1 = llenado();
        p2 = llenado();
        p3 = llenado();
        p4 = llenado();
        p5 = llenado();

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                
            }

        }
    }

    public static String llenado() {
        String p;
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        do {
            System.out.println("Ingrese la palabra");
            p = input.next();
        } while (p.length() > 5 && p.length() < 3);
        return p;
    }

}
