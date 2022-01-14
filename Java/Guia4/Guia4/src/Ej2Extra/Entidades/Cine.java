package Ej2Extra.Entidades;

public class Cine {
    private Pelicula pelicula;
    private Sala sala;
    

    public Cine(Pelicula pelicula, Sala sala) {
        this.pelicula = pelicula;
        this.sala = sala;
        
    }

    public Cine() {
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", sala=" + sala + '}';
    }


    
}
