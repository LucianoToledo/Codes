/*5. Se requiere un programa que lea y guarde países, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un
Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra
en el conjunto se le informará al usuario*/
package Ej5.Servicios;

import Ej5.entidades.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class PaisServicio {

    private Scanner input;
    private TreeSet<Pais> paises;

    public PaisServicio() {
        this.input = new Scanner(System.in).useDelimiter("\n");
        this.paises = new TreeSet();
    }

    public Pais crearPais() {
        System.out.println("Ingrese Pais");
        String nomPais = input.next();

        return new Pais(nomPais);
    }

    public void agregarPais(Pais p) {
        paises.add(p);
    }

    public void agregarPais(String opc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mostrarPaises() {
        for (Pais aux : paises) {
            System.out.println(aux);
        }
        System.out.println("");
        System.out.println("----------------");
        System.out.println("");
    }

    public boolean eliminarPais(String opc) {
        boolean band = false;
        Iterator<Pais> it = paises.iterator();
        while (it.hasNext()) {
            Pais next = it.next();
            if (next.getNombre().equalsIgnoreCase(opc)) {
                it.remove();
                band = true;
            }
        }
        return band;
    }

}
