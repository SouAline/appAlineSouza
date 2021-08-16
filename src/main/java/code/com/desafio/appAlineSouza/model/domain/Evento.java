package code.com.desafio.appAlineSouza.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Evento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String local;
	private String cidade;
	private int valorIngresso;
	private boolean temAtracoes;
	private String data;
	
	public Evento() {
		this.valorIngresso = 25;
		this.local = "Arena do Grêmio";
		this.temAtracoes = true;	
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Evento(String nome, int valorIngresso) {
		this();
		this.nome = nome;
		this.valorIngresso = valorIngresso;
	}
	
	@Override
	public String toString() {
		return nome + " no valor de R$: " + valorIngresso + "!!";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getValorIngresso() {
		return valorIngresso;
	}

	public void setValorIngresso(int valorIngresso) {
		this.valorIngresso = valorIngresso;
	}

	public boolean isTemAtracoes() {
		return temAtracoes;
	}
	public void setTemAtracoes(boolean temAtracoes) {
		this.temAtracoes = temAtracoes;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}


}
