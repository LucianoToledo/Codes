/*
1. Crear  una  clase  llamada  Libro  que  contenga  los  siguientes  atributos:  ISBN,  Título, 
Autor,  Número  de  páginas,  y  un  constructor  con  todos  los  atributos  pasados  por 
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los 
datos al usuario y luego informar mediante otro método el número de ISBN, el título, 
el autor del libro y el numero de páginas
 */
package Ej1.entidades;

import java.util.Scanner;

public class Libro_Ej1 {
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    private int ISBN;
    private String titulo;
    private String autor;
    private int numPag;

    public Libro_Ej1() { //sirve para meter valores por defecto
    }

    public Libro_Ej1(int ISBN, String titulo, String autor, int numPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    
    public void cargarDatos(){
        System.out.println("Ingrese ISBN");
        ISBN = input.nextInt();
        System.out.println("Ingrese Titulo");
        titulo=input.next();
        System.out.println("Ingrese autor");
        autor=input.next();
        System.out.println("Ingrese cantidad de paginas");
        numPag = input.nextInt();
    }
    
    public void Mostrar(){
        System.out.println("ISBN: "+ISBN);
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Paginas: "+numPag);
    }    
}
