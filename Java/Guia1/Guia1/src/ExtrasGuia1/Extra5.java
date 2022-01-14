/*5. Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
dichos tratamientos.

Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real
que represente el costo del tratamiento (previo al descuento) y determine el importe
en efectivo a pagar por dicho socio.*/
package ExtrasGuia1;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Extra5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String opc;
        char op;
        boolean band;
        double importe, total;

        System.out.println("Ingrese importe");
        importe = leer.nextFloat();
        System.out.println("---------");

        do {
            System.out.println("Elija tipo de socio \n"
                    + "A\n"
                    + "B\n"
                    + "C");
            opc = leer.next();
            opc = toUpperCase(opc);
            op = opc.charAt(0);
        } while (op != 'A' && op != 'B' && op != 'C');

        switch (op) {
            case 'A':
                total = importe * 0.5;
                break;
            case 'B':
                total = importe * 0.65;
                break;//dsc del 35%
            default:
                total = importe;
                break;
        }

        System.out.println("Total --> " + importe);
        System.out.println("Tipo de socio " + op);
        System.out.println("Total con descuento --> " + total);

    }

}
