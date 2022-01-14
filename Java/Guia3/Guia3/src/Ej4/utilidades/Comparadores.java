package Ej4.utilidades;

import Ej4.Entidades.Pelicula;
import java.util.Comparator;

public class Comparadores {

    public static Comparator<Pelicula> ordenarDuracionOrdenDesc = new Comparator<Pelicula>() { //inicializas el comparador, mayor a menor
        @Override
        public int compare(Pelicula o1, Pelicula o2) { //recibe 2 parametros (2 objetos)
            return o2.getDuracion().compareTo(o1.getDuracion());  //en orden desc pones el 2do obj primero
        }
    };
    
    public static Comparator<Pelicula> ordenarDuracionOrdenAscen = new Comparator<Pelicula>() { //menor a mayor
        @Override
        public int compare(Pelicula o1, Pelicula o2) { //recibe 2 parametros (2 objetos)
            return o1.getDuracion().compareTo(o2.getDuracion());  //en orden desc pones el 2do obj primero
        }
    };
    
    public static Comparator<Pelicula> ordenarAlfabTitulo = new Comparator<Pelicula>() { //menor a mayor
        @Override
        public int compare(Pelicula o1, Pelicula o2) { //recibe 2 parametros (2 objetos)
            return o1.getTitulo().compareTo(o2.getTitulo());  //en orden desc pones el 2do obj primero
        }
    };
    public static Comparator<Pelicula> ordenarAlfabDirector = new Comparator<Pelicula>() { //menor a mayor
        @Override
        public int compare(Pelicula o1, Pelicula o2) { //recibe 2 parametros (2 objetos)
            return o1.getDirector().compareTo(o2.getDirector());  //en orden desc pones el 2do obj primero
        }
    };
}
