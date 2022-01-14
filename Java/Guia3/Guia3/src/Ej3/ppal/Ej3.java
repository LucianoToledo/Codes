/*Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista
de tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Despues de ese bluce tendremos el siguiente método en la clase Alumno:
Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama
al método. Dentro del método se usará la lista notas para calcular el promedio
final de alumno. Siendo este promedio final, devuelto por el método y mostrado
en el main*/
package Ej3.ppal;

import Ej3.entidades.Alumno;
import Ej3.servicio.AlumnoServicio;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        AlumnoServicio alumnoServicio = new AlumnoServicio();
        
        ArrayList<Alumno> listaAlumnos = new ArrayList();
        String opc;
        do {
            
            listaAlumnos.add(alumnoServicio.crearAlumno());
            System.out.println("Desea agregar otro alumno? S/N");
            opc = input.next();
            
            while (!opc.equalsIgnoreCase("s") && !opc.equalsIgnoreCase("n")) {
                System.out.println("Opcion no valida \n"
                        + "Ingrese nuevamente");
                opc = input.next();
            }
            
        } while (opc.equalsIgnoreCase("s"));
        
        alumnoServicio.notaFinal(listaAlumnos);
        alumnoServicio.mostrarAlumnos(listaAlumnos);

    }
    
}
