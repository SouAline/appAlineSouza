package code.com.desafio.appAlineSouza.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventoController {
	
	
	
	@GetMapping(value = "/")
	public String inicializa() {
		return "index";
		
	}
	
	@GetMapping(value = "/eventos/agendaLista")
	public String obterLista() {
		return"eventos/agendaLista";
	}
	

}
