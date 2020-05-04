package com.arturtarcisio.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.arturtarcisio.springboot.entidades.Instituicao;
import com.arturtarcisio.springboot.repositorios.RepositorioInstituicao;

@Controller
@RequestMapping("/instituicoes")
public class InstituicoesController {

	@Autowired
	private RepositorioInstituicao repositorioInstituicao;

	@GetMapping("/index")
	public ModelAndView index() {
		ModelAndView resultado = new ModelAndView("instituicao/index");
		List<Instituicao> instituicoesList = repositorioInstituicao.findAll();
		resultado.addObject("instituicoes", instituicoesList);
		return resultado;
	}

	@GetMapping("/inserir")
	public ModelAndView inserir() {
		ModelAndView resultado = new ModelAndView("instituicao/inserir");
		resultado.addObject("instituicao", new Instituicao());
		return resultado;
	}
	
	@PostMapping("/inserir")
	public String inserir(Instituicao instituicao) {
		repositorioInstituicao.save(instituicao);
		return "redirect:/instituicoes/index";
	}

}
