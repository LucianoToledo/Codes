//4. Escribir un programa que pida una frase y la muestre toda en mayúsculas y
//después toda en minúsculas. Nota: investigar la función toUpperCase() y
//toLowerCase() en Java
package guia1;

import java.util.Scanner;
//import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
//import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Ej4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese la frase");
        String frase = leer.next();
        System.out.println("---------");

//        System.out.println("Frase en mayusculas " + toUpperCase(frase));
//        System.out.println("Frase en minusculas " + toLowerCase(frase));
        System.out.println("Frase en mayusculas " + frase.toUpperCase());
        System.out.println("Frase en minusculas " + frase.toLowerCase());
        
    }
}
