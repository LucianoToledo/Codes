/*7. Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y
los números serán introducidos por el usuario. Realice dos versiones del programa,
una usando el bucle “while” y otra con el bucle “do - while”.*/
package ExtrasGuia1;

import java.util.Scanner;

public class Extra7 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int i,temp,suma = 0, num, max, min;
        float prom;

        System.out.println("Ingrese N");
        i = leer.nextInt();
        min = 0;
        max = 0;
        temp=i;
        while (i != 0) {
            do{
            System.out.println("Ingrese numero");
            num = leer.nextInt();
            }while(num<0);
            suma = suma + num;
            if (i == temp) {
                min = num;
            }else if(num < min){
                min=num;
            }
            
            if (num > max) {
                max = num;
            }
            i--;
        }
        
        prom=suma/temp;
        System.out.println("Max-->" + max + "\n"
                + "Min-->" + min + "\n"
                + "Promedio-->"+prom);

    }

}
