package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Frequente extends Prestador{
	
	private String nome;
	private String sobrenome;
	private long cpf;
	private long rg;
	private String orgaoExpeditor;
	private String email;
	private String foto;
	private String senha;
	private boolean bloqueado;
	private Date ultimoAcesso;
	private List<Servico> servicos;
	
	private Lote lote;
	
	
	public Frequente() {
		super();
		this.servicos= new ArrayList<Servico>();
	}


	public String getNome() {
		return nome;
	}


	public Lote getLote() {
		return lote;
	}


	public void setLote(Lote lote) {
		this.lote = lote;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public long getCpf() {
		return cpf;
	}


	public void setCpf(long cpf) {
		this.cpf = cpf;
	}


	public long getRg() {
		return rg;
	}


	public void setRg(long rg) {
		this.rg = rg;
	}


	public String getOrgaoExpeditor() {
		return orgaoExpeditor;
	}


	public void setOrgaoExpeditor(String orgaoExpeditor) {
		this.orgaoExpeditor = orgaoExpeditor;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFoto() {
		return foto;
	}


	public void setFoto(String foto) {
		this.foto = foto;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public boolean isBloqueado() {
		return bloqueado;
	}


	public void setBloqueado(boolean bloqueado) {
		this.bloqueado = bloqueado;
	}


	public Date getUltimoAcesso() {
		return ultimoAcesso;
	}


	public void setUltimoAcesso(Date ultimoAcesso) {
		this.ultimoAcesso = ultimoAcesso;
	}
	

	public List<Servico> getServicos() {
		return servicos;
	}


	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}	
	public void addServico(Servico s){
		this.servicos.add(s);
	}
	public void removeServico(Servico s){
		this.servicos.remove(s);
	}
	
	
	
	

}
