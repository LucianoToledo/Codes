package Ej1Extra;

import Ej1Extra.Entidades.PerroExtra;
import Ej1Extra.Entidades.PersonaExtra;
import Ej1Extra.Servicio.PerroServicioExtra;
import Ej1Extra.Servicio.PersonaServicioExtra;
import java.util.Scanner;

public class Ej1Extra {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        PersonaServicioExtra pS = new PersonaServicioExtra();
        PerroServicioExtra perroS = new PerroServicioExtra();

        String opc, opc1;
        do {
            System.out.println("Desea crear Persona? S/N");
            opc = input.next();
            if (opc.equalsIgnoreCase("s")) {
                PersonaExtra persona = pS.crearPersona();
                pS.agregarPersona(persona);

            } else if (!(opc.equalsIgnoreCase("n"))) {
                System.out.println("Opcion no valida");
            }
        } while (!"n".equalsIgnoreCase(opc));

        do {
            System.out.println("Desea Crear un perro S/N");
            opc = input.next();
            if (opc.equalsIgnoreCase("s")) {

                PerroExtra perro = perroS.crearPerro();
                perroS.agregarPerro(perro);

            } else if (!(opc.equalsIgnoreCase("n"))) {
                System.out.println("Opcion no valida");
            }
        } while (!"n".equalsIgnoreCase(opc));

        do {
            System.out.println("ADOPTAR PERRO");
            pS.asignarPerro(pS.seleccionarPersona(), perroS.seleccionarPerro());
            System.out.println("Desea asignar otro perro?");
            opc = input.next();
        } while (!opc.equalsIgnoreCase("n"));
        pS.mostrarPersonas();
        perroS.mostrarPerros();
        perroS.mostrarPerrosAdoptados();
        //validar que la persona no adopte 2 veces, si adopta una vez y despues otra
        //se sobreescribe el perro adopotado la priemra vez
    }
}
