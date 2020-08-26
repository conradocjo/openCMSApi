package br.com.open.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.envers.Audited;

import com.fasterxml.jackson.annotation.JsonProperty;

@Audited
@Entity
@Table(name = "TB_DOCUMENTO_ANEXO")
public class DocumentoAnexo {

	@Id
	@GeneratedValue
	@JsonProperty("id")
	private Long id = null;

	@Column(name = "DATA_CRIACAO")
	@JsonProperty("dataCriacao")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataGravacao = null;

	@Column(name = "CAMINHO")
	@JsonProperty("caminho")
	private String caminho = null;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataGravacao() {
		return dataGravacao;
	}

	public void setDataGravacao(Date dataGravacao) {
		this.dataGravacao = dataGravacao;
	}

	public String getCaminho() {
		return caminho;
	}

	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}

}
