package br.com.open.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.envers.Audited;
import org.springframework.validation.annotation.Validated;

import br.com.open.model.enumerators.PesoChamado;
import br.com.open.model.enumerators.StatusAtivoInativo;

@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-08-24T23:05:39.296Z")

@Audited
@Entity
@Table(name = "TB_TIPO_CHAMADO")
public class TipoChamado extends BaseModel {

	private static final long serialVersionUID = -7203656258522127198L;

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "NOME", unique = true)
	private String nome;

	@Enumerated(EnumType.STRING)
	@Column(name = "PESO_CHAMADO", nullable = false, length = 15)
	private PesoChamado peso;

	@Column(name = "TEMPO_MEDIO_SLA", nullable = false)
	private Integer tempoMedioSla;

	@Enumerated(EnumType.STRING)
	@Column(name = "STATUS", nullable = false, length = 15)
	private StatusAtivoInativo status;

	public TipoChamado() {

	}

	public TipoChamado(String nome, PesoChamado pesoChamado, Integer tempoMedioSla) {
		this.setNome(nome);
		this.setPeso(pesoChamado);
		this.setDataCriacao(new Date());
		this.setTempoMedioSla(tempoMedioSla);
		this.status = StatusAtivoInativo.ATIVO;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public PesoChamado getPeso() {
		return peso;
	}

	public void setPeso(PesoChamado peso) {
		this.peso = peso;
	}

	public Integer getTempoMedioSla() {
		return tempoMedioSla;
	}

	public void setTempoMedioSla(Integer tempoMedioSla) {
		this.tempoMedioSla = tempoMedioSla;
	}

	public StatusAtivoInativo getStatus() {
		return status;
	}

	public void setStatus(StatusAtivoInativo status) {
		this.status = status;
	}

}
