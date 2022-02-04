
package libreriaextra.Persistencia;

import libreriaextra.Entities.Autor;

public class AutorDAO extends DAO<Autor> {
    
     @Override
    public void guardar(Autor autor){
        super.guardar(autor);
    }
    
    @Override
    public void eliminar(Autor autor){
        super.eliminar(autor);
    }
    
    @Override
    public void editar(Autor autor){
        super.editar(autor);
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
