package libreria.persistencia;

import java.util.List;
import libreria.Entidades.Libro;

public class LibroDAO extends DAO {

    public void guardar(Libro objeto) {
        conectar();
        em.getTransaction().begin();
        em.persist(objeto);
        em.getTransaction().commit();
        desconectar();
    }

    public Libro editar(Libro objeto) {
        conectar();
        em.getTransaction().begin();
        Libro u = em.merge(objeto);
        em.getTransaction().commit();
        desconectar();
        return u;
    }

    public void eliminar(Libro objeto) {
        conectar();
        em.getTransaction().begin();
        if (!em.contains(objeto)) {
            objeto = em.merge(objeto);
        }
        em.remove(objeto);
        em.getTransaction().commit();
        desconectar();
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

//SELECT a FROM Libro a WHERE a.autor.nombre LIKE : "Homero"
