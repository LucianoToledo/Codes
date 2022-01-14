//Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
//pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
//Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
//la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
//y se mostrará la lista ordenada
package Ej2.ppal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        ArrayList<String> perros = new ArrayList();
        String opc;
        String raza;
        do {
            System.out.println("Ingrese raza de perro");
            raza = input.next();
            perros.add(raza);

            System.out.println("Desea agregar otro perro? S/N");
            opc = input.next();

        } while (opc.equalsIgnoreCase("s"));

        perros.forEach((aux) -> System.out.println(aux));
        System.out.println("------------");
        
        
        System.out.println("Que raza desea eliminar?");
        String opc2 = input.next();

        Iterator<String> it = perros.iterator();

        while (it.hasNext()) {

            String m = it.next();
            if (m.equals(opc2)) {
                it.remove();
            }
        }

        perros.forEach((aux) -> System.out.println(aux));

    }

}
 //en el ej1 lo hice con objtetos
