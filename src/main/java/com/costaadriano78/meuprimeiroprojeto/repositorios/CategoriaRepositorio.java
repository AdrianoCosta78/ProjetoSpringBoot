package com.costaadriano78.meuprimeiroprojeto.repositorios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.costaadriano78.meuprimeiroprojeto.entidades.Categoria;

@Component
public class CategoriaRepositorio {

	private Map<Long, Categoria> map = new HashMap<>();
	
	public void save(Categoria obj) {
		map.put(obj.getId(), obj);
		
	}
	
	public Categoria findById(long id) {
		return map.get(id);
	}
	
	public List<Categoria>findAll(){
		return new ArrayList<Categoria>(map.values());
	}
}
