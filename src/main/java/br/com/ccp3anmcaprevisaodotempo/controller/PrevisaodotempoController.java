package br.com.ccp3anmcaprevisaodotempo.controller;

import java.util.List;

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
	
	@GetMapping("/previsao")
	public ModelAndView previsao() {
		ModelAndView mv = new ModelAndView("lista_previsao");
		List<Previsaodotempo> previsao = repoPre.findAll();
		mv.addObject("previsao",previsao);
		
		return mv;
	}
	
}
