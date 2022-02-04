package libreriaextra.Persistencia;

import java.util.List;
import libreriaextra.Entities.Editorial;

public class EditorialDAO extends DAO<Editorial> {
     @Override
    public void guardar(Editorial editorial){
        super.guardar(editorial);
    }
    
    @Override
    public void eliminar(Editorial editorial){
        super.eliminar(editorial);
    }
    
    @Override
    public void editar(Editorial editorial){
        super.editar(editorial);
    }
    
     public Editorial buscarPorId(String id) {
        conectar();
        Editorial ed = em.find(Editorial.class, id);
        desconectar();
        return ed;
    }

    public List<Editorial> listarTodos() {
        conectar();
        List<Editorial> li = em.createQuery("SELECT e FROM Editorial e").getResultList();
        desconectar();
        return li;
    }
    
}
