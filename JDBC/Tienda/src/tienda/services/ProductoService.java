package tienda.services;

import java.util.List;
import tienda.entidades.Producto;
import tienda.persistencia.TiendaDAO;

public class ProductoService {

    private TiendaDAO dao;

    public ProductoService() {
        this.dao = new TiendaDAO();
    }
    
     public List<Producto> listarTodos() throws Exception {
        List<Producto> productos = dao.listarTodos();
        return productos;
    }
    
    //a) Lista el nombre de todos los productos que hay en la tabla producto
    
    public void mostrarTodos() throws Exception{
        List<Producto> productos = listarTodos();
        
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

}
