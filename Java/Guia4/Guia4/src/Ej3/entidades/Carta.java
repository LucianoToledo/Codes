
package Ej3.entidades;

public class Carta {
    private int numero;
    private String pinta;

    public Carta(int numero, String pinta) {
        this.numero = numero;
        this.pinta = pinta;
    }

    public Carta() {
    }
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPinta() {
        return pinta;
    }

    public void setPinta(String pinta) {
        this.pinta = pinta;
    }

    @Override
    public String toString() {
        return "Carta{" + "" + numero + " de " + pinta + '}';
    }
    
    
}
