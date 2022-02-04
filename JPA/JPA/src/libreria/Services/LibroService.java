package libreria.Services;

import java.util.List;
import libreria.Entidades.Autor;
import libreria.Entidades.Editorial;
import libreria.Entidades.Libro;
import libreria.persistencia.LibroDAO;

public class LibroService {

    private final LibroDAO dao;

    public LibroService() {
        dao = new LibroDAO();
    }

    public void crear(String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Boolean alta, Editorial editorial, Autor autor) {
        Libro libro = new Libro(titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, true, editorial, autor);
        dao.guardar(libro);
    }

    public void eliminar(String id) throws Exception {
        Libro l = buscarPorIsbn(id);

        validarLibroNull(l);

        dao.eliminar(l);
    }

    public List<Libro> listarLibros() {
        try {
            return dao.listarTodos();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //9)Búsqueda de un libro por ISBN.
    public Libro buscarPorIsbn(String isbn) {
        return dao.buscarPorIsbn(isbn);
    }

    //10)Búsqueda de un libro por Título.
    public Libro buscarPotTitulo(String titulo) throws Exception {
        Libro l = dao.buscarPotTitulo(titulo);
        validarLibroNull(l);
        return l;
    }

    //11) Búsqueda de un libro/s por nombre de Autor.     
    public List<Libro> buscarLibroPorAutor(String nombre) throws Exception {
        List<Libro> l = dao.buscarLibroPorAutor(nombre);
        validarListaLibroNull(l);
        return l;
    }

    //12) Búsqueda de un libro/s por nombre de Editorial
    public List<Libro> buscarLibroPorEditorial(String nombre) throws Exception {
        List<Libro> l = dao.buscarLibroPorEditorial(nombre);
        validarListaLibroNull(l);
        return l;
    }

    private void validarLibroNull(Libro l) throws Exception {
        if (l == null) {
            throw new Exception("No existe ese libro");
        }
    }

    private void validarListaLibroNull(List<Libro> l) throws Exception {

        if (l.isEmpty()) {
            throw new Exception("No existe ese libro");
        }
    }

}
