/*
2. Declarar una clase llamada Circunferencia que tenga como atributo privado el radio 
de tipo real. A continuación, se deben crear los siguientes métodos: 
 
a) Método constructor que inicialice el radio pasado como parámetro. 
b) Métodos get y set para el atributo radio de la clase Circunferencia. 
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo 
del objeto. 
d) Método area(): para calcular el área de la circunferencia (Area=π∗radio!). 
e) Método perimetro(): para calcular el perímetro (Perimetro=2∗π∗radio).
 */
package Ej2.ppal;

import Ej2.entidades.Circunferencia_Ej2;
import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Circunferencia_Ej2 c = new Circunferencia_Ej2();

        boolean band = false;
        int opc;

        do {
            System.out.println("Circunferencia \n"
                    + "1) Ingresar Radio \n"
                    + "2) Mostrar Area \n"
                    + "3) Mostrar Perimetro\n"
                    + "4) Salir");
            opc = input.nextInt();
            switch (opc) {
                case 1:
                    c.crearCircunferencia();
                    band = true;
                    break;
                case 2:
                    if (band) {
                        c.area();
                    } else {
                        System.out.println("Se debe ingresar el radio primero");
                        c.crearCircunferencia();
                        c.area();
                        band=true;
                    }
                    break;
                case 3:
                    if (band) {
                        c.perimetro();
                    } else {
                        System.out.println("Se debe ingresar el radio primero");
                        c.crearCircunferencia();
                        c.perimetro();
                        band=true;
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opc != 4);

    }

}
