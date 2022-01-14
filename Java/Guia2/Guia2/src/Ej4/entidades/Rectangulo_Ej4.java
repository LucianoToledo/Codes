/*4. Crear  una  clase  Rectángulo  que  modele  rectángulos  por  medio  de  un  atributo 
privado  base  y  un  atributo  privado  altura.  La  clase  incluirá  un  método  para  crear  el 
rectángulo  con  los  datos  del  Rectángulo  dados  por  el  usuario.  También  incluirá  un 
método  para  calcular  la  superficie  del  rectángulo  y  un  método  para  calcular  el 
perímetro del rectángulo. Por último, tendremos un método que dibujará el 
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir 
los métodos getters, setters y constructores correspondientes. 
 
Superficie = base * altura / Perímetro = (base + altura) * 2
 */
package Ej4.entidades;

import java.util.Scanner;

public class Rectangulo_Ej4 {

    Scanner input = new Scanner(System.in);
    private int base;
    private int altura;

    public Rectangulo_Ej4(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo_Ej4() {
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void ingresarDatos() {
        System.out.println("Ingrese base");
        base = input.nextInt();
        System.out.println("Ingrese altura");
        altura = input.nextInt();
    }

    public void superficie() {
        int sup = (base * altura);
        System.out.println("Superficie: " + sup + " m2");
    }

    public void perimetro() {
        int perimetro = ((base + altura) * 2);
        System.out.println("Perimetro: " + perimetro);
    }

    public void dinujarCuadrado() {
       for (int i = 0; i < base; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        for (int j = 0; j < altura-2; j++) {
            for (int i = 0; i < base; i++) {
                if (i == 0 || i == (base - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
        for (int i = 0; i < base; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
//    for (int i = 0;
//    i< base ;
//    i
//
//    
//        ++) {
//            System.out.print("*");
//    }

//    System.out.println (
//    "");
//
//    for (int j = 0;
//    j< base
//    -2; j
//
//    
//        ++) {
//            for (int i = 0; i < altura; i++) {
//            if (i == 0 || i == (base - 1)) {
//                System.out.print("*");
//            } else {
//                System.out.print(" ");
//            }
//        }
//
//        for (int i = 0; i < base; i++) {
//            System.out.print("*");
//        }
//        System.out.println("");
}
