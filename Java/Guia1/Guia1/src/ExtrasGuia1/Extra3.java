/*Elaborar un algortmo en el cual se ingrese una letra y se detecte si se trata de una
vocal. Caso contrario mostrar un mensaje. Nota: investigar la funcion equals() de
clase String.*/
package ExtrasGuia1;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

public class Extra3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String l;
        do{
        System.out.println("Ingrese letra");
        l = leer.next();
        }while(l.length() != 1);
        
        l = toLowerCase(l);
        
        if (l.equals("a") ||l.equals("e") ||l.equals("i") ||l.equals("o") ||l.equals("u")){
                System.out.println("La letra ingresada es una vocal --> "+l);
        }else{
            System.out.println("La letra ingresada no es una vocal -> "+l);
        }
    }
    
}
