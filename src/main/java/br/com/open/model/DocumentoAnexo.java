package br.com.open.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import com.fasterxml.jackson.annotation.JsonProperty;

@Audited
@Entity
@Table(name = "TB_DOCUMENTO_ANEXO")
public class DocumentoAnexo extends BaseModel {

	private static final long serialVersionUID = -3295745709906360510L;

	@Id
	@GeneratedValue
	@JsonProperty("id")
	private Long id = null;

	@Column(name = "CAMINHO")
	@JsonProperty("caminho")
	private String caminho = null;

	@ManyToOne
	@JoinColumn(name = "ID_CHAMADO")
	private Chamado chamado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCaminho() {
		return caminho;
	}

	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}

	public Chamado getChamado() {
		return chamado;
	}

	public void setChamado(Chamado chamado) {
		this.chamado = chamado;
	}

}
