/*11. Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package Ej11;

import java.util.Date;
import java.util.Scanner;

public class Ej11 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int dia, mes, anio;

        System.out.println("Ingrese dia, mes y anio");
        dia = input.nextInt();
        mes = input.nextInt();
        anio = input.nextInt();
        
        Date fecha = new Date(anio-1900, mes-1, dia);
        Date fechaActual = new Date(); //fecha actual
        
        System.out.println(fechaActual.getYear()- fecha.getYear());
        System.out.println(fechaActual);
        System.out.println(fecha);
        
    }

}
