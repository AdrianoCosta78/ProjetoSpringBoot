package com.costaadriano78.meuprimeiroprojeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.costaadriano78.meuprimeiroprojeto.entidades.Categoria;
import com.costaadriano78.meuprimeiroprojeto.repositorios.CategoriaRepositorio;

@SpringBootApplication
public class MeuprimeiroprojetoApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepositorio categoriaRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(MeuprimeiroprojetoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(1L, "Eletronicos");
		Categoria cat2 = new Categoria(2L, "Livros");
		
		categoriaRepositorio.save(cat1);
		categoriaRepositorio.save(cat2);
	}

}
