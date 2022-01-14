/*24. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos*/
package guia1;

import java.util.Scanner;

public class Ej24 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Integer c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, temp = 0;
        int tam, num;

        System.out.println("Ingrese dimension del vector");
        tam = leer.nextInt();

        int[] vec = new int[tam];

        for (int i = 0; i < tam; i++) {
            vec[i] = (int) (Math.random() * 100000);
            num = vec[i];

            temp = (Integer.toString(vec[i])).length();

            switch (temp) {
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;
                case 3:
                    c3++;
                    break;
                case 4:
                    c4++;
                    break;
                case 5:
                    c5++;
                    break;

            }
        }

        System.out.println("1 digito --> " + c1);
        System.out.println("2 digito --> " + c2);
        System.out.println("3 digito --> " + c3);
        System.out.println("4 digito --> " + c4);
        System.out.println("5 digito --> " + c5);

        for (int i = 0; i < tam; i++) {
            System.out.print("|" + vec[i] + "|");
        }

        System.out.println(" ");
    }
}
