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
package Ej4.ppal;

import Ej4.Entidades.Pelicula;
import Ej4.servicio.PeliculaServicio;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useDelimiter("\n");

        PeliculaServicio peliculaServicio = new PeliculaServicio();
        String opc;

        do {

            Pelicula p = peliculaServicio.crearPelicula();
            peliculaServicio.agregarPelicula(p);

            System.out.println("Desea agregar otro pelicula? S/N");
            opc = input.next();

            while (!opc.equalsIgnoreCase("s") && !opc.equalsIgnoreCase("n")) {
                System.out.println("Opcion no valida \n"
                        + "Ingrese nuevamente");
                opc = input.next();
            }

        } while (opc.equalsIgnoreCase("s"));

        String opcMenu, opcSubMenu;

        do {
            System.out.println("---MENU---\n"
                    + "1)- Ordenar por Duracion\n"
                    + "2)- Ordenar por Titulo \n"
                    + "3)- Ordenar por Director\n"
                    + "4)- Mostrar pelis mayores a una hora\n"
                    + "5)- Salir");
            opcMenu = input.next();

            switch (opcMenu) {
                case "1":
                    System.out.println("1) -Duracion Ascendente\n"
                            + "2)- Duracion Descendente");
                    opcSubMenu = input.next();
                    switch (opcSubMenu) {
                        case "1":
                            peliculaServicio.ordenarPeliMenorMayor();
                            peliculaServicio.mostrarPeliculas();
                            break;
                        case "2":
                            peliculaServicio.ordenarPeliMayorMenor();
                            peliculaServicio.mostrarPeliculas();
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                    break;
                case "2":
                    peliculaServicio.ordenarAlfbTitulo();
                    peliculaServicio.mostrarPeliculas();
                    break;
                case "3":
                    peliculaServicio.ordenarAlfbDirector();
                    peliculaServicio.mostrarPeliculas();
                    break;
                case "4":
                    peliculaServicio.pelisMayorUnaHora();
                    peliculaServicio.mostrarPeliculas();
                    break;
                default:
                    if (!"5".equals(opcMenu)) {
                        System.out.println("Opcion no valida");
                    }
            }
        } while (!"5".equals(opcMenu));

    }

}
