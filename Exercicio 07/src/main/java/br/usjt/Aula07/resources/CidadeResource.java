package br.usjt.Aula07.resources;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.usjt.Aula07.model.beans.Cidade;
import br.usjt.Aula07.model.repository.CidadeRepository;

@RestController
@RequestMapping("/cidades")
public class CidadeResource {
	@Autowired
	private CidadeRepository cidadeRepo;
	
	@GetMapping("/lista")
	public List<Cidade>todasOsCidades(){
		return cidadeRepo.findAll();
	}
	
	@GetMapping ("/findByDescricao")
	public Cidade buscarPorNome(@RequestParam String nome) {
		return cidadeRepo.findByNome(nome);
	}
	
	@GetMapping ("/findByLatLon")
	public Cidade buscarPorLatLon(@RequestParam String latitude, @RequestParam String longitude) {
		return cidadeRepo.findOneByLatitudeLongitude(longitude,latitude);
	}
	
	@PostMapping("/salvar")
	public ResponseEntity<Cidade> salvar(@RequestBody Cidade cidade, HttpServletResponse response) {
		Cidade c = cidadeRepo.save(cidade);
		URI uri = ServletUriComponentsBuilder.fromCurrentServletMapping().path("/{id}").buildAndExpand(c.getId())
				.toUri();
		return ResponseEntity.created(uri).body(c);
	}
	
}
