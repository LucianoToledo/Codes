/*6. Leer la altura de N personas y determinar el promedio de estaturas que se
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.*/
package ExtrasGuia1;

import java.util.Scanner;

public class Extra6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int cont = 0;
        double suma1=0,suma2=0, prom1, prom2;

        System.out.println("Ingrese cantidad de personas");
        int n = leer.nextInt();

        double[] vec = new double[n];

        for (int i = 0; i < vec.length; i++) {
            System.out.println("Ingrese estatura");
            vec[i] = leer.nextDouble();
        }
        
        for (int i = 0; i < vec.length; i++) {
            suma1 = suma1 + vec[i];
            if (vec[i]<=1.6){
                cont++;
                suma2=suma2+vec[i];
            }
        }
        
        prom1=suma1/n;
        prom2=suma2/cont;
        
        System.out.println("Promedio total --> "+prom1);
        System.out.println("Promedio de estaturas menores a 1.6 --> "+prom2+" total personas "+cont);
    }

}
