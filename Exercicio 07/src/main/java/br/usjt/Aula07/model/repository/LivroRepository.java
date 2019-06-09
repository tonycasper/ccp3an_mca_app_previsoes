package br.usjt.Aula07.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.Aula07.model.beans.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{
	
}
