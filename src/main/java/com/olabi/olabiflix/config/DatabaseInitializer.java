package com.olabi.olabiflix.config;

import org.springframework.boot.CommandLineRunner; // Import the CommandLineRunner class
import org.springframework.context.annotation.Configuration; // Import the Configuration class

import com.olabi.olabiflix.model.entity.Filme;
import com.olabi.olabiflix.repository.FilmeRepository;
import com.olabi.olabiflix.model.entity.Serie;
import com.olabi.olabiflix.repository.SerieRepository;
import com.olabi.olabiflix.model.utils.Ratings;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

@Configuration
public class DatabaseInitializer implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(DatabaseInitializer.class);

    private final FilmeRepository filmeRepository;
    private final SerieRepository serieRepository;

    public DatabaseInitializer(FilmeRepository filmeRepository, SerieRepository serieRepository) {
        this.filmeRepository = filmeRepository;
        this.serieRepository = serieRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        log.info("Rodando a classe DatabaseInitializer");
        filmeRepository.saveAll(filmes);
        filmeRepository.findAll().forEach(filme -> log.info("Filme salvo no banco de dados: " + filme));
        serieRepository.saveAll(series);
        serieRepository.findAll().forEach(serie -> log.info("Serie salva no banco de dados: " + serie));

    }
    public static final List<Filme> filmes = List.of(
        new Filme("10 Things I Hate About You","1999","PG-13","31 Mar 1999","97 min","Comedy","Gil Junger","Karen McCullah", "Heath Ledger","A high-school boy, Cameron, cannot date Bianca until her anti-social older sister, Kat, has a boyfriend. So, Cameron pays a mysterious boy, Patrick, to charm Kat.","English","USA","None"),
        new Filme("Speed Racer", "2008", "PG", "09 May 2008","135 min","Action, Family, Sci-Fi", "Lana Wachowski, Lilly Wachowski", "Lana Wachowski, Lilly Wachowski", "Emile Hirsch, Nicholas Elia, Susan Sarandon, Melissa Holroyd", "A young driver, Speed Racer, aspires to be champion of the racing world with the help of his family and his high-tech Mach 5 automobile.","English","USA","None")
    );

    public static List<Serie> series = List.of(
        new Serie("The Office", "9", "Comedy", "Greg Daniels", "https://m.media-amazon.com/images/M/MV5BMDNkOTE4NDQtMTNmYi00MWE0LWE4ZTktYTc0NzhhNWIzNzJiXkEyXkFqcGdeQXVyMzQ2MDI5NjU@._V1_SX300.jpg", new ArrayList<String>(Arrays.asList("Rainn Wilson", "John Krasinskyi", "Jenna Fischer")), new Ratings("8.9", "380944"))    
    );
    
}
