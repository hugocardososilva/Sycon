package model;

import java.util.ArrayList;
import java.util.List;

public class Prestador {
	
	private long id;
	private Informacao informacao;
	private List<TipoServico> tipos;
	private List<Telefone> telefones;
	private List<OcorrenciaPrestadorServico> ocorrencias;
//	private List<Servico> servicos;
	
	public Prestador() {
		this.tipos= new ArrayList<TipoServico>();
		this.telefones= new ArrayList<Telefone>();
		this.ocorrencias= new ArrayList<OcorrenciaPrestadorServico>();
//		this.servicos= new ArrayList<Servico>();
	}

	public long getId() {
		return id;
	}
	
//	public List<Servico> getServicos() {
//		return servicos;
//	}
//
//	public void setServicos(List<Servico> servicos) {
//		this.servicos = servicos;
//	}

	public void setId(long id) {
		this.id = id;
	}

	public List<TipoServico> getTipos() {
		return tipos;
	}

	public void setTipos(List<TipoServico> tipos) {
		this.tipos = tipos;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	

	public Informacao getInformacao() {
		return informacao;
	}

	public void setInformacao(Informacao informacao) {
		this.informacao = informacao;
	}

	public List<OcorrenciaPrestadorServico> getOcorrencias() {
		return ocorrencias;
	}

	public void setOcorrencias(List<OcorrenciaPrestadorServico> ocorrencias) {
		this.ocorrencias = ocorrencias;
	}

	public void addTelefone(Telefone telefone){
		this.telefones.add(telefone);
	}
	public void removeTelefone(Telefone telefone){
		this.telefones.remove(telefone);
	}
	
	public void addTipo(TipoServico ts){
		this.tipos.add(ts);
	}
	public void removeTipo(TipoServico ts){
		this.tipos.remove(ts);
	}
	public void addOcorrencia(OcorrenciaPrestadorServico ops){
		this.ocorrencias.add(ops);
	}
	public void removeOcorrencia(OcorrenciaPrestadorServico ops){
		this.ocorrencias.remove(ops);
	}
//	public void addServico(Servico servico){
//		this.servicos.add(servico);
//	}
//	public void removeServico(Servico servico){
//		this.servicos.remove(servico);
//	}
}
