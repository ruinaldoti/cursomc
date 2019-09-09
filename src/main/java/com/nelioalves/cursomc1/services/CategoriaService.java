package com.nelioalves.cursomc1.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc1.domain.Categoria;
import com.nelioalves.cursomc1.repositories.CategoriaReposytory;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaReposytory repo;
	
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
