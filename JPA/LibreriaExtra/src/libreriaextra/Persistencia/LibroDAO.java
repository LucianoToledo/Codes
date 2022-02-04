package libreriaextra.Persistencia;

import java.util.List;
import libreriaextra.Entities.Libro;

public class LibroDAO extends DAO<Libro>{
    
    @Override
    public void guardar(Libro libro){
        super.guardar(libro);
    }
    
    @Override
    public void eliminar(Libro libro){
        super.eliminar(libro);
    }
    
    @Override
    public void editar(Libro libro){
        super.editar(libro);
    }
    
    public List<Libro> listarTodos() throws Exception {
        conectar();
        List<Libro> li = em.createQuery("SELECT d FROM Libro d")
                .getResultList();
        desconectar();
        return li;
    }

    public Libro buscarPorIsbn(String isbn) {
        conectar();
        Libro libro = em.find(Libro.class, isbn);
        desconectar();
        return libro;
    }

    public Libro buscarPotTitulo(String titulo) {
        conectar();
        Libro l = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :titulo")
                .setParameter("titulo", titulo)
                .getSingleResult();
        desconectar();
        return l;
    }

    public List<Libro> buscarLibroPorAutor(String nombre) {
        conectar();
        List<Libro> li = em.createQuery("SELECT li FROM Libro li WHERE li.autor.nombre LIKE :nombre")
                .setParameter("nombre", nombre)
                .getResultList();
        desconectar();
        return li;
    }

    public List<Libro> buscarLibroPorEditorial(String nombre) {
        conectar();
        List<Libro> li = em.createQuery("SELECT li FROM Libro li WHERE li.editorial.nombre LIKE :nombre")
                .setParameter("nombre", nombre)
                .getResultList();
        desconectar();
        return li;
    }
    
}
