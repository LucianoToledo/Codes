/*23. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido*/
package guia1;

import java.util.Scanner;

public class Ej23 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int cont=0;
        
        
        System.out.println("Ingrese tamaño del vector");
        int tam = leer.nextInt();
        int[] vec = new int[tam];

        System.out.println("Ingrese un numero a buscar en el vector");
        int n = leer.nextInt();

        for (int i = 0; i < tam; i++) {
            vec[i] = (int) (Math.random() * 10);
        }
        
        for (int i = 0; i < tam; i++) {
            if (vec[i]==n){
                System.out.println("El numero "+n+" se encuentra en la posicion "+i);
                cont++;
            }
        }
        
        System.out.println("-----------");
        if(cont>1){
            System.out.println("El numero se encontro "+cont+" veces repetido");
        }else if(cont==1){
            System.out.println("El numero se encontro pero no se repite");
        }else{
            System.out.println("No se encontro el numero dentro del vector");
        }
        
        
        
        for (int i = 0; i < tam; i++) {
            System.out.print("|"+vec[i]+"|");
        }
        System.out.println(" ");
    }
    
    

}
