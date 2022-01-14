/*
2. Declarar una clase llamada Circunferencia que tenga como atributo privado el radio 
de tipo real. A continuación, se deben crear los siguientes métodos: 
 
a) Método constructor que inicialice el radio pasado como parámetro. 
b) Métodos get y set para el atributo radio de la clase Circunferencia. 
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo 
del objeto. 
d) Método area(): para calcular el área de la circunferencia (Area=π∗radio!). 
e) Método perimetro(): para calcular el perímetro (Perimetro=2∗π∗radio).
 */
package Ej2.entidades;

import java.util.Scanner;

public class Circunferencia_Ej2 {

    Scanner input = new Scanner(System.in);
    
    private double radio;

    public Circunferencia_Ej2() {
    }

    
    public Circunferencia_Ej2(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        System.out.println("Ingrese radio");
        radio = input.nextDouble();
    }
    
    public void area(){
        double area;
        area = radio*Math.PI;
        System.out.println("El area es de "+area);
    }
    
    public void perimetro(){
        double perimetro;
        perimetro = 2*radio*Math.PI;
        System.out.println("El perimetro es de "+perimetro);
    }
}
