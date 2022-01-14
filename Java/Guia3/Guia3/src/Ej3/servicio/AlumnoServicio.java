package Ej3.servicio;

import Ej3.entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoServicio {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Alumno crearAlumno() {
        System.out.println("Ingrese nombre del alumno");
        String nombre = input.next();

        return new Alumno(nombre, ingresarNotas());
    }

    public ArrayList ingresarNotas() {
        int i = 0;
        Integer nota;
        ArrayList<Integer> aux = new ArrayList();
        do {
            System.out.println("Ingrese nota " + (i + 1));
            nota = input.nextInt();
            while (nota < 0 || nota > 11) {
                System.out.println("La nota debe estar entre 1 y 10");
                nota = input.nextInt();
            }
            aux.add(nota);
            i++;

        } while (i != 3);
        return aux;
    }

    public void notaFinal(ArrayList<Alumno> lista) {

        Integer suma = 0;
        int j = 0;
        int i = validarAlumno(lista);
        if (i == -1) {
            System.out.println("El alumno no existe");
        }else{
            do {
            suma = lista.get(i).getNotas().get(j) + suma;
            j++;
        } while (j != 3);
        double prom = suma / 3;
        System.out.println("Promedio: " + prom);
        }
    }

    public String validarOpc(String opc) {
        while (!opc.equalsIgnoreCase("s") && !opc.equalsIgnoreCase("n")) {
            System.out.println("Opcion no valida \n"
                    + "Ingrese nuevamente");
            opc = input.next();
        }
        return opc;
    }

    public int validarAlumno(ArrayList<Alumno> lista) {

        int flag = -1;

        System.out.println("Ingrese Alumno a calcular promedio");
        String opc = input.next();

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().equals(opc)) {
                flag = i;
            }
        }
        return flag;
    }

    public void mostrarAlumnos(ArrayList<Alumno> lista) {
        lista.forEach((listaAlumno) -> System.out.println(listaAlumno));
    }
}
