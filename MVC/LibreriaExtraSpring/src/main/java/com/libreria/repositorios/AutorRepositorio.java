
package com.libreria.repositorios;

import com.libreria.entidades.Autor;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepositorio extends JpaRepository<Autor, String>{
   
    @Query("Select a FROM Autor a WHERE a.id LIKE :id")
    public Autor buscarPorId(@Param("id") String id);
    
    @Query("Select a FROM Autor a WHERE a.nombre LIKE :nombre")
    public Autor buscarPorNombre(@Param("nombre") String nombre);

}
