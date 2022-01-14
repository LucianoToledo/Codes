/*4. Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.*/
package ExtrasGuia1;

import java.util.Scanner;

public class Extra4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num, i = 0;
        String rom="null";
        boolean band = false;
        do {
            System.out.println("Ingrese numero");
            num = leer.nextInt();
        } while (num > 10);

        switch (num) {
            case 1:
                rom = "I";
                band = true;
                break;
            case 2:
                rom = "II";
                band = true;
                break;
            case 3:
                rom = "III";
                band = true;
                break;
            case 4:
                rom = "IV";
                band = true;
                break;
            case 5:
                rom = "V";
                band = true;
                break;
            case 6:
                rom = "VI";
                band = true;
                break;
            case 7:
                rom = "VII";
                band = true;
                break;
            case 8:
                rom = "VIII";
                band = true;
                break;
            case 9:
                rom = "IX";
                band = true;
                break;
            case 10:
                rom = "X";
                band = true;
                break;
        }
        if (band){
           System.out.println(rom); 
        }
        
    }

}
