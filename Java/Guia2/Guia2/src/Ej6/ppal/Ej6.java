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
package Ej6.ppal;

import Ej6.Servicios.CafeteraServicios;
import Ej6.entidades.Cafetera;
import java.util.Scanner;

public class Ej6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useDelimiter("\n");

        CafeteraServicios cafeS = new CafeteraServicios();
        Cafetera cafetera = cafeS.capacidadMax();

        int opc;
        cafeS.llenarCafetera(cafetera);
        System.out.println(cafetera);//para que muestre los datos
        do {
            System.out.println("Menu \n"
                    + "1 - Servir Taza\n"
                    + "2 - Vaciar Cafetera\n"
                    + "3 - Agregar Cafe\n"
                    + "4 - Mostrar cantidad de cafe\n"
                    + "5 - Salir");
            opc = input.nextInt();

            switch (opc) {
                case 1:
                    cafeS.servirTaza(cafetera);
                    break;
                case 2:
                    cafeS.vaciarCafetera(cafetera);
                    break;
                case 3:
                    cafeS.agregarCafe(cafetera);
                    break;
                case 4:
                    cafeS.mostrarDatos(cafetera);
                    break;
                default:
                    if (opc != 5) {
                        System.out.println("Opcion invalida");
                    }
            }
        } while (opc != 5);

    }

}
