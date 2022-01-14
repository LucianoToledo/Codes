/*15. Diseñe una función que pida el nombre y la edad de N personas e imprima los 
datos de las personas ingresadas por teclado e indique si son mayores o menores 
de edad. Después de cada persona, el programa debe preguntarle al usuario si 
quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra 
“No”
 */
package ExtrasGuia1;

import java.util.Scanner;

public class Extra15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int opc, N, temp = 0;
        Integer aux;
        String condicion;
        boolean band = false;

        System.out.println("Ingrese cantidad de personas");
        N = input.nextInt();

        String[][] m = new String[N][2];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    System.out.println("Ingrese nombre de la persona");
                    m[i][j] = input.next();
                } else {
                    System.out.println("Ingrese edad de " + m[i][0]);
                    m[i][j] = input.next();
                }
            }
        }

        do {
            System.out.println("--------------");
            System.out.println("Ingrese Opcion\n"
                    + "1-Mostrar Persona\n"
                    + "2-Mostrar Todas las personas\n"
                    + "3-Salir");
            opc = input.nextInt();
            
            switch (opc) {
                case 1:
                    aux = Integer.parseInt(m[temp][1]);
                    if (aux < 18) {
                        condicion = "Menor";
                    } else {
                        condicion = "Mayor";
                    }
                    System.out.println("Nombre   |      |");
                    System.out.println(m[temp][0] + "    " + condicion);
                    if (temp <= N - 2) {
                        temp++;
                    }
                    break;
                case 2:
                    System.out.println("  Nombre   |      |");
                    for (int i = 0; i < m.length; i++) {
                        for (int j = 0; j < 2; j++) {
                            System.out.print(" | " + m[i][j]);
                            if (j == 1) {
                                aux = Integer.parseInt(m[i][1]);
                                if (aux < 18) {
                                    System.out.print("|  Menor");
                                } else {
                                    System.out.print("|  Mayor");
                                }
                            }
                        }
                        System.out.println(" ");
                    }
                    break;
                case 3:
                    band = true;
                    break;
            }
        } while (!band);
    }

}
