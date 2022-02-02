package libreria.persistencia;

import libreria.Entidades.Editorial;

public class EditorialDAO extends DAO{
    public void guardar(Editorial objeto){
        conectar();
        em.getTransaction().begin();
        em.persist(objeto);
        em.getTransaction().commit();
        desconectar();
    }
    
    public Editorial editar(Editorial objeto){
        conectar();
        em.getTransaction().begin();
        Editorial u = em.merge(objeto);
        em.getTransaction().commit();
        desconectar();
        return u;
    }
    
    public void eliminar(Editorial objeto){
        conectar();
        em.getTransaction().begin();
        em.remove(objeto);
        em.getTransaction().commit();
        desconectar();
    }
    
    public Editorial buscarPorId(String id) {
        conectar();
        Editorial ed = em.find(Editorial.class, id);
        desconectar();
        return ed;
    }
}
