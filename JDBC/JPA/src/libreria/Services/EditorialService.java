package libreria.Services;

import libreria.Entidades.Editorial;
import libreria.persistencia.EditorialDAO;

public class EditorialService {

    private final EditorialDAO dao;

    public EditorialService() {
        dao = new EditorialDAO();
    }
    
    public void crear(String id, Boolean alta, String nombre){
        Editorial editorial = new Editorial(id, alta, nombre);
        dao.guardar(editorial);
    }
    
    public Editorial buscarPorId(String id){
        return dao.buscarPorId(id);
    }
}
