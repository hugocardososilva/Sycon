package model;

import java.util.ArrayList;
import java.util.List;

public class TipoServico {
	
	private long id;
	private String tipo;
	private String descricao;
	private List<Prestador> prestadores;
	
	
	public TipoServico() {
		super();
		this.prestadores= new ArrayList<Prestador>();
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public List<Prestador> getPrestadores() {
		return prestadores;
	}


	public void setPrestadores(List<Prestador> prestadores) {
		this.prestadores = prestadores;
	}
	
	public void addPrestador(Prestador prestador){
		this.prestadores.add(prestador);
	}
	public void removePrestador(Prestador prestador){
		this.prestadores.remove(prestador);
	}
	

}
