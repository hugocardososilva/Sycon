package model;

import java.util.Date;

public class Ocorrencia {
	
	private long id;
	private Date dataOcorrencia;
	private Date horaOcorrencia;
	private String descricao;
	private Usuario usuario;
	
	
	public Ocorrencia() {
		super();
	}
	
	
	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDataOcorrencia() {
		return dataOcorrencia;
	}
	public void setDataOcorrencia(Date dataOcorrencia) {
		this.dataOcorrencia = dataOcorrencia;
	}
	public Date getHoraOcorrencia() {
		return horaOcorrencia;
	}
	public void setHoraOcorrencia(Date horaOcorrencia) {
		this.horaOcorrencia = horaOcorrencia;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
