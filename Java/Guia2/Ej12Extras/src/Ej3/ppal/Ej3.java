/*3. Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b
y c. Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
•
Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
•
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
•
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución,
para que esto ocurra, el discriminante debe ser igual que 0.
•
Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.
•
Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
•
Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en
caso de no existir solución, se mostrará un mensaje.
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
delante de -b*/
package Ej3.ppal;

import Ej3.Servicio.RaicesServicio;
import Ej3.entidades.Raices;
import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        RaicesServicio raicesServicio = new RaicesServicio();

        System.out.println("Ingrese a, b y c");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        Raices raices = new Raices(a, b, c);

        System.out.println("-b±√((b^2)-(4*a*c))/(2*a)");
        System.out.println("-" + raices.getB() + "+- √((" + raices.getB() + "^2)-4*" + raices.getA() + "*" + raices.getC() + ")/(2*" + raices.getA() + ")");
        System.out.println(raices);
        System.out.println("-----------");

        raicesServicio.obtenerRaices(raices);
        raicesServicio.obtenerRaiz(raices);
        raicesServicio.mensaje(raices);
    }

}
