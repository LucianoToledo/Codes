//1. Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar
//de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el
//código con una cláusula try-catch para probar la nueva excepción que debe ser
//controlada
package Ej1.Entidades;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }

    public void esMayorDeEdad() {
        if (edad < 18) {
            System.out.println(nombre + " es menor de edad");
        } else {
            System.out.println(nombre + " es mayor de edad");
        }
    }
}
