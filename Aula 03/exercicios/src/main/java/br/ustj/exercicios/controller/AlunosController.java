package br.ustj.exercicios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.exercicios.service.AlunosService;
import br.ustj.exercicios.model.Aluno;

@Controller
public class AlunosController {

	// não faça mais essa injeção
	// @Autowired
	// private AlunosRepository alunosRepo;
	// injete um serviço
	@Autowired
	private AlunosService alunosService;

	@GetMapping("/alunos")
	public ModelAndView listarAlunos() {
		// passe o nome da página ao construtor
		ModelAndView mv = new ModelAndView("lista_alunos");
		// para modelar o formulário
		mv.addObject(new Aluno());
		// Busque a coleção com o service
		List<Aluno> alunos = alunosService.listarTodos();
		// adicione a coleção ao objeto ModelAndView
		mv.addObject("alunos", alunos);
		// devolva o ModelAndView
		return mv;
	}

	@PostMapping("/alunos")
	public String salvar(Aluno aluno) {
		// salvando com o service
		alunosService.salvar(aluno);
		return "redirect:/alunos";
	}
}
