package com.olabi.olabiflix.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olabi.olabiflix.model.entity.Serie;
import com.olabi.olabiflix.repository.SerieRepository;

import java.util.List;

@RestController
@RequestMapping("/series")
public class SerieController {
        
        private final SerieRepository serieRepository;
    
        public SerieController(SerieRepository serieRepository) {
            this.serieRepository = serieRepository;
        }
    
        @GetMapping
        public List<Serie> getSeries(){
            return serieRepository.findAll();
        }
    
}
