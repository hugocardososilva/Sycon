package model;

import java.util.ArrayList;
import java.util.List;

public class Lote {
	private long id;
	private long numero;
	private String local;
	
	private Inquilino responsavel;
	private List<Inquilino> moradores;
	
	private List<Frequente> frequentes;
	
	private List<Servico> servicos;
	
	
	public Lote() {
		this.moradores= new ArrayList<Inquilino>();
		this.frequentes= new ArrayList<Frequente>();
		this.servicos= new ArrayList<Servico>();
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


	public List<Frequente> getFrequentes() {
		return frequentes;
	}


	public void setFrequentes(List<Frequente> frequentes) {
		this.frequentes = frequentes;
	}
	
	public void addFrequente(Frequente f){
		this.frequentes.add(f);
		
	}
	public void removeFrequente(Frequente f){
		this.frequentes.remove(f);
	}

	public List<Servico> getServicos() {
		return servicos;
	}


	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}	
	public void addServico(Servico s){
		this.servicos.add(s);
	}
	public void removeServico(Servico s){
		this.servicos.remove(s);
	}


}
