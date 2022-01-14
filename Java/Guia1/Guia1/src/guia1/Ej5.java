//5. Dada una cantidad de grados centígrados se debe mostrar su equivalente en
//grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
package guia1;

import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int gCent, gFah;
        System.out.println("Ingrese temperatura en centigrados");
        gCent = leer.nextInt();

        gFah = 32 + (gCent * 9 / 5);

        System.out.println("Temp en Centigrados " + gCent + "ºC");
        System.out.println("Temp en Centigrados " + gFah + "ºF");

    }

}
