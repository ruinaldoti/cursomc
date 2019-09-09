package com.nelioalves.cursomc1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc1.domain.Categoria;

@Repository
public interface CategoriaReposytory extends JpaRepository<Categoria, Integer> {

}
