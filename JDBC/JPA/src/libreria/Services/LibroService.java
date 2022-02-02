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

    public void crear(String id,String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Boolean alta, Editorial editorial, Autor autor) {
        Libro libro = new Libro(id, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, alta, editorial, autor);
        dao.guardar(libro);
    }

    //9)Búsqueda de un libro por ISBN.
    public Libro buscarPorIsbn(String isbn) {
        return dao.buscarPorIsbn(isbn);
    }

    //10)Búsqueda de un libro por Título.
    public Libro buscarPotTitulo(String titulo) {
        return dao.buscarPotTitulo(titulo);
    }

    //11) Búsqueda de un libro/s por nombre de Autor.     
    public List<Libro> buscarLibroPorAutor(String nombre) {
        return dao.buscarLibroPorAutor(nombre);
    }

    //12) Búsqueda de un libro/s por nombre de Editoria
    public List<Libro> buscarLibroPorEditorial(String nombre) {
        return dao.buscarLibroPorEditorial(nombre);
    }

}
