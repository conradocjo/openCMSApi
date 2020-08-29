package br.com.open.model.dto;

import br.com.open.model.TipoChamado;
import br.com.open.model.enumerators.PesoChamado;

public class TipoChamadoDTO {
	
	private String nome;
	private PesoChamado pesoChamado;
	private Integer tempoMedioSla;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public PesoChamado getPesoChamado() {
		return pesoChamado;
	}

	public void setPesoChamado(PesoChamado pesoChamado) {
		this.pesoChamado = pesoChamado;
	}

	public Integer getTempoMedioSla() {
		return tempoMedioSla;
	}

	public void setTempoMedioSla(Integer tempoMedioSla) {
		this.tempoMedioSla = tempoMedioSla;
	}

	public static TipoChamado retornaTipoChamadoDTO(String nome, PesoChamado pesoChamado, Integer tempoMedioSla) {
		return new TipoChamado(nome, pesoChamado, tempoMedioSla);
	}
}
