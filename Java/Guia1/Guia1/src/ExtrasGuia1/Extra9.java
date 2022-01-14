/*9. Simular la división usando solamente restas. Dados dos números enteros mayores
que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo
restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor
que el divisor, este resultado es el residuo, y el número de restas realizadas es el
cociente. 
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.*/
package ExtrasGuia1;

import java.util.Scanner;

public class Extra9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int dividendo, divisor, resto, cociente=0;
        
        System.out.println("Ingrese dividendo");
        dividendo = leer.nextInt();
        System.out.println("Ingrese divisor");
        divisor = leer.nextInt();
        
        do{
            dividendo = dividendo - divisor; //corregir
            cociente++;
        }while(divisor<dividendo);
        
        System.out.println("resto-->"+dividendo);
        System.out.println("cociente-->"+cociente);
    }

}
