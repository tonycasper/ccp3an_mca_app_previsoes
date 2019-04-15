package br.ustj.exercicios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.ustj.exercicios.model.Previsao;
import br.ustj.exercicios.repository.PrevisaoRepository;

@Controller
public class PrevisaoTempoController {
	
	@Autowired
	private PrevisaoRepository previsaoRepo;
	
	@GetMapping("/previsao")
	public ModelAndView listarPrevisao() {
		ModelAndView mv = new ModelAndView("lista_previsoes");
		
		List<Previsao> previsoes = previsaoRepo.findAll();
		
		mv.addObject("previsoes", previsoes);
		
		mv.addObject(new Previsao());
				
		return mv;
	}
	
	@PostMapping
	private String salvar(Previsao previsao) {
		previsaoRepo.save(previsao);
		return "redirect:previsao";

	}
}
