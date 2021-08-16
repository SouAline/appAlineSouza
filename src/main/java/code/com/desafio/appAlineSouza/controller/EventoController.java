package code.com.desafio.appAlineSouza.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import code.com.desafio.appAlineSouza.model.domain.Evento;
import code.com.desafio.appAlineSouza.model.service.EventoService;

@Controller
public class EventoController {
	
	@Autowired
	private EventoService eventoService;
		
	@GetMapping(value = "/")//rotas que são chamadas
	public String inicializa() {
		return "index";//telas que são mostradas
		
	}
	
	@GetMapping(value = "/evento")
	public String telaCadastro(){
		return "evento/agendaCadastro";
	}
	
	@GetMapping(value = "/evento/{id}/excluir") // substituir pelo DeleteMapping
	public String excluir(Model model, @PathVariable Integer id){
		Evento eventoExcluido = eventoService.obterPorId(id);
		
		eventoService.excluir(id);
		model.addAttribute("mensagem", "Evento" + eventoExcluido.getNome() + " excluido com sucesso");
		return obterLista(model);
	}
	
	@PostMapping(value = "evento/incluir")
	public String incluir(Model model, Evento evento){
		eventoService.incluir(evento);
		model.addAttribute("mensagem", "Evento criado com sucesso");
		return obterLista(model);
	}
	
	
	@GetMapping(value= "/evento/consultar")
	public String consultar() {
		return"";
	}
	
	@GetMapping(value = "eventos/agendaLista")
	public String obterLista(Model model) {
	
		model.addAttribute("eventos", eventoService.obterLista());
		
		return "eventos/agendaLista";
	}
	

}
