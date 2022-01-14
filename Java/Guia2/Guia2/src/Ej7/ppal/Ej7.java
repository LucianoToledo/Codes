/*7. Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:
•
Un constructor por defecto.
•
Un constructor con todos los atributos como parámetro.
•
Métodos getters y setters de cada atributo.
•
Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
•
Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
•
Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.
 */
package Ej7.ppal;

import Ej7.Servicios.PersonaServicio;
import Ej7.entidades.Persona;

public class Ej7 {

    public static void main(String[] args) { 
        
        Persona p1 = new Persona("Sofia",21,"F",51,156);
        System.out.println(p1);
        
        
        System.out.println("---------------");
        Persona p2 = new Persona();
        
        p2.setNombre("Lucho");
        p2.setEdad(21);
        p2.setSexo("M");
        p2.setAltura(179);
        p2.setPeso(80);
        System.out.println(p2);
        
        double temp = p1.getPeso()+p2.getAltura();
        System.out.println(temp);
        
        //El error de esta logica es que sobreescribo el objeto y no creo 4 diferentes
//        int i = 0, c1 = 0, c2 = 0, c3 = 0, m1 = 0, m2 = 0;
//        float prom1, prom2, prom3, promMay, promMen;
//
//        do {
//            PersonaServicio personaServicio = new PersonaServicio();
//            Persona persona = personaServicio.crearPersona();
//            System.out.println("---------");
//            switch (personaServicio.calcularIMC(persona)) {
//                case -1:
//                    System.out.println(persona.getNombre() + " se encuentra por debajo de su peso ideal");
//                    c1++;
//                    break;
//                case 0:
//                    System.out.println(persona.getNombre() + " se encuentra por en peso ideal");
//                    c2++;
//                    break;
//                case 1:
//                    System.out.println(persona.getNombre() + " se encuentra por encima de su peso ideal");
//                    c3++;
//                    break;
//            }
//
//            if (personaServicio.esMayorDeEdad(persona)) {
//                System.out.println(persona.getNombre() + " es mayor de edad");
//                m1++;
//            } else {
//                System.out.println(persona.getNombre() + " es menor de edad");
//                m2++;
//            }
//            System.out.println(persona);
//            System.out.println("---------");
//            i++;
//        } while (i != 4);
//
//        prom1 = (c1 / 4) * 100; //bajo imc
//        prom2 = (c2 / 4) * 100; //buen imc
//        prom3 = (c3 / 4) * 100; //mayor imc
//        promMay = (m1 / 4) * 100; //mayor edad
//        promMen = (m2 / 4) * 100; //menor edad
//
//        System.out.println("Porcentajes:\n"
//                + "Debajo de su peso ideal %" + prom1 + "\n"
//                + "En su peso ideal %" + prom2 + "\n"
//                + "Encima de su peso ideal %" + prom3 + "\n"
//                + "Mayores de edad %" + promMay + "\n"
//                + "Menores de edad %" + promMen);

    }
}

//En este codigo repito el codigo 4 veces para los 4 objetos, hay que arreglar que no calcula los porcentajes

//  int c1 = 0, c2 = 0, c3 = 0, m1 = 0, m2 = 0;
//        float prom1, prom2, prom3, promMay, promMen;
//
//        PersonaServicio personaServicio = new PersonaServicio();
//        Persona persona1 = personaServicio.crearPersona();
//
//        System.out.println("---------");
//        switch (personaServicio.calcularIMC(persona1)) {
//            case -1:
//                System.out.println(persona1.getNombre() + " se encuentra por debajo de su peso ideal");
//                c1++;
//                break;
//            case 0:
//                System.out.println(persona1.getNombre() + " se encuentra por en peso ideal");
//                c2++;
//                break;
//            case 1:
//                System.out.println(persona1.getNombre() + " se encuentra por encima de su peso ideal");
//                c3++;
//                break;
//        }
//
//        if (personaServicio.esMayorDeEdad(persona1)) {
//            System.out.println(persona1.getNombre() + " es mayor de edad");
//            m1++;
//        } else {
//            System.out.println(persona1.getNombre() + " es menor de edad");
//            m2++;
//        }
//        System.out.println(persona1);
//        System.out.println("---------");
//
//        Persona persona2 = personaServicio.crearPersona();
//
//        System.out.println("---------");
//        switch (personaServicio.calcularIMC(persona2)) {
//            case -1:
//                System.out.println(persona2.getNombre() + " se encuentra por debajo de su peso ideal");
//                c1++;
//                break;
//            case 0:
//                System.out.println(persona2.getNombre() + " se encuentra por en peso ideal");
//                c2++;
//                break;
//            case 1:
//                System.out.println(persona2.getNombre() + " se encuentra por encima de su peso ideal");
//                c3++;
//                break;
//        }
//
//        if (personaServicio.esMayorDeEdad(persona2)) {
//            System.out.println(persona2.getNombre() + " es mayor de edad");
//            m1++;
//        } else {
//            System.out.println(persona2.getNombre() + " es menor de edad");
//            m2++;
//        }
//        System.out.println(persona2);
//        System.out.println("---------");
//
//        Persona persona3 = personaServicio.crearPersona();
//
//        System.out.println("---------");
//        switch (personaServicio.calcularIMC(persona3)) {
//            case -1:
//                System.out.println(persona3.getNombre() + " se encuentra por debajo de su peso ideal");
//                c1++;
//                break;
//            case 0:
//                System.out.println(persona3.getNombre() + " se encuentra por en peso ideal");
//                c2++;
//                break;
//            case 1:
//                System.out.println(persona3.getNombre() + " se encuentra por encima de su peso ideal");
//                c3++;
//                break;
//        }
//
//        if (personaServicio.esMayorDeEdad(persona3)) {
//            System.out.println(persona3.getNombre() + " es mayor de edad");
//            m1++;
//        } else {
//            System.out.println(persona3.getNombre() + " es menor de edad");
//            m2++;
//        }
//        System.out.println(persona3);
//        System.out.println("---------");
//
//        Persona persona4 = personaServicio.crearPersona();
//
//        System.out.println("---------");
//        switch (personaServicio.calcularIMC(persona4)) {
//            case -1:
//                System.out.println(persona4.getNombre() + " se encuentra por debajo de su peso ideal");
//                c1++;
//                break;
//            case 0:
//                System.out.println(persona4.getNombre() + " se encuentra por en peso ideal");
//                c2++;
//                break;
//            case 1:
//                System.out.println(persona4.getNombre() + " se encuentra por encima de su peso ideal");
//                c3++;
//                break;
//        }
//
//        if (personaServicio.esMayorDeEdad(persona4)) {
//            System.out.println(persona4.getNombre() + " es mayor de edad");
//            m1++;
//        } else {
//            System.out.println(persona4.getNombre() + " es menor de edad");
//            m2++;
//        }
//        System.out.println(persona4);
//
//        System.out.println("---------");
//        prom1 = (c1 / 4) * 100; //bajo imc
//        prom2 = (c2 / 4) * 100; //buen imc
//        prom3 = (c3 / 4) * 100; //mayor imc
//        promMay = (m1 / 4) * 100; //mayor edad
//        promMen = (m2 / 4) * 100; //menor edad
//
//        System.out.println("Porcentajes:\n"
//                + "Debajo de su peso ideal %" + prom1 + "\n"
//                + "En su peso ideal %" + prom2 + "\n"
//                + "Encima de su peso ideal %" + prom3 + "\n"
//                + "Mayores de edad %" + promMay + "\n"
//                + "Menores de edad %" + promMen);
//        System.out.println(persona1);
//        System.out.println(persona2);
//        System.out.println(persona3);
//        System.out.println(persona4);
