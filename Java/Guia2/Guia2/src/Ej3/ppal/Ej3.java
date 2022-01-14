/*3. Crear  una  clase  llamada  Operacion  que  tenga  como  atributos  privados  numero1  y 
numero2. A continuación, se deben crear los siguientes métodos: 
 
a) Método constructor con todos los atributos pasados por parámetro. 
b) Metodo constructor sin los atributos pasados por parámetro. 
c) Métodos get y set.
d) Método  para  crearOperacion():  que  le  pide  al  usuario  los  dos  números  y  los 
guarda en los atributos del objeto. 
e) Método sumar(): calcular la suma de los números y devolver el resultado al main. 
f) Método restar(): calcular la resta de los números y devolver el resultado al main 
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, 
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el 
error. Si no, se hace la multiplicación y se devuelve el resultado al main 
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a 
pasar  una  división  por  cero,  el  método  devuelve  0  y  se  le  informa  al  usuario  el 
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado 
al main. 
 */
package Ej3.ppal;

import Ej3.entidades.Ej3_Operacion;
import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {
        Ej3_Operacion op = new Ej3_Operacion();
        Scanner input = new Scanner(System.in);

        op.crearOperacion();

        System.out.println("");
        int opc;

        do {
            System.out.println("Elija operacion \n"
                    + "1) Suma \n"
                    + "2) Resta \n"
                    + "3) Multiplicar \n"
                    + "4) Dividivir \n"
                    + "5) Salir");
            opc = input.nextInt();

            switch (opc) {
                case 1:
                    op.sumar();
                    break;
                case 2:
                    op.resta();
                    break;
                case 3:
                    op.multiplicacion();
                    break;
                case 4:
                    op.division();
                    break;
                default:
                    if(opc!=5){
                        System.out.println("Opcion invalida");
                    }
            }
        } while (opc != 5);
    }

}
