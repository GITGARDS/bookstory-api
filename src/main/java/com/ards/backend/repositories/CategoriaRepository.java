package com.ards.backend.repositories;

import com.ards.backend.domain.Categoria;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
    
    
}
