/*10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.
 */
package Ej10.ppal;

import java.util.Arrays;

public class Ej10 {

    public static void main(String[] args) {

        float A[] = new float[50];
//         = new float[20];

        for (int i = 0; i < A.length; i++) {
            A[i] = (float) Math.random() * 100;
        }
        mostrarArreglo(A);

        float B[] = Arrays.copyOf(A, 20);

        for (int i = 10; i < B.length; i++) {
            B[i] = (float) 0.5;
        }
        
        Arrays.sort(A);
        mostrarArreglo(A);
        mostrarArreglo(B);

    }

    public static void mostrarArreglo(float arreglo[]) {
        System.out.println("***ARREGLO***");

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("|" + arreglo[i] + " |");
        }
        System.out.println("");
    }
}
