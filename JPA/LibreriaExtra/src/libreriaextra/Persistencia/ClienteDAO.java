package libreriaextra.Persistencia;

import libreriaextra.Entities.Cliente;

public class ClienteDAO extends DAO<Cliente>{
       @Override
    public void guardar(Cliente cliente){
        super.guardar(cliente);
    }
    
    @Override
    public void eliminar(Cliente cliente){
        super.eliminar(cliente);
    }
    
    @Override
    public void editar(Cliente cliente){
        super.editar(cliente);
    }
    
      public Cliente buscarPorId(String id) {
        conectar();
        Cliente cliente = em.find(Cliente.class, id);
        desconectar();
        return cliente;
    }
}
