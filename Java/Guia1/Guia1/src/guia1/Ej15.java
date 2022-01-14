/*15. Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú*/
package guia1;

import java.util.Scanner;

public class Ej15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el primer numero");
        float n1 = leer.nextInt();
        float n2 = leer.nextInt();
        int opc;
        boolean band = true;
        String opcSalida;

        do {
            System.out.println("MENU\n"
                    + "1. Sumar\n"
                    + "2. Restar\n"
                    + "3. Multiplicar\n"
                    + "4. Dividir\n"
                    + "5. Salir\n"
                    + "Elija opción:");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println(n1 + "+" + n2 + "=" + (n1 + n2));
                    break;
                case 2:
                    System.out.println(n1 + "-" + n2 + "=" + (n1 - n2));
                    break;
                case 3:
                    System.out.println(n1 + "*" + n2 + "=" + (n1 * n2));
                    break;
                case 4:
                    float div = n1 / n2;
                    System.out.println(n1 + "/" + n2 + "=" + div);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    opcSalida = leer.next();
                    if (opcSalida.equals("s")) {
                        band = false;
                    }
            }
        } while (band != false);

    }

}
