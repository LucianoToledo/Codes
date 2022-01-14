/*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si
el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2
horas.*/
package ExtrasGuia1;

import java.util.Scanner;

public class Extra1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int tiempo, dia = 0;
        float hs, temp;
        System.out.println("Ingrese cantidad en minutos");
        tiempo = leer.nextInt();

        hs = tiempo / 60;

        while (hs > 24) {
            hs = hs - 24;
            dia++;
        }

        System.out.println(dia + " dias, " + hs + " hs");
    }

}
