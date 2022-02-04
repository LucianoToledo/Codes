package libreriaextra.Persistencia;

import java.util.List;
import libreriaextra.Entities.Prestamo;

public class PrestamoDAO extends DAO<Prestamo>{
    
       @Override
    public void guardar(Prestamo prestamo){
        super.guardar(prestamo);
    }
    
    @Override
    public void eliminar(Prestamo prestamo){
        super.eliminar(prestamo);
    }
    
    @Override
    public void editar(Prestamo prestamo){
        super.editar(prestamo);
    }
    
    public Prestamo buscarPorId(String id){
        conectar();
        Prestamo pr = em.find(Prestamo.class, id);
        desconectar();
        return pr;
    }
    
    public List<Prestamo> listarTodos() throws Exception{
        conectar();
        List<Prestamo> pre = em.createQuery("SELECT p FROM Prestamo p")
                .getResultList();
        desconectar();
        return pre;
    }
}
