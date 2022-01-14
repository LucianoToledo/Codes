/*6. Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y
la cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes
métodos con los parámetros que sean necesarios:
•
Constructores, tanto el vacío como el parametrizado.
•
Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas,
el valor que ingresó el usuario y encontradas en 0.
•
Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
•
Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
•
Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
•
Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
•
Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.*/
package Ej6.servicios;

import Ej6.entidades.Ahorcado;
import java.util.Scanner;

public class AhorcadoServicio {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {

        System.out.println("Ingrese la palabra");
        String palabra = input.next();
        int lg = palabra.length();

        System.out.println("Ingrese cantidad de intentos");
        int intentos = input.nextInt();

        String v[] = new String[lg];
        for (int i = 0; i < v.length; i++) {
            v[i] = palabra.substring(i, i + 1);
            System.out.print("|" + v[i]);
        }
        System.out.println("");
        return new Ahorcado(v, 0, intentos);
    }

    public void mostrarLongitd(Ahorcado ahorcado) {
        System.out.println("La palabra tiene una longitud de " + ahorcado.getVector().length);
    }

    public void buscar(Ahorcado ahorcado, String letra) {
        int i = 0;
        for (int j = 0; j < ahorcado.getVector().length; j++) {
            if (letra.equals(ahorcado.getVector()[j])) {
                i++;
            }
        }
        if (i >= 1) {
            System.out.println("La letra se encuentra en la palabra");
            ahorcado.setLetrasEncontradas(ahorcado.getLetrasEncontradas() + i);
        } else {
            System.out.println("La letra no se encontró en la palabra");
            ahorcado.setJugadasMax(ahorcado.getJugadasMax() - 1);
        }
    }

    public void intentos(Ahorcado ahorcado) {
        System.out.println("Intentos restantes: " + ahorcado.getJugadasMax());
    }

    public void juego(Ahorcado ahorcado) {
        String l;
        do {
            System.out.println("Ingrese una letra a buscar");
            l = input.next();
            buscar(ahorcado, l);
            intentos(ahorcado);
            if (ahorcado.getLetrasEncontradas() == ahorcado.getVector().length) {
                System.out.println("Felicidades, has encontrado la palabra");
                break;
            }
            if (ahorcado.getJugadasMax() == 0) {
                System.out.println("GAME OVER =(");
            }
        } while (ahorcado.getJugadasMax() != 0);
    }
}
