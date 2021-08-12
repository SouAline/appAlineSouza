package code.com.desafio.appAlineSouza.model.domain;

public class Evento {
	
	private String nome;
	private String local;
	private String cidade;
	private int valorIngresso;
	private boolean temAtracoes;
	private String data;
	
	
	@Override
	public String toString() {
		return "O evento" + nome + "será na cidade" + cidade + "!!";
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
