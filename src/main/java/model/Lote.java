package model;

import java.util.ArrayList;
import java.util.List;

public class Lote {
	private long id;
	private long numero;
	private String local;
	
	private Inquilino responsavel;
	private List<Inquilino> moradores;
	
	
	public Lote() {
		this.moradores= new ArrayList<Inquilino>();
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public long getNumero() {
		return numero;
	}


	public void setNumero(long numero) {
		this.numero = numero;
	}


	public String getLocal() {
		return local;
	}


	public void setLocal(String local) {
		this.local = local;
	}


	public Inquilino getResponsavel() {
		return responsavel;
	}


	public void setResponsavel(Inquilino responsavel) {
		this.responsavel = responsavel;
	}


	public List<Inquilino> getMoradores() {
		return moradores;
	}


	public void setMoradores(List<Inquilino> moradores) {
		this.moradores = moradores;
	}
	
	
	

}
