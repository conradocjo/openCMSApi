package br.com.open.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonProperty;

@MappedSuperclass
public class BaseModel implements Serializable {

	private static final long serialVersionUID = -6463793603079440874L;

	@JsonProperty("dataCriacao")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA_CRIACAO")
	private Date dataCriacao = null;

	@JsonProperty("dataAtualizacao")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA_ATUALIZACAO")
	private Date dataAtualizacao = null;

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

}
