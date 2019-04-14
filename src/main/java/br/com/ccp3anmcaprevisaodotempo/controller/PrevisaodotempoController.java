package br.com.ccp3anmcaprevisaodotempo.controller;

import java.util.List;

import br.com.ccp3anmcaprevisaodotempo.model.Cidades;
import br.com.ccp3anmcaprevisaodotempo.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.ccp3anmcaprevisaodotempo.model.Previsaodotempo;
import br.com.ccp3anmcaprevisaodotempo.repository.PrevisaodotempoRepository;

@Controller
public class PrevisaodotempoController {
	
	@Autowired
	private PrevisaodotempoRepository repoPre;
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@GetMapping("/previsao")
	public ModelAndView previsao() {
		ModelAndView mv = new ModelAndView("lista_previsao");
		List<Previsaodotempo> previsao = repoPre.findAll();
		List<Cidades> cidade = cidadeRepository.findAll();
		mv.addObject("previsao",previsao);
		mv.addObject("cidade",cidade);
		
		return mv;
	}
	
}
