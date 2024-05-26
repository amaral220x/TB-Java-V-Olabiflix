package com.olabi.olabiflix.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.olabi.olabiflix.model.entity.Serie;
import java.util.UUID;


public interface SerieRepository extends JpaRepository<Serie, UUID>{
    
}
