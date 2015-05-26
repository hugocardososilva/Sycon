package mb;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

import org.primefaces.context.RequestContext;
import org.primefaces.event.CaptureEvent;

import dao.DAO;
import dao.DAOPrestadorPessoa;
import dao.DAOTelefone;
import dao.DAOTipoServico;
import model.Pessoa;
import model.Telefone;
import model.TipoServico;

@ManagedBean
@ViewScoped
public class PrestadorPessoaMB {
	private DAOPrestadorPessoa daop= new DAOPrestadorPessoa();
	private DAO dao = new DAO();
	private DAOTelefone daot= new DAOTelefone();
	private DAOTipoServico daotipo= new DAOTipoServico();
	private Pessoa prestador;
	private boolean editar;
	private boolean novo;
	private boolean novoTipoServico;
	private Telefone telefone;
	private List<TipoServico> tipos;
	private TipoServico tipoServico;	
	private List<Pessoa> prestadores;
	
	
	public PrestadorPessoaMB() {
		this.editar= false;
		this.novo= false;
		this.telefone= new Telefone();
		this.tipos= new ArrayList<TipoServico>();
		this.tipoServico= new TipoServico();
		this.prestador= new Pessoa();
		this.novoTipoServico= false;
		this.prestadores= new ArrayList<Pessoa>();
		getPessoas();
	}
	
	
	public Pessoa getPrestador() {
		return prestador;
	}


	public List<TipoServico> getTipos() {
		dao.open();
		dao.begin();
		tipos= daotipo.findAll();
		dao.close();
		return tipos;
	}


	public List<Pessoa> getPessoas() {
		dao.open();
		dao.begin();
		prestadores = daop.findAll();
		return prestadores;
	}


	public void setPessoas(List<Pessoa> pessoas) {
		
		this.prestadores = pessoas;
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


	public boolean isNovoTipoServico() {
		return novoTipoServico;
	}


	public void setNovoTipoServico(boolean novoTipoServico) {
		this.novoTipoServico = novoTipoServico;
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
		return "prestadores?faces-redirect=true";
	}
	public String novoPrestador(){
		resetPrestador();
		this.editar= false;
		this.novo= true;
		return "info-prestador";
		
		
	}
	
	public void newTipoServico(){
		System.out.println("novo tipos");
		RequestContext.getCurrentInstance().openDialog("dialogs/tipos-servico-pessoa");
		
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
	public void visualizarNovoTipo(){
		System.out.println("novo tipo de servico");
		if(novoTipoServico== false){
		this.novoTipoServico= true;
		}else{
		this.novoTipoServico= false;
		}
	}
	
	public void adicionarTipoServico(){
		System.out.println("adicionar tipo de servico");
		dao.open();
		dao.begin();
		daotipo.persist(tipoServico);
		dao.commit();
		resetTipoServico();
		this.novoTipoServico= false;
		getTipoServico();
		
		
	}
	public void selecionarTipoServico(){
		System.out.println("selecionando tipo de servico para prestador");
		this.prestador.addTipo(tipoServico);
		resetTipoServico();
	}
	public void removerTipoServico() {
		System.out.println("removendo tipo de servico do prestador");
		this.prestador.removeTipo(tipoServico);
		resetTipoServico();
	}
	
	public void captura(CaptureEvent cEvent){
		ImageMB imb= new ImageMB();
		System.out.println("capturando imagem");
		ServletContext ctx= (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
		
		String filename = imb.oncapture(ctx, cEvent);
		System.out.println(filename);
		this.prestador.setFoto(filename);
		
		
	}
	
	
}
