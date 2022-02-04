package libreria.Services;

import java.util.List;
import libreria.Entidades.Autor;
import libreria.persistencia.AutorDAO;

public class AutorService {

    private final AutorDAO dao;

    public AutorService() {
        dao = new AutorDAO();
    }
    
    public void crear(String id,String nombre, Boolean alta){
        Autor autor = new Autor(id, nombre, alta);
        dao.guardar(autor);
    }
    
    //8)Búsqueda de un Autor por nombre
    public Autor buscarPorNombre(String nombre){
        return dao.buscarPorNombre(nombre);
    }
    
    public Autor buscarPorID(String id){
        return dao.buscarPorId(id);
    }
    
    
}
