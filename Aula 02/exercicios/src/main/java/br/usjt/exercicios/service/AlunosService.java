package br.usjt.exercicios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ustj.exercicios.model.Aluno;
import br.ustj.exercicios.model.Calculadora;
import br.ustj.exercicios.repository.AlunosRepository;

@Service
public class AlunosService {
	@Autowired
	private AlunosRepository alunosRepo;
	@Autowired
	private Calculadora calculadora;

	public void salvar(Aluno aluno) {
		alunosRepo.save(aluno);
	}

	public List<Aluno> listarTodos() {
		List<Aluno> alunos = alunosRepo.findAll();
		for (Aluno aluno : alunos)
			aluno.setMediaNotas((calculadora.calculaMedia(aluno.getNota1(), aluno.getNota2())));
		return alunos;
	}
}
