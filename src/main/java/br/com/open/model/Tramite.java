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
@Table(name = "TB_TRAMITE")
public class Tramite {
	
	@Id
	@GeneratedValue
	@JsonProperty("id")
	private Long id = null;
	
	@JsonProperty("dataCriacao")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA_CRIACAO")
	private Date dataGravacao = null;
	
	@Column(name = "TRAMITE")
	@JsonProperty("tramite")
	private String titulo = null;
	

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

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	
	
}
