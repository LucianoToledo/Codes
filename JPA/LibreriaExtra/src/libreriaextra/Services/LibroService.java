package libreriaextra.Services;

import java.util.List;
import libreriaextra.Entities.Autor;
import libreriaextra.Entities.Editorial;
import libreriaextra.Entities.Libro;
import libreriaextra.Persistencia.LibroDAO;

public class LibroService {
    
    private final LibroDAO dao;
    private final EditorialService editorialService;
    private final AutorService autorService;
    
    public LibroService() {
        dao = new LibroDAO();
        editorialService = new EditorialService();
        autorService = new AutorService();
    }

    //en este constructor le paso los objetos de Editorial y Autor
    public Libro crear(String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Editorial editorial, Autor autor) throws Exception {
        Libro libro = new Libro();
        try {
            libro.setTitulo(titulo);
            libro.setAnio(anio);
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(ejemplaresPrestados);
            libro.setEjemplaresRestantes(ejemplaresRestantes);
            libro.setAlta(true);
            libro.setEditorial(editorial);
            libro.setAutor(autor);
            dao.guardar(libro);
            return libro;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    //en este constructor le paso los ID de objetos de Editorial y Autor para que sus servicios traigan los objetos
    public Libro crear(String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, String idEditorial, String idAutor) throws Exception {
        Libro libro = new Libro();
        try {
            libro.setTitulo(titulo);
            libro.setAnio(anio);
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(ejemplaresPrestados);
            libro.setEjemplaresRestantes(ejemplaresRestantes);
            libro.setAlta(true);
            libro.setEditorial(editorialService.buscarPorId(idEditorial));
            libro.setAutor(autorService.buscarPorID(idAutor));
            dao.guardar(libro);
            return libro;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public void eliminar(String id) throws Exception {
        Libro l = buscarPorIsbn(id);
        
        validarLibroNull(l);
        
        dao.eliminar(l);
    }
    
    public void listarLibros() {
        try {
            List<Libro> l = dao.listarTodos();
            validarListaLibroNull(l);
            for (Libro libro : l) {
                System.out.println(libro);
            }
        } catch (Exception e) {
            e.printStackTrace();
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
