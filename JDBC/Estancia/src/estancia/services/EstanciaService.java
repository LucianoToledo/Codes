package estancia.services;

import estancia.entidades.Estancia;
import estancia.persistencia.EstanciaDAO;
import java.util.List;

public class EstanciaService {
    
    private EstanciaDAO dao;
    
    public EstanciaService(){
        this.dao = new EstanciaDAO();
    }
        
    //e) Listar los datos de todos los clientes que en algún momento realizaron una estancia
    //y la descripción de la casa donde la realizaron.
    
    public List<Estancia> listarClientes() throws Exception{
        List<Estancia> estancias = dao.listarClientes();
        return estancias;
    }
    
    public void mostrarClientes() throws Exception{
            List<Estancia> estancias = listarClientes();
            
            for (Estancia estancia : estancias) {
                System.out.println(estancia);
        }
    }
}
