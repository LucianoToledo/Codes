/*19. Crear una función rellene un vector con números aleatorios, pasándole un arreglo
por parámetro. Después haremos otra función o procedimiento que imprima el
vector.*/
package ExtrasGuia1;

import java.util.Scanner;

public class Extra19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese dimension del vector");
        int n = input.nextInt();
        
        int[] vec = new int[n];
        
       vec =  llenado(vec,n);
       mostrar(vec,n);
    }
    
    public static int[] llenado(int v[], int m){
        for (int i = 0; i < v.length; i++) {
            v[i]= (int)(Math.random()*10);
        }
        return v;
    }
    public static void mostrar(int v[], int m){
        for (int i = 0; i < v.length; i++) {
            System.out.print("|" + v[i] + "|");
        }
        System.out.println("");
    }
}
