/*
1. Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes 
*/
package Ej1.ppal;

import Ej1.entidades.Cancion;
import java.util.Scanner;

public class Ej1Extra {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        Cancion cancion = new Cancion();
        
        System.out.println("Ingrese cancion y autor ");
        String canc = input.next();
        String autor = input.next();
        
        cancion.setTitulo(canc);
        cancion.setAutor(autor);
        
        System.out.println(cancion);
    }
    
}
