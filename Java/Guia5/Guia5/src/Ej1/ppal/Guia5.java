package Ej1.ppal;

import Ej1.Entidades.Animal;
import Ej1.Entidades.Caballo;
import Ej1.Entidades.Gato;
import Ej1.Entidades.Perro;

public class Guia5 {

    public static void main(String[] args) {
// declaracion del obtejo Perro
        Animal perro = new Perro("Stich", "Carnivoro",15, "Doberman");
        perro.alimentarse();
        
// declaracion de otro obtejo Perro
        Perro perro1= new Perro("Terry","Croquetas",10,"Chihuaha");
        perro1.alimentarse();
        
// declaracion del obtejo Gato
        Animal gato = new Gato("Pelusa","Galletas",25,"Siames");
        gato.alimentarse();
        
// declaracion del obtejo Caballo

        Animal caballo = new Caballo("Spark","Pasto",25,"Fino");
        caballo.alimentarse();
        caballo.mostrarDatos();
        
    }

}
