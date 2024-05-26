package com.olabi.olabiflix.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.olabi.olabiflix.model.entity.Filme;
import java.util.UUID;


public interface FilmeRepository extends JpaRepository<Filme, UUID> {
    
    
}
