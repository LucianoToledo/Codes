package com.libreria.repositorios;

import com.libreria.entidades.Libro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepositorio extends JpaRepository<Libro, String> {
    //en el generico el primer objet es el tipo de obj que hacemos referencia, en el 2do al tipo de dato del string
    
    @Query("SELECT l FROM Libro l WHERE l.id LIKE :id")
    public Libro buscarPorId(@Param("id") String id);
    
    
    @Query("SELECT l FROM Libro l WHERE l.autor.nombre LIKE :nombre")
    public List<Libro> buscarPorAutor(@Param("nombre") String nombre);
    
}
