/*Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
Para esto, tendremos una clase Pelicula con el titulo, director y duración de la
película (en horas). Implemente las clases y métodos necesarios para esta
situación, teniendo en cuenta lo que se pide a continuación:
En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario
si quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
•
Mostrar en pantalla todas las películas.
•
Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
•
Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
•
Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
•
Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
•
Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
Nota: recordar el uso del Comparator para ordenar colecciones con objetos
 */
package Ej4.servicio;

import Ej4.Entidades.Pelicula;
import Ej4.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeliculaServicio {

    private Scanner input;
    private ArrayList<Pelicula> peliculas;

    public PeliculaServicio() {
        input = new Scanner(System.in).useDelimiter("\n");
        peliculas = new ArrayList();
    }

    public Pelicula crearPelicula() {
        System.out.println("Ingrese titulo de la pelicula");
        String titulo = input.next();
        System.out.println("Ingrese drector de " + titulo);
        String autor = input.next();
        System.out.println("Ingrese duracion de " + titulo);
        double duracion = input.nextDouble();
        return new Pelicula(titulo, autor, duracion);
    }

    public void agregarPelicula(Pelicula p) {
        peliculas.add(p);
    }

    public void mostrarPeliculas() {
        peliculas.forEach((listaPelicula) -> System.out.println(listaPelicula));
    }

    public void pelisMayorUnaHora() {
//        for (int i = 0; i < listaPeli.size(); i++) {
//            if(listaPeli.get(i).getDuracion() > 1){ 
//                System.out.println(listaPeli.get(i));
//            }
//        }
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula);
            }
        }
        mostrarPeliculas();
    }

    public void ordenarPeliMayorMenor() {
        Collections.sort(peliculas, Comparadores.ordenarDuracionOrdenDesc);

    }

    public void ordenarPeliMenorMayor() {
        Collections.sort(peliculas, Comparadores.ordenarDuracionOrdenAscen);
//        Collections.sort(peliculas, Comparadores.ordenarDuracionOrdenDesc.reversed());

    }

    public void ordenarAlfbTitulo() {
        Collections.sort(peliculas, Comparadores.ordenarAlfabTitulo);

    }

    public void ordenarAlfbDirector() {
        Collections.sort(peliculas, Comparadores.ordenarAlfabDirector);

    }

}
