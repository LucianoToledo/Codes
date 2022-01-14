
package Ej2Extra.servicio;

import Ej2Extra.Entidades.Cine;
import Ej2Extra.Entidades.Pelicula;
import Ej2Extra.Entidades.Sala;
import java.util.Scanner;

public class CineServicio {
    private Scanner input;

    public CineServicio() {
        input = new Scanner(System.in).useDelimiter("\n");
    }
    
    public Cine crearCine(Pelicula p, Sala s){
        return new Cine(p, s);
    }
    
    
}
