/*11. Escribir un programa que lea un número entero y devuelva el número de dígitos
que componen ese número. Por ejemplo, si introducimos el número 12345, el
programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente
utilizando el operador de división. Nota: recordar que las variables de tipo entero
truncan los números o resultados
 */
package ExtrasGuia1;

import java.util.Scanner;

public class Extra11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, i = 1;
        float temp;

        System.out.println("Ingrese numero");
        num = input.nextInt();

        do {
            num/= 10;
            i++;
        } while (num > 10);
        System.out.println("Cantidad de digitos -->"+i);
    }

}
