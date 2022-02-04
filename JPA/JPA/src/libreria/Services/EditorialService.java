package libreria.Services;

import java.util.List;
import libreria.Entidades.Editorial;
import libreria.persistencia.EditorialDAO;

public class EditorialService {

    private final EditorialDAO dao;

    public EditorialService() {
        dao = new EditorialDAO();
    }

    public void crear(String nombre) {
        Editorial editorial = new Editorial(true, nombre);
        dao.guardar(editorial);
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
        validarListaLibroNull(e);
        return e;
    }

    private void validarEditorialNull(Editorial e) throws Exception {
        if (e == null) {
            throw new Exception("No existe ese libro");
        }
    }

    private void validarListaLibroNull(List<Editorial> e) throws Exception {

        if (e.isEmpty()) {
            throw new Exception("No existe ese libro");
        }
    }
}
