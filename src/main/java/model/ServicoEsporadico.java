package model;

public class ServicoEsporadico extends Servico{
	
	private Prestador prestador; 
	
	public ServicoEsporadico() {
		super();
	}

	public Prestador getPrestador() {
		return prestador;
	}

	public void setPrestador(Prestador prestador) {
		this.prestador = prestador;
	}

	
	
}
