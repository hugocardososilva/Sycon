package model;

import java.util.ArrayList;
import java.util.List;

public class Inquilino extends Usuario {
	private boolean responsavel;
	private Lote residencia;
	private List<Lote> responsabilidade;
	

	public Inquilino() {
		super();
		this.responsabilidade= new ArrayList<Lote>();
	}

	public boolean isResponsavel() {
		return responsavel;
	}

	public void setResponsavel(boolean responsavel) {
		this.responsavel = responsavel;
	}

	public Lote getResidencia() {
		return residencia;
	}

	public void setResidencia(Lote residencia) {
		this.residencia = residencia;
	}

	public List<Lote> getResponsabilidade() {
		return responsabilidade;
	}

	public void setResponsabilidade(List<Lote> responsabilidade) {
		this.responsabilidade = responsabilidade;
	}
	
	public void addResponsabilidade(Lote lote){
		this.responsabilidade.add(lote);
	}
	public void removeResposabilidade(Lote lote){
		this.responsabilidade.remove(lote);
	}

}
