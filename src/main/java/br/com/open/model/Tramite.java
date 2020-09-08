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
@Table(name = "TB_TRAMITE")
public class Tramite extends BaseModel {

	private static final long serialVersionUID = -1737874157220820102L;

	@Id
	@GeneratedValue
	@JsonProperty("id")
	private Long id = null;

	@Column(name = "TRAMITE")
	@JsonProperty("tramite")
	private String tramite = null;

	@ManyToOne
	@JoinColumn(name = "ID_CHAMADO")
	private Chamado chamado;
	
	public Tramite(String tramite, Chamado chamado) {
		this.setChamado(chamado);
		this.setTramite(tramite);
	}
	
	public Tramite(String tramite) {
		this.setTramite(tramite);
	}
	
	public Tramite() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public Chamado getChamado() {
		return chamado;
	}

	public void setChamado(Chamado chamado) {
		this.chamado = chamado;
	}

	public String getTramite() {
		return tramite;
	}

	public void setTramite(String tramite) {
		this.tramite = tramite;
	}

}
