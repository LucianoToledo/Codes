/*
2. Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa
en los atributos del objeto. Después, a través de otro método calcular y devolver la
distancia que existe entre los dos puntos que existen en la clase Puntos
 */
package Ej2.ppal;

import Ej2.entidades.Puntos;
import Ej2.servicios.PuntosServicio;

public class Ej2Extra {

    
    public static void main(String[] args) {
     
        PuntosServicio puntoServicio = new PuntosServicio();
        Puntos puntos = puntoServicio.crearPuntos();
        
        puntoServicio.distancia(puntos);
        
    }
    
}
