package br.com.open.model.dto;

import java.io.Serializable;

public class CredenciaisDTO implements Serializable {

	private static final long serialVersionUID = -862047453445199790L;

	private String usuario;
	private String senha;

	public CredenciaisDTO() {
	}

	public CredenciaisDTO(String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
