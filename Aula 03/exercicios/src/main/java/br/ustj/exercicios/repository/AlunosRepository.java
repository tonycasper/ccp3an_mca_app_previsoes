package br.ustj.exercicios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ustj.exercicios.model.Aluno;

public interface AlunosRepository extends JpaRepository<Aluno, Long>{

}