package Ej2;

import Ej1.Entidades.Persona;
import java.util.ArrayList;

public class Ej2ppal {

    public static void main(String[] args) {

        ArrayList<Persona> listaPersonas = new ArrayList();

//        int[] vector = {0, 1, 2, 3};
//
//        try {
//            for (int i = 0; i < 10; i++) {
//                System.out.println(vector[i]);
//            }
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.print("No existe la posicion ");
//            System.out.println(e.getMessage());
//        }
        Persona p1 = new Persona("Lucho", "Tole ", 22);
        Persona p2 = new Persona("Cris", "suarez", 23);
        Persona p3 = new Persona("Fran", "Arana ", 23);
        listaPersonas.add(p1); //0
        listaPersonas.add(p2); //1
        listaPersonas.add(p3); //2

        try {

//            String nombrePersona = listaPersonas.get(3).getNombre();
//            System.out.println(nombrePersona);
            Persona p4 = listaPersonas.get(4);
            System.out.println(p4);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("No existe esa posicion");
            System.out.println(e.getMessage());
        }
    }
}
