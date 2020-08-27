package br.com.open.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.envers.Audited;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.open.model.enumerators.StatusAtivoInativo;

@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-08-24T23:05:39.296Z")

@Audited
@Entity
@Table(name = "TB_SETOR")
public class Setor extends BaseModel {

	private static final long serialVersionUID = -7668565496992050065L;

	@Id
	@GeneratedValue
	@JsonProperty("id")
	private Long id = null;

	@JsonProperty("nome")
	@Column(name = "NOME")
	private String nome = null;

	@JsonProperty("status")
	@Enumerated(EnumType.STRING)
	@Column(name = "STATUS", nullable = false, length = 1)
	private StatusAtivoInativo status = null;

	public Setor id(Long id) {
		this.id = id;
		return this;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Setor nome(String nome) {
		this.nome = nome;
		return this;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Setor status(StatusAtivoInativo status) {
		this.status = status;
		return this;
	}

	public StatusAtivoInativo getStatus() {
		return status;
	}

	public void setStatus(StatusAtivoInativo status) {
		this.status = status;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Setor setor = (Setor) o;
		return Objects.equals(this.id, setor.id) && Objects.equals(this.nome, setor.nome)
				&& Objects.equals(this.status, setor.status)
				&& Objects.equals(getDataCriacao(), setor.getDataCriacao());
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome, status, getDataCriacao());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Setor {\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    dataCriacao: ").append(toIndentedString(getDataCriacao())).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
