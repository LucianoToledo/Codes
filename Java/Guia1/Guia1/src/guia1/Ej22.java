/*22. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y 
los muestre por pantalla en orden descendente*/
package guia1;

public class Ej22 {

    public static void main(String[] args) {

        int[] vec = new int[100];

        for (int i = 0; i < 100; i++) {
            vec[i] = i;
        }

        for (int i = 99; i > 0; i--) { //con paso -1
            System.out.print("|"+vec[i]+"|");
        }
        System.out.println("");
    }

}
