package br.com.open.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
	private String titulo = null;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
