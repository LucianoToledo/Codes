/*
9. Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
•
Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
20
•
Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
•
Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número
 */
package Ej9.ppal;

import Ej9.entidades.Matematica;
import Ej9.servicio.MatematicaServicio;
import java.util.Scanner;

public class Ej9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        MatematicaServicio matSer = new MatematicaServicio();
        Matematica matematica = new Matematica();
        
        System.out.println("Ingrese el primer numero");
        matematica.setNum1(input.nextFloat());
        System.out.println("Ingrese el segundo numero");
        matematica.setNum2(input.nextFloat());
        System.out.println("");
        
        System.out.println("El mayor numero es "+matSer.devolverMayor(matematica)+"\n"
                + "");
        matSer.calcularPotencia(matematica);
        matSer.calculaRaiz(matematica);
    }
    
}
