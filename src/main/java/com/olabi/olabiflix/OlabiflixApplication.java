package com.olabi.olabiflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olabi.olabiflix.model.entity.Filme;
import com.olabi.olabiflix.repository.FilmeRepository;

import java.util.List;

@SpringBootApplication
@RestController
public class OlabiflixApplication {

	private final FilmeRepository repository;

	public OlabiflixApplication(FilmeRepository repository) {
		this.repository = repository;
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
		System.out.println("Rodando a classe DatabaseInitializer");
		System.out.println(repository);
		for (Filme filme : repository.findAll()) {
			System.out.println(filme);
		}
		return repository.findAll();
	}
}
