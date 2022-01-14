//6. Escribir un programa que lea un número entero por teclado y muestre por pantalla
//el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
//Math.sqrt().
package guia1;

import java.util.Scanner;

public class Ej6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        
        System.out.println(num+"*2="+num*2);
        System.out.println(num+"*3="+num*3);
        System.out.println("Raiz("+num+")="+Math.sqrt(num));
    }
    
}
