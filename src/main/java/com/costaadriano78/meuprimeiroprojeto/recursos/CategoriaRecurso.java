package com.costaadriano78.meuprimeiroprojeto.recursos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.costaadriano78.meuprimeiroprojeto.entidades.Categoria;
import com.costaadriano78.meuprimeiroprojeto.repositorios.CategoriaRepositorio;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaRecurso {
	
	@Autowired
	private CategoriaRepositorio categoriaRepositorio;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> findAll(){
		List<Categoria> list = categoriaRepositorio.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Categoria> findById(@PathVariable Long id){
		Categoria cat = categoriaRepositorio.findById(id);
		return ResponseEntity.ok().body(cat);
	}
	
}
