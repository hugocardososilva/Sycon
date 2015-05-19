package model;

public class ServicoCondominio extends Servico{
	
	private Prestador prestador; 
	
	public ServicoCondominio() {
		super();
	}

	public Prestador getPrestador() {
		return prestador;
	}

	public void setPrestador(Prestador prestador) {
		this.prestador = prestador;
	}
	
	
}
