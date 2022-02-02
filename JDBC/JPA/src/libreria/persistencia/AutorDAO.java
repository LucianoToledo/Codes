package libreria.persistencia;

import java.util.List;
import libreria.Entidades.Autor;

public class AutorDAO extends DAO {

    public void guardar(Autor objeto) {
        conectar();
        em.getTransaction().begin();
        em.persist(objeto);
        em.getTransaction().commit();
        desconectar();
    }

    public Autor editar(Autor objeto) {
        conectar();
        em.getTransaction().begin();
        Autor u = em.merge(objeto);
        em.getTransaction().commit();
        desconectar();
        return u;
    }

    public void eliminar(Autor objeto) {
        conectar();
        em.getTransaction().begin();
        em.remove(objeto);
        em.getTransaction().commit();
        desconectar();
    }

    public Autor buscarPorNombre(String nombre) {
        conectar();
        Autor a = (Autor) em.createQuery("SELECT m FROM Autor m WHERE m.nombre LIKE :nombre")
                .setParameter("nombre", "%" + nombre + "%")
                .getSingleResult();
        desconectar();
        return a;
    }
    
    
    public Autor buscarPorId(String id) {
        conectar();
        Autor autor = em.find(Autor.class, id);
        desconectar();
        return autor;
    }

}
