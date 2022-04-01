package com.libreria.repositorios;

import com.libreria.entidades.Prestamo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PrestamoRepositorio extends JpaRepository<Prestamo, String> {

//    @Query("SELECT p FROM Prestamo WHERE p.libro.id LIKE :id")
//    public List<Prestamo> buscarPorIdLibro(@Param("id") String id);
//    
//    @Query("SELECT p FROM Prestamo WHERE p.cliente.id LIKE :id")
//    public List<Prestamo> buscarPorIdCliente(@Param("id") String id);
    
}
