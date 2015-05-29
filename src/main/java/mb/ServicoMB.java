package mb;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.DAO;
import dao.DAOPrestadorPessoa;
import model.Pessoa;

@ManagedBean
@ViewScoped
public class ServicoMB extends AbstractMB {
		private List<Pessoa> prestadores;
		private DAOPrestadorPessoa daop= new DAOPrestadorPessoa();
		private DAO dao = new DAO();
		
		public ServicoMB() {
			this.prestadores= new ArrayList<Pessoa>();
		}

		public List<Pessoa> getPrestadores() {
			dao.open();
			dao.begin();
			prestadores=daop.findAll();
			dao.close();
			return prestadores;
		}

		public void setPrestadores(List<Pessoa> prestadores) {
			
			this.prestadores = prestadores;
		}
		public String redirectMovimentacaoPrestador(){
			return "movimentacao-prestador?faces-redirect=true";
			
		}
		
		

}
