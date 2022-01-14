/*6. Programa Nespresso. Desarrolle una clase Cafetera con los atributos 
capacidadMaxima  (la  cantidad  máxima  de  café  que  puede  contener  la  cafetera)  y 
cantidadActual  (la  cantidad  actual  de  café  que  hay  en  la  cafetera).  Implemente,  al 
menos, los siguientes métodos: 
• Constructor predeterminado o vacío  
• Constructor con la capacidad máxima y la cantidad actual  
• Métodos getters y setters. 
• Método  llenarCafetera():  hace  que  la  cantidad  actual  sea  igual  a  la  capacidad 
máxima.
• Método  servirTaza(int):  se  pide  el  tamaño  de  una  taza  vacía,  el  método  recibe  el 
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la 
cantidad  actual  de  café  “no  alcanza”  para  llenar  la  taza,  se  sirve  lo  que  quede.  El 
método  le  informará  al  usuario  si  se  llenó  o  no  la  taza,  y  de  no  haberse  llenado  en 
cuanto quedó la taza. 
• Método vaciarCafetera(): pone la cantidad de café actual en cero.   
• Método  agregarCafe(int):  se  le  pide  al  usuario  una  cantidad  de  café,  el  método  lo 
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Ej6.Servicios;

import Ej6.entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicios {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Cafetera capacidadMax() {
        Cafetera cafetera = new Cafetera();
        
        System.out.println("Ingrese capacidad maxima de la cafetera");
        double capMax = input.nextDouble();
        
        cafetera.setCapacidadMaxima(capMax);
        
        return cafetera;
    }

//    public void capacidadMax(Cafetera cafetera) {
//        System.out.println("Ingrese capacidad maxima de la cafetera");
//        double capMax = input.nextDouble();
//        cafetera.setCapacidadMaxima(capMax);
//    }
    public void llenarCafetera(Cafetera cafetera) {
        
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("Se ha llenado la cafetera");
    }

    public void servirTaza(Cafetera cafetera) {
        System.out.println("Ingrese capacidad de la taza");
        double taza = input.nextDouble();

        if (taza <= cafetera.getCantidadActual()) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() - taza);
        } else {
            System.out.println("No hay cafe para la taza \n"
                    + "Se ha servido: " + cafetera.getCantidadActual());
            cafetera.setCantidadActual(0);
        }
    }

    public void vaciarCafetera(Cafetera cafetera) {
        System.out.println("Se ha vaciado la cafetera");
        cafetera.setCantidadActual(0);
    }

    public void agregarCafe(Cafetera cafetera) {
        System.out.println("Ingrese cantidad de cafe a agregar");
        double agregarCafe = input.nextDouble();
        double temp = cafetera.getCantidadActual() + agregarCafe;

        if (temp <= cafetera.getCapacidadMaxima()) {
            cafetera.setCantidadActual(temp);
            System.out.println("Se ha agregado el cafe");
        } else {
            System.out.println("Se ha llenado la cafetera\n"
                    + "ha sobrado " + (temp - cafetera.getCapacidadMaxima()) + " ml de cafe"); //el sobrante
            
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        }
    }
 

    public void mostrarDatos(Cafetera cafetera) {
        System.out.println("Capacidad Maxima " + cafetera.getCapacidadMaxima());
        System.out.println("Cantidad actual " + cafetera.getCantidadActual());
    }
}
