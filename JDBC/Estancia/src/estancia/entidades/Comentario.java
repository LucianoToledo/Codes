package estancia.entidades;

public class Comentario {
    private int id_comentario;
    private String comentario;

    public Comentario() {
    }

    public Comentario(int id_comentario, String comentario) {
        this.id_comentario = id_comentario;
        this.comentario = comentario;
    }

    public int getId_comentario() {
        return id_comentario;
    }

    public void setId_comentario(int id_comentario) {
        this.id_comentario = id_comentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Comentario{" + "id_comentario=" + id_comentario + ", comentario=" + comentario + '}';
    }
    
    
}
