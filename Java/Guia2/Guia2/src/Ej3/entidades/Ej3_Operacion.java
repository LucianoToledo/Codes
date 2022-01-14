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
package Ej3.entidades;

import java.util.Scanner;

public class Ej3_Operacion {

    Scanner input = new Scanner(System.in);
    private double numero1;
    private double numero2;

    public Ej3_Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Ej3_Operacion() {
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        System.out.println("Ingrese el primer numero");
        numero1 = input.nextDouble();
        System.out.println("Ingrese el segundo numero");
        numero2 = input.nextDouble();
    }

    public void sumar() {
        int suma = (int)(numero1 + numero2);
        System.out.println(numero1 + "+" + numero2 + "=" + suma);
    }

    public void resta() {
        int resta = (int)(numero1 - numero2);
        System.out.println(numero1 + "-" + numero2 + "=" + resta);
    }

    public void multiplicacion() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Error: multiplicacion por cero \n"
                    + "numero 1=" + numero1 + "\n"
                    + "numero 2= " + numero2);
        } else {
            double multi = numero1 * numero2;
            System.out.println(numero1 + "*" + numero2 + "=" + multi);
        }
    }

    public void division() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Error: multiplicacion por cero \n"
                    + "numero 1=" + numero1 + "\n"
                    + "numero 2= " + numero2);
        } else {
            double div = numero1 * numero2;
            System.out.println(numero1 + "/" + numero2 + "=" + div);
        }
    }
}
