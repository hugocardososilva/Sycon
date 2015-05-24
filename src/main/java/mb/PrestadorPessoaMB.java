package mb;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import model.Pessoa;
import model.Prestador;
import model.TipoServico;

@ManagedBean
@ApplicationScoped
public class PrestadorPessoaMB {
	
	private Pessoa prestador;
	private boolean editar;
	
	public PrestadorPessoaMB() {
		
	}
	
	
	public Pessoa getPrestador() {
		return prestador;
	}


	public void setPrestador(Pessoa prestador) {
		this.prestador = prestador;
	}
	

	public boolean isEditar() {
		return editar;
	}


	public void setEditar(boolean editar) {
		this.editar = editar;
	}


	public void resetPrestador(){
		this.prestador= new Pessoa();
	}
	
	public String redirectPrestadores(){
		return "prestadores";
	}
	public String novoPrestador(){
		resetPrestador();
		return "novo-prestador";
		
		
	}

}
