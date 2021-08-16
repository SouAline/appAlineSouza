package code.com.desafio.appAlineSouza.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import code.com.desafio.appAlineSouza.model.domain.Evento;

@Repository
public interface EventoRepository extends CrudRepository<Evento, Integer>{
	

}
