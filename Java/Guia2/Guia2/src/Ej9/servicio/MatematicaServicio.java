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
package Ej9.servicio;

import Ej9.entidades.Matematica;

public class MatematicaServicio {

    public float devolverMayor(Matematica matematica) {
        return Math.max(matematica.getNum1(), matematica.getNum2());
    }

    public void calcularPotencia(Matematica matematica) {
        float n1 = Math.round(matematica.getNum1());
        float n2 = Math.round(matematica.getNum2());

        double potencia = Math.pow(Math.max(n2, n1), Math.min(n2, n1));
        System.out.println(Math.max(n2, n1) + "^" + Math.min(n2, n1) + "=" + potencia + "\n"
                + "");
    }

    public void calculaRaiz(Matematica matematica) {
        double n1 = Math.abs(matematica.getNum1());
        double n2 = Math.abs(matematica.getNum2());

        double raiz = Math.sqrt(Math.min(n1, n2));
        System.out.println("Sqrt(" + Math.min(n1, n2) + ")=" + raiz + "\n"
                + "");
    }
}
