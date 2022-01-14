/*2. Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a
cada una. A continuación, realizar las instrucciones necesarias para que: B tome el
valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una
variable auxiliar.*/
package ExtrasGuia1;

import java.util.Scanner;

public class Extra2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int A, B, C, D, temp;
        System.out.println("Ingrese los valores");
        System.out.print("A-->");
        A = leer.nextInt();
        System.out.print("B-->");
        B = leer.nextInt();
        System.out.print("C-->");
        C = leer.nextInt();
        System.out.print("D-->");
        D = leer.nextInt();
        
        System.out.println("A | B | C | D");
        System.out.println(A+"   "+B+"   "+C+"   "+D);
        //B tome el valor de C
        temp=B;
        B=C;
        //C tome el valor de A
        C=A;
        
        //A tome el valor de D
        A=D;
        
        //D tome el valor de B
        D=temp;
        System.out.println("--------------");
        System.out.println("A | B | C | D");
        System.out.println(A+"   "+B+"   "+C+"   "+D);
        
    }

}
