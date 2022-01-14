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
package Ej3.Servicio;

import Ej3.entidades.Raices;

public class RaicesServicio {

    public double getDiscriminante(Raices raices) {
        double discriminante = (Math.pow(raices.getB(), 2)) - 4 * raices.getA() * raices.getC();
        return discriminante;
    }

    public boolean tieneRaices(Raices raices) { //2 raices
        return getDiscriminante(raices) > 0;
    }

    public boolean tieneRaiz(Raices raices) { //1 raiz
        return getDiscriminante(raices) == 0;
    }

    public void obtenerRaices(Raices raices) { //2 raices
        if (tieneRaices(raices)) {
            calcular(raices);
        }
    }

    public void obtenerRaiz(Raices raices) { //1 raiz
        if (tieneRaiz(raices)) {
            calcular(raices);
        }
    }

    public void calcular(Raices raices) {
        double x1 = (-raices.getB() + Math.sqrt(getDiscriminante(raices))) / (2 * raices.getA()); // +
        double x2 = (-raices.getB() - Math.sqrt(getDiscriminante(raices))) / (2 * raices.getA()); // -

        if (x1==x2) {
            System.out.println("X1 :" + x1);
        } else {
            System.out.println("X1: " + x1);
            System.out.println("X2: " + x2);
        }
    }

    public void mensaje(Raices raices) {
        if(!tieneRaiz(raices) && !tieneRaices(raices))
        System.out.println("No es posible calcular las raices");
    }

}
