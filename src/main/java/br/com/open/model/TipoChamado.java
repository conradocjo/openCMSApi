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

import br.com.open.model.enumerators.PesoChamado;
import br.com.open.model.enumerators.StatusAtivoInativo;

@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-08-24T23:05:39.296Z")

@Audited
@Entity
@Table(name = "TB_TIPO_CHAMADO")
public class TipoChamado extends BaseModel {

	private static final long serialVersionUID = 281986371637384214L;

	@Id
	@GeneratedValue
	@JsonProperty("id")
	private Long id = null;

	@JsonProperty("nome")
	@Column(name = "NOME")
	private String nome = null;

	@JsonProperty("peso")
	@Enumerated(EnumType.STRING)
	@Column(name = "PESO_CHAMADO", nullable = false, length = 1)
	private PesoChamado peso = null;

	@JsonProperty("tempoMedioSla")
	@Column(name = "TEMPO_MEDIO_SLA", nullable = false, length = 5)
	private Integer tempoMedioSla = null;

	@JsonProperty("status")
	@Enumerated(EnumType.STRING)
	@Column(name = "STATUS", nullable = false, length = 1)
	private StatusAtivoInativo status = null;
	
	//Getters and Setters

	public TipoChamado id(Long id) {
		this.id = id;
		return this;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoChamado nome(String nome) {
		this.nome = nome;
		return this;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoChamado peso(PesoChamado peso) {
		this.peso = peso;
		return this;
	}

	public PesoChamado getPeso() {
		return peso;
	}

	public void setPeso(PesoChamado peso) {
		this.peso = peso;
	}

	public TipoChamado tempoMedioSla(Integer tempoMedioSla) {
		this.tempoMedioSla = tempoMedioSla;
		return this;
	}

	public Integer gettempoMedioSla() {
		return tempoMedioSla;
	}

	public void settempoMedioSla(Integer tempoMedioSla) {
		this.tempoMedioSla = tempoMedioSla;
	}

	public TipoChamado status(StatusAtivoInativo status) {
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
		TipoChamado tipoChamado = (TipoChamado) o;
		return Objects.equals(this.id, tipoChamado.id) && Objects.equals(this.nome, tipoChamado.nome)
				&& Objects.equals(this.peso, tipoChamado.peso)
				&& Objects.equals(this.tempoMedioSla, tipoChamado.tempoMedioSla)
				&& Objects.equals(this.status, tipoChamado.status);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome, peso, tempoMedioSla, status);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TipoChamado {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
		sb.append("    peso: ").append(toIndentedString(peso)).append("\n");
		sb.append("    tempoMedioSla: ").append(toIndentedString(tempoMedioSla)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
