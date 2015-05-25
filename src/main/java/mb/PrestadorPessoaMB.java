package mb;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import dao.DAO;
import dao.DAOPrestadorPessoa;
import dao.DAOTelefone;
import model.Pessoa;

import model.Telefone;
import model.TipoServico;

@ManagedBean
@ApplicationScoped
public class PrestadorPessoaMB {
	private DAOPrestadorPessoa daop= new DAOPrestadorPessoa();
	private DAO dao = new DAO();
	private DAOTelefone daot= new DAOTelefone();
	private Pessoa prestador;
	private boolean editar;
	private boolean novo;
	private Telefone telefone;
	private List<TipoServico> tipos;
	private TipoServico tipoServico;
	
	public PrestadorPessoaMB() {
		this.editar= false;
		this.novo= false;
		this.telefone= new Telefone();
		this.tipos= new ArrayList<TipoServico>();
		this.tipoServico= new TipoServico();
		this.prestador= new Pessoa();
	}
	
	
	public Pessoa getPrestador() {
		return prestador;
	}


	public List<TipoServico> getTipos() {
		return tipos;
	}


	public void setTipos(List<TipoServico> tipos) {
		this.tipos = tipos;
	}


	public boolean isNovo() {
		return novo;
	}
	

	public Telefone getTelefone() {
		return telefone;
	}


	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}


	public void setNovo(boolean novo) {
		this.novo = novo;
	}


	public void setPrestador(Pessoa prestador) {
		this.prestador = prestador;
	}
	

	public boolean isEditar() {
		return editar;
	}


	public TipoServico getTipoServico() {
		return tipoServico;
	}


	public void setTipoServico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}


	public void setEditar(boolean editar) {
		this.editar = editar;
	}


	public void resetPrestador(){
		this.prestador= new Pessoa();
	}
	public void resetTelefone(){
		this.telefone= new Telefone();
	}
	public void resetTipoServico(){
		this.tipoServico= new TipoServico();
	}
	
	public String redirectPrestadores(){
		return "prestadores";
	}
	public String novoPrestador(){
		resetPrestador();
		this.editar= false;
		this.novo= true;
		return "info-prestador";
		
		
	}
	public String newTipo(){
		System.out.println("novo tipo");
		resetTipoServico();
		return "tipos-servico-pessoa";
	}
	public String novoTipoServico(){
		System.out.println("novo tipo");
		resetTipoServico();
		System.out.println(prestador.getInformacao().getCep());
		return "tipos-servico-pessoa";
		
	}

	public void salvarTelefone(){
		
		dao.open();
		dao.begin();
		daot.persist(telefone);
//		daop.persist(prestador);
		prestador.addTelefone(telefone);
//		daop.merge(prestador);
		dao.commit();
		resetTelefone();
		
		
		
	}
	
}
