package Ej2.ppal;

import Ej2.entidades.Lavadora;
import Ej2.entidades.Televisor;

public class Ej2 {

    public static void main(String[] args) {

        Televisor tv = new Televisor();
        Lavadora lav = new Lavadora();

        tv.crearTelevisor();
        tv.precioFinal();
        System.out.println(tv);
        
        System.out.println("---------");

        lav.crearLavadora();
        lav.precioFinal();
        System.out.println(lav);
    }

}
