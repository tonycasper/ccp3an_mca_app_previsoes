package br.usjt.Aula07.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.usjt.Aula07.model.beans.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade,Long>{
	@Query("Select c from Cidade c where c.place like %:nome%")
	public Cidade findByNome(String nome);

	public Cidade findOneByLatitudeLongitude(String longitude, String latitude);
}
