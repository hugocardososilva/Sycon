package model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
@Entity
public class ServicoResidencia extends Servico {
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private Pessoa frequente;
	
	public ServicoResidencia() {
		super();
	}

	public Pessoa getFrequente() {
		return frequente;
	}

	public void setFrequente(Pessoa frequente) {
		this.frequente = frequente;
	}
	
	
}
