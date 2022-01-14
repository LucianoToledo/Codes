package Ej2Extra.Entidades;

import java.util.HashSet;

public class Sala {

    private HashSet<Espectador> espectador;
    private final String[][] butacas;
    private double entrada;

//    public Sala(double entrada) {
//        espectador = new HashSet<>();
//        butacas = new String[8][6];
//        this.entrada = entrada;
//    }

    public Sala( String[][] butacas, double entrada) {
        espectador = new HashSet<>();
        this.butacas = butacas;
        this.entrada = entrada;
    }

    public double getEntrada() {
        return entrada;
    }

    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }

    public HashSet<Espectador> getEspectador() {
        return espectador;
    }

    public void setEspectador(HashSet<Espectador> espectador) {
        this.espectador = espectador;
    }

    public String[][] getButacas() {
        return butacas;
    }

    @Override
    public String toString() {
        return "Sala{" + "espectador=" + espectador + ", butacas=" + butacas + ", entrada=" + entrada + '}';
    }

   

}
