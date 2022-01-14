/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ1.entidades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PerroServicio {

    private Scanner input;
    private ArrayList<Perro> perros;

    public PerroServicio() {
        input = new Scanner(System.in).useDelimiter("\n");
        perros = new ArrayList<>();
    }

    public Perro crearPerro() {
        System.out.println("Ingrese nombre del perro");
        String nom = input.next();
        System.out.println("Ingrese raza del perro");
        String raza = input.next();
        System.out.println("Ingrese edad del perro");
        int edad = input.nextInt();
        System.out.println("Ingrese tamanio del perro");
        int tamanio = input.nextInt();
        return new Perro(nom, raza, edad, tamanio);
    }

    public void agregarPerro(Perro e) {
        perros.add(e);
    }
}
