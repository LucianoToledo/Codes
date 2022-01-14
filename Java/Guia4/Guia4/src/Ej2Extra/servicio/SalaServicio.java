package Ej2Extra.servicio;

import Ej2Extra.Entidades.Espectador;
import Ej2Extra.Entidades.Pelicula;
import Ej2Extra.Entidades.Sala;
import java.util.Arrays;
//import java.util.HashSet;
import java.util.Scanner;

public class SalaServicio {

    private Scanner input;
//    private HashSet<Espectador> espectadores;

    public SalaServicio() {
        input = new Scanner(System.in).useDelimiter("\n");
//        espectadores = new HashSet<>();
    }

    public Sala crearSala() {

        System.out.println("Ingrese precio de la entrada");
        double entradaMonto = input.nextDouble();
        String[][] butacas = new String[8][6];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                butacas[i][j] = "";
            }
        }
        return new Sala(butacas, entradaMonto);
    }

    public void agrearEspectador(Espectador e, Sala s, Pelicula p) {

        if (e.getDinero() >= s.getEntrada() && e.getEdad() >= p.getEdadMinima() && contButacas(s) != 47) {
            s.getEspectador().add(e);
            asignarAsiento(s);
        } else {
            System.out.println("Espectador rechazado");
        }
    }

    public int contButacas(Sala s) {
        int contButacasVacias = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if (s.getButacas()[i][j].equalsIgnoreCase("")) {
                    contButacasVacias++;
                }
            }
        }
        if (contButacasVacias == 47) {
            System.out.println("Sala llena");
        }
        return contButacasVacias;
    }

    public void asignarAsiento(Sala s) {
        int fila;
        int columna;
        boolean band = false;
        do {
            fila = (int) ((Math.random() * 8));
            columna = (int) ((Math.random() * 6));
            if (s.getButacas()[fila][columna].equals("")) {
                s.getButacas()[fila][columna] = "x";
                System.out.println(s.getButacas()[fila][columna]);
                band = false;
            }
            System.out.println(fila + "  "+columna);
        } while (band);

//        int fila = (int) ((Math.random() * 8) + 1);
//        int columna = (int) ((Math.random() * 6) + 1);
//        if (!s.getButacas()[fila][columna].equalsIgnoreCase("")) {
//            s.getButacas()[fila][columna] = "x";
//        }else{
//            asignarAsiento(s);
//        }
    }

    public void mostrarSala(Sala s) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                switch (j) {
                    case 0:
                        System.out.print(i+1 + "A |" + s.getButacas()[i][j]);
                        break;
                    case 1:
                        System.out.print(i+1 + "B |" + s.getButacas()[i][j]);
                        break;
                    case 2:
                        System.out.print(i+1 + "C |" + s.getButacas()[i][j]);
                        break;
                    case 3:
                        System.out.print(i+1 + "D |" + s.getButacas()[i][j]);
                        break;
                    case 4:
                        System.out.print(i+1 + "E |" + s.getButacas()[i][j]);
                        break;
                    case 5:
                        System.out.print(i+1 + "F |" + s.getButacas()[i][j]);
                        break;
                }

            }
            System.out.println("");
        }
    }
}
