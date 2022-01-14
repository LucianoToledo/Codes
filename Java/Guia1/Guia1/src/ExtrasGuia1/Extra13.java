/*13. Se dispone de un conjunto de N familias, cada una de las cuales tiene una M 
cantidad de hijos. Escriba un programa que pida la cantidad de familias y para 
cada familia la cantidad de hijos para averiguar la media de edad de los hijos de 
todas las familias. 
 */
package ExtrasGuia1;

import java.util.Scanner;

public class Extra13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese cantidad de familias");
        int n = input.nextInt();
        float prom,suma=0,contadorHijos=0;
        int hijos;

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese cantidad de hijos de la familia "+i);
            hijos = input.nextInt();
            for (int j = 0; j < hijos; j++) {
//                System.out.println("Familia "+i+" ,Hijo "+j);
                suma+=Math.floor(Math.random() * (55 - 3 + 1)) + 3; //Math.floor(Math.random() * (MAX - MIN + 1)) + MIN;
                contadorHijos++;
            }
        }
        prom=suma/contadorHijos;
        System.out.println("El promedio de edades es de "+prom+" anios");
    }
}
