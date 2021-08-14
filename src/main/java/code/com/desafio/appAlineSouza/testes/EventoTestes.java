package code.com.desafio.appAlineSouza.testes;

import code.com.desafio.appAlineSouza.model.domain.Evento;

public class EventoTestes {

	public static void main(String[] args) {
		Evento evento = new Evento();
		evento.setNome("Palestra Auto Ajuda");
		evento.setCidade("Cachoeirinha");
		evento.setValorIngresso(15);
		System.out.print("O evento custa R$: " + evento);

	}

}
