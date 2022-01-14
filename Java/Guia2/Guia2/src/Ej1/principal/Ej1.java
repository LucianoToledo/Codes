/*
1. Crear  una  clase  llamada  Libro  que  contenga  los  siguientes  atributos:  ISBN,  Título, 
Autor,  Número  de  páginas,  y  un  constructor  con  todos  los  atributos  pasados  por 
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los 
datos al usuario y luego informar mediante otro método el número de ISBN, el título, 
el autor del libro y el numero de páginas
 */
package Ej1.principal;

import Ej1.entidades.Libro_Ej1;

public class Ej1 {

    public static void main(String[] args) {
        
        System.out.println("Ingresar Libro");
        
        Libro_Ej1 l = new Libro_Ej1();
        l.cargarDatos();
        
        System.out.println("Datos de libro");
        l.Mostrar();
        System.out.println("");
        
        
    }
    
}
