package model;

public class Condominio {
	
	private long id;
	private int diasSemUtilizarSistema;
	private int numeroMaximoMoradores;
	private Informacao informacao;
	
	
	public Condominio() {
		super();
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Informacao getInformacao() {
		return informacao;
	}


	public void setInformacao(Informacao informacao) {
		this.informacao = informacao;
	}


	public int getDiasSemUtilizarSistema() {
		return diasSemUtilizarSistema;
	}


	public void setDiasSemUtilizarSistema(int diasSemUtilizarSistema) {
		this.diasSemUtilizarSistema = diasSemUtilizarSistema;
	}


	public int getNumeroMaximoMoradores() {
		return numeroMaximoMoradores;
	}


	public void setNumeroMaximoMoradores(int numeroMaximoMoradores) {
		this.numeroMaximoMoradores = numeroMaximoMoradores;
	}
	
	
	

}
