package libreriaextra.Services;

import java.util.List;
import libreriaextra.Entities.Autor;
import libreriaextra.Persistencia.AutorDAO;

public class AutorService {

    private final AutorDAO dao;

    public AutorService() {
        dao = new AutorDAO();
    }

    public Autor crear(String nombre) throws Exception {
        Autor autor = new Autor();
        try {
            autor.setNombre(nombre);
            autor.setAlta(true);
            dao.guardar(autor);
            return autor;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    //8)Búsqueda de un Autor por nombre
    public Autor buscarPorNombre(String nombre) throws Exception {
        Autor a = dao.buscarPorNombre(nombre);
        validarAutorNull(a);
        return a;
    }

    public Autor buscarPorID(String id) throws Exception {
        Autor a = dao.buscarPorId(id);
        validarAutorNull(a);
        return a;
    }

    private void validarAutorNull(Autor a) throws Exception {
        if (a == null) {
            throw new Exception("No existe ese autor");
        }
    }

    private void validarListaAutorNull(List<Autor> a) throws Exception {

        if (a.isEmpty()) {
            throw new Exception("No existe ese autor");
        }
    }
}
