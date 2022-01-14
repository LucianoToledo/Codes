
package guia1;

//2. Escribir un programa que pida dos números enteros por teclado y calcule la suma 
//de los dos. El programa deberá después mostrar el resultado de la suma
import java.util.Scanner;


public class Ej2 {
    public static void main(String[] args) {
Scanner num = new Scanner(System.in).useDelimiter("\n");
           
        System.out.println("Ingrese el primer numero");
        
        int num1 = num.nextInt();
        int num2 = num.nextInt();
        
        int suma = num1+num2;
        
        System.out.println(num1+"+"+num2+"="+suma);
                
    }
    
}