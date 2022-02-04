package libreriaextra.Services;

import java.util.List;
import libreriaextra.Entities.Editorial;
import libreriaextra.Persistencia.EditorialDAO;

public class EditorialService {

    private final EditorialDAO dao;

    public EditorialService() {
        dao = new EditorialDAO();
    }

    public Editorial crear(String nombre) throws Exception{
        Editorial editorial = new Editorial();
        try {
            editorial.setNombre(nombre);
            editorial.setAlta(true);
            dao.guardar(editorial);
            return editorial;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Editorial buscarPorId(String id) throws Exception {
        Editorial e = dao.buscarPorId(id);
        validarEditorialNull(e);
        return e;
    }

    public void eliminar(String id) throws Exception {
        Editorial e = buscarPorId(id);
        dao.eliminar(e);
    }

    public List<Editorial> listarTodos() throws Exception {
        List<Editorial> e = dao.listarTodos();
        validarListaEditorialNull(e);
        return e;
    }

    private void validarEditorialNull(Editorial e) throws Exception {
        if (e == null) {
            throw new Exception("No existe esa Editorial");
        }
    }

    private void validarListaEditorialNull(List<Editorial> e) throws Exception {

        if (e.isEmpty()) {
            throw new Exception("No existe esa Editorial");
        }
    }
}
