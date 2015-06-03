package mb;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.DAO;
import dao.DAOPrestadorPessoa;
import model.Pessoa;
import model.ServicoResidencia;

@ManagedBean
@ViewScoped
public class ServicoMB extends AbstractMB {
		private List<Pessoa> prestadores;
		private DAOPrestadorPessoa daop= new DAOPrestadorPessoa();
		private DAO dao = new DAO();
		private String senha;
		private Pessoa prestador;
		private ServicoResidencia servico;
		
		
		private boolean concluido;
		private boolean iniciarServico;
		
		
		public ServicoMB() {
			this.prestadores= new ArrayList<Pessoa>();
			this.concluido= false;
			this.iniciarServico= false;
		}

		public List<Pessoa> getPrestadores() {
			dao.open();
			dao.begin();
			prestadores=daop.findAll();
			dao.close();
			return prestadores;
			
			
		}
		
		
		
		public boolean isIniciarServico() {
			return iniciarServico;
		}

		public void setIniciarServico(boolean iniciarServico) {
			this.iniciarServico = iniciarServico;
		}

		public ServicoResidencia getServico() {
			return servico;
		}

		public void setServico(ServicoResidencia servico) {
			this.servico = servico;
		}

		public boolean isConcluido() {
			return concluido;
		}

		public void setConcluido(boolean concluido) {
			this.concluido = concluido;
		}

		public Pessoa getPrestador() {
			return prestador;
		}

		public void setPrestador(Pessoa prestador) {
			this.prestador = prestador;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public void setPrestadores(List<Pessoa> prestadores) {
			
			this.prestadores = prestadores;
		}
		public String redirectMovimentacaoPrestador(){
			return "movimentacao-prestador?faces-redirect=true";
			
		}
		public void keyPressSenha(){
			System.out.println("digitou");
			this.iniciarServico= true;
			displayInfoMessageToUser("senha digitada: " + senha.toString());
			
			
			
		}
		
		

}
