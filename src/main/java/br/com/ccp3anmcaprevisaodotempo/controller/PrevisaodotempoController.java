package br.com.ccp3anmcaprevisaodotempo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import br.com.ccp3anmcaprevisaodotempo.Service.PrevisaoService;
import br.com.ccp3anmcaprevisaodotempo.model.Cidades;
import br.com.ccp3anmcaprevisaodotempo.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.ccp3anmcaprevisaodotempo.model.Previsaodotempo;
import br.com.ccp3anmcaprevisaodotempo.repository.PrevisaodotempoRepository;

@Controller
public class PrevisaodotempoController {
	
	@Autowired
	private PrevisaodotempoRepository repoPre;

	@Autowired
	PrevisaoService service;

	@Autowired
	private CidadeRepository cidadeRepository;

    Future<Previsaodotempo> previsaodotempo ;

	@GetMapping("/previsao")
	public ModelAndView previsao() {
		ModelAndView mv = new ModelAndView("lista_previsao");
		List<Previsaodotempo> previsao = repoPre.findAll();
		List<Cidades> cidade = cidadeRepository.findAll();
		mv.addObject("previsao",previsao);
		mv.addObject("cidade",cidade);
		return mv;
	}



	@PostMapping("/buscar")
	public ModelAndView BuscarNomeFuture(String nome)throws InterruptedException, ExecutionException {
		ModelAndView mv =  new ModelAndView("lista_previsao");
		Future<List<Previsaodotempo>> previsao = service.BuscarNomeFutu(nome);
		mv.addObject("previsao",previsao.get());
		return mv;
	}

	@PostMapping("/buscarLocal")
	public ModelAndView buscarLocalFutute(int latitude, int longitude) throws InterruptedException, ExecutionException {
		ModelAndView mv =  new ModelAndView("lista_previsao");
		Future <Previsaodotempo> previsao = service.BuscarLocalFutu(latitude, longitude);
		mv.addObject("previsao",previsao.get());
		return mv;
	}
	@PostMapping("/BuscarPorQuery")
	public ModelAndView buscarNomeCidadeQuery(String nome) {
		ModelAndView mv = new ModelAndView("lista_previsao");
		List <Previsaodotempo> previsaodotempo = service.buscarNomeCidadeQuery(nome);
		mv.addObject("previsao",previsaodotempo);
		return  mv;
	}

	@PostMapping("/buscarPorLocaQuery")
	public ModelAndView buscarPorLocaQuery(int latitude,int longitude){
		ModelAndView mv = new ModelAndView("lista_previsao");
		List<Previsaodotempo> previsaodotempos = service.buscarPorLocaQuery(longitude,latitude);
		mv.addObject("previsao",previsaodotempos);
		return mv;
	}

	@PostMapping("/Buscar3")
	public ModelAndView Buscar3(String nome){
		ModelAndView mv = new ModelAndView("lista_previsao");
		Previsaodotempo previsaodotempo = service.BuscarNome(nome);
		mv.addObject("previsao",previsaodotempo);
		return mv;
	}

	@PostMapping("/BuscarLocal3")
	public ModelAndView BuscarLocal3(int longitude,int latitude){
		ModelAndView mv = new ModelAndView("lista_previsao");
		Previsaodotempo previsaodotempo = service.BuscarLocal3(latitude,longitude);
		mv.addObject("previsao",previsaodotempo);
		return mv;
	}
	
}
