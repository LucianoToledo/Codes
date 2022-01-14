/*14. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial.*/
package guia1;

import java.util.Scanner;

public class Ej14 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese limite superior");
        int limite = num.nextInt();
        
        int suma=0;
        int n;
        
        while (suma<limite){
            System.out.println("Ingrese numero");
            n=num.nextInt();
            suma+=n;
        }
        
        System.out.println("Limite inicial= "+limite);
        System.out.println("Suma de numeros ingresados "+suma);
    }

}
