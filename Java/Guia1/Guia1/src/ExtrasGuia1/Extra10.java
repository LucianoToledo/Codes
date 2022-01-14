/*10. Realice un programa para que el usuario adivine el resultado de una multiplicación
entre dos números generados aleatoriamente entre 0 y 10. El programa debe
indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea
incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para
realizar este ejercicio investigue como utilizar la función Math.random() de Java.*/
package ExtrasGuia1;

import java.util.Scanner;

public class Extra10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1, n2, multi, resp;
        n1 = (int) (Math.random() * 10);
        n2 = (int) (Math.random() * 10);

        multi = n1 * n2;

        do {
            System.out.println("adivine la respuesta");
            resp = leer.nextInt();
            if (resp == 0) { //salida manual
                break;
            }
        } while (resp != multi);

        System.out.println("N1: " + n1 + "\n"
                + "N2: " + n2);
        System.out.println("Resultado: " + multi);
    }

}
