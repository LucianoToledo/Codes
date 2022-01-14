/*
2. Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa
en los atributos del objeto. Después, a través de otro método calcular y devolver la
distancia que existe entre los dos puntos que existen en la clase Puntos
 */
package Ej2.servicios;

import Ej2.entidades.Puntos;
import java.util.Scanner;

public class PuntosServicio {
    
    Scanner input = new Scanner(System.in);
    
    public Puntos crearPuntos(){
        
        System.out.println("Ingrese x1,y1");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("Ingrese x2,y2");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        
        return new Puntos(x1,y1,x2,y2);
    }
    
    public void distancia(Puntos puntos){
        double dist = Math.sqrt(Math.pow(puntos.getX2()-puntos.getX1(), 2)+Math.pow(puntos.getY2()-puntos.getY1(), 2));
        System.out.println("La distancia entre los 2 puntos es: "+dist);
    }
}
