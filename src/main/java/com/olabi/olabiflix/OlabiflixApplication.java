package com.olabi.olabiflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olabi.olabiflix.model.entity.Filme;
import com.olabi.olabiflix.model.entity.Serie;
import com.olabi.olabiflix.repository.FilmeRepository;
import com.olabi.olabiflix.repository.SerieRepository;

import java.util.List;

@SpringBootApplication
@RestController
public class OlabiflixApplication {

	private final FilmeRepository filmeRepository;
	private final SerieRepository serieRepository;

	public OlabiflixApplication(FilmeRepository filmeRepository, SerieRepository serieRepository) {
		this.filmeRepository = filmeRepository;
		this.serieRepository = serieRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(OlabiflixApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return "Vence o Fluminense!";
	}

	@GetMapping("/filmes")
	public List<Filme> getFilmes(){
		return filmeRepository.findAll();
	}

	@GetMapping("/series")
	public List<Serie> getSeries(){
		return serieRepository.findAll();
	}
}
