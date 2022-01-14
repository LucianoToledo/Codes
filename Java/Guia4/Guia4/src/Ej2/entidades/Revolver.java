package Ej2.entidades;

public class Revolver {

    private int posActual;
    private int posAgua;

    public Revolver(int posActual, int posAgua) {
        this.posActual = posActual;
        this.posAgua = posAgua;
    }

    public Revolver() {
    }

    public int getPosicionActual() {
        return posActual;
    }

    public void setPosicionActual(int posActual) {
        this.posActual = posActual;
    }

    public int getPosicionAgua() {
        return posAgua;
    }

    public void setPosicionAgua(int posAgua) {
        this.posAgua = posAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posActual=" + posActual + ", posAgua=" + posAgua + '}';
    }

    public void llenarRevolver() {
        posActual = (int) ((Math.random() * 6) + 1);
        posAgua = (int) ((Math.random() * 6) + 1);
    }

    public boolean mojar() {
        return posActual == posAgua;
    }

    public void siguienteChorro() {

        if (posActual == 6) {
            posActual = 1;
        } else {
            posActual++;
        }
    }

}
