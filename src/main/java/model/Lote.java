package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

import converter.GenericInterface;
@Entity
public class Lote implements GenericInterface{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private Long numero;
	private String quadra;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private Inquilino responsavel;
	
	@OneToMany(mappedBy="residencia",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Inquilino> moradores;
	
	@OneToMany(mappedBy="lote", cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Pessoa> frequentes;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@OrderBy("horaEntrada DESC")
	private List<Servico> servicos;
	
	
	public Lote() {
		this.moradores= new ArrayList<Inquilino>();
		this.frequentes= new ArrayList<Pessoa>();
		this.servicos= new ArrayList<Servico>();
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Long getNumero() {
		return numero;
	}


	public void setNumero(Long numero) {
		this.numero = numero;
	}


	

	public String getQuadra() {
		return quadra;
	}


	public void setQuadra(String quadra) {
		this.quadra = quadra;
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


	public List<Pessoa> getFrequentes() {
		return frequentes;
	}


	public void setFrequentes(List<Pessoa> frequentes) {
		this.frequentes = frequentes;
	}
	
	public void addFrequente(Pessoa f){
		this.frequentes.add(f);
		
	}
	public void removeFrequente(Pessoa f){
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


	@Override
	public String toString() {
		return "Lote [id=" + id + ", numero=" + numero + ", quadra=" + quadra
				+ "]";
	}
	

}
