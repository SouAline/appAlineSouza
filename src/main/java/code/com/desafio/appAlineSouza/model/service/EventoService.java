package code.com.desafio.appAlineSouza.model.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import code.com.desafio.appAlineSouza.model.domain.Evento;
import code.com.desafio.appAlineSouza.model.repository.EventoRepository;

@Service
public class EventoService {
	
	@Autowired
	private EventoRepository eventoRepository;

	public List<Evento> obterLista(){
		return (List<Evento>) eventoRepository.findAll();
	}
	
	
	public void incluir(Evento evento){
		eventoRepository.save(evento);
	}
	
	public void excluir(Integer id){
		eventoRepository.deleteById(id);		
	}
	
	public Evento obterPorId(Integer id) {
		return eventoRepository.findById(id).orElse(null);
	}
}
