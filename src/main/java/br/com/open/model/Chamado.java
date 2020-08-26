package br.com.open.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.envers.Audited;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.open.model.enumerators.StatusChamado;

@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-08-24T23:05:39.296Z")

@Audited
@Entity
@Table(name = "TB_CHAMADO")
public class Chamado {

	@Id
	@GeneratedValue
	@JsonProperty("id")
	private Long id = null;

	@Column(name = "TITULO")
	@JsonProperty("titulo")
	private String titulo = null;

	// TODO
	@JsonProperty("tramite")
	private List<Tramite> tramites = null;

	// TODO
	@JsonProperty("documentoAnexo")
	private List<DocumentoAnexo> documentosAnexo = null;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "RESPONSAVEL")
	@JsonProperty("responsavel")
	private Usuario responsavel = null;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "SOLICITANTE")
	@JsonProperty("solicitante")
	private Usuario solicitante = null;

	@JsonProperty("status")
	@Enumerated(EnumType.STRING)
	@Column(name = "STATUS_CHAMADO", nullable = false)
	private StatusChamado status = null;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "TIPO_CHAMADO")
	@JsonProperty("tipoChamado")
	private TipoChamado tipoChamado = null;

	@JsonProperty("dataCriacao")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA_CRIACAO")
	private Date dataCriacao = null;

	public Chamado id(Long id) {
		this.id = id;
		return this;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Chamado titulo(String titulo) {
		this.titulo = titulo;
		return this;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Chamado responsavel(Usuario responsavel) {
		this.responsavel = responsavel;
		return this;
	}

	public Usuario getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Usuario responsavel) {
		this.responsavel = responsavel;
	}

	public Chamado solicitante(Usuario solicitante) {
		this.solicitante = solicitante;
		return this;
	}

	public Usuario getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(Usuario solicitante) {
		this.solicitante = solicitante;
	}

	public StatusChamado getStatus() {
		return status;
	}

	public void setStatus(StatusChamado status) {
		this.status = status;
	}

	public TipoChamado getTipoChamado() {
		return tipoChamado;
	}

	public void setTipoChamado(TipoChamado tipoChamado) {
		this.tipoChamado = tipoChamado;
	}

	public Chamado dataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
		return this;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public List<Tramite> getTramites() {
		return tramites;
	}

	public void setTramites(List<Tramite> tramites) {
		this.tramites = tramites;
	}

	public List<DocumentoAnexo> getDocumentosAnexo() {
		return documentosAnexo;
	}

	public void setDocumentosAnexo(List<DocumentoAnexo> documentosAnexo) {
		this.documentosAnexo = documentosAnexo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataCriacao == null) ? 0 : dataCriacao.hashCode());
		result = prime * result + ((documentosAnexo == null) ? 0 : documentosAnexo.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((responsavel == null) ? 0 : responsavel.hashCode());
		result = prime * result + ((solicitante == null) ? 0 : solicitante.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((tipoChamado == null) ? 0 : tipoChamado.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		result = prime * result + ((tramites == null) ? 0 : tramites.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chamado other = (Chamado) obj;
		if (dataCriacao == null) {
			if (other.dataCriacao != null)
				return false;
		} else if (!dataCriacao.equals(other.dataCriacao))
			return false;
		if (documentosAnexo == null) {
			if (other.documentosAnexo != null)
				return false;
		} else if (!documentosAnexo.equals(other.documentosAnexo))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (responsavel == null) {
			if (other.responsavel != null)
				return false;
		} else if (!responsavel.equals(other.responsavel))
			return false;
		if (solicitante == null) {
			if (other.solicitante != null)
				return false;
		} else if (!solicitante.equals(other.solicitante))
			return false;
		if (status != other.status)
			return false;
		if (tipoChamado == null) {
			if (other.tipoChamado != null)
				return false;
		} else if (!tipoChamado.equals(other.tipoChamado))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		if (tramites == null) {
			if (other.tramites != null)
				return false;
		} else if (!tramites.equals(other.tramites))
			return false;
		return true;
	}

}
