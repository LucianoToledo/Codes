package libreria.persistencia;

import libreria.Entidades.Libro;

public class LibroDAO extends DAO {
    
    public void guardar(Libro objeto){
        conectar();
        em.getTransaction().begin();
        em.persist(objeto);
        em.getTransaction().commit();
        desconectar();
    }
    
    public Libro editar(Libro objeto){
        conectar();
        em.getTransaction().begin();
        Libro u = em.merge(objeto);
        em.getTransaction().commit();
        desconectar();
        return u;
    }
    
    public void eliminar(Libro objeto){
        conectar();
        em.getTransaction().begin();
        em.remove(objeto);
        em.getTransaction().commit();
        desconectar();
    }
}
