package Ej2.entidades;

public class Jugador {

    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador(int id) {
        this.id = id;
        nombre = "Jugador " + id;
        mojado = false; //todos los jugadores estan secos al inicio
    }

    public Jugador() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }

    public void disparo(Revolver r) {
//        System.out.println(r);
        if (r.mojar()) {
            mojado = true;
        } else {
            r.siguienteChorro();
        }
    }
}
