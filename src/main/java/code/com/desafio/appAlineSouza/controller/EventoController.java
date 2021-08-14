package code.com.desafio.appAlineSouza.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventoController {
		
	@GetMapping(value = "/")//rotas que são chamadas
	public String inicializa() {
		return "index";//telas que são mostradas
		
	}
	
	@GetMapping(value = "/eventos/agendaLista")
	public String obterLista(Model model) {
		List<String> colecaoEventos = new ArrayList<String>();
		colecaoEventos.add("Show Annita");
		colecaoEventos.add("Show A");
	
		model.addAttribute("eventos", colecaoEventos);
		
		return "eventos/agendaLista";
	}
	

}
