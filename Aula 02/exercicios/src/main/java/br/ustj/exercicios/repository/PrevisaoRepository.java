package br.ustj.exercicios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ustj.exercicios.model.Previsao;

public interface PrevisaoRepository extends JpaRepository<Previsao, Long>{

}