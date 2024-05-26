package com.olabi.olabiflix.config;

import org.springframework.boot.CommandLineRunner; // Import the CommandLineRunner class
import org.springframework.context.annotation.Configuration; // Import the Configuration class

import com.olabi.olabiflix.model.entity.Filme;
import com.olabi.olabiflix.repository.FilmeRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Configuration
public class DatabaseInitializer implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(DatabaseInitializer.class);

    private final FilmeRepository filmeRepository;

    public DatabaseInitializer(FilmeRepository filmeRepository) {
        this.filmeRepository = filmeRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        log.info("Rodando a classe DatabaseInitializer");
        filmeRepository.saveAll(filmes);
        filmeRepository.findAll().forEach(filme -> log.info("Filme salvo no banco de dados: " + filme));

    }
    public static final List<Filme> filmes = List.of(
        new Filme("10 Things I Hate About You","1999","PG-13","31 Mar 1999","Comedy","Gil Junger","Karen McCullah", "Heath Ledger","A high-school boy, Cameron, cannot date Bianca until her anti-social older sister, Kat, has a boyfriend. So, Cameron pays a mysterious boy, Patrick, to charm Kat.","English","USA","None"),
        new Filme("Speed Racer", "2008", "PG", "09 May 2008", "Action, Family, Sci-Fi", "Lana Wachowski, Lilly Wachowski", "Lana Wachowski, Lilly Wachowski", "Emile Hirsch, Nicholas Elia, Susan Sarandon, Melissa Holroyd", "A young driver, Speed Racer, aspires to be champion of the racing world with the help of his family and his high-tech Mach 5 automobile.","English","USA","None")
    );
    
}
