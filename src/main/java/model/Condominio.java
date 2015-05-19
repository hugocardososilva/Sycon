package model;

import java.util.ArrayList;
import java.util.List;

public class Condominio {
	
	private long id;
	private int diasSemUtilizarSistema;
	private int numeroMaximoMoradores;
	private Informacao informacao;
	private List<Telefone> telefones;
	
	
	public Condominio() {
		super();
		this.telefones= new ArrayList<Telefone>();
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}

	
	public List<Telefone> getTelefones() {
		return telefones;
	}


	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
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
	
	public void addTelefone(Telefone telefone){
		this.telefones.add(telefone);
	}
	public void removeTelefone(Telefone telefone){
		this.telefones.remove(telefone);
	}
	
	

}
