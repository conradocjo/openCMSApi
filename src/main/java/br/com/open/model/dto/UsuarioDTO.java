package br.com.open.model.dto;

import java.util.Date;

import br.com.open.model.Setor;
import br.com.open.model.Usuario;
import br.com.open.model.enumerators.PerfilUsuario;

public class UsuarioDTO {

	private String nome;
	private String imagemDePerfil;
	private String matricula;
	private String email;
	private String usuario;
	private String senha;
	private Long idSetor;
	private String ramal;
	private PerfilUsuario perfil;
	private Date dataNascimento;

	public static Usuario getUsuarioFromUsuarioDto(String nome, String imagemDePerfil, String matricula, String email,
			String usuario, String senha, Setor setor, String ramal, PerfilUsuario perfil, Date dataNascimento) {
		return new Usuario(nome, imagemDePerfil, matricula, email, usuario, senha, setor, ramal, perfil,
				dataNascimento);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getImagemDePerfil() {
		return imagemDePerfil;
	}

	public void setImagemDePerfil(String imagemDePerfil) {
		this.imagemDePerfil = imagemDePerfil;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public Long getIdSetor() {
		return idSetor;
	}

	public void setIdSetor(Long idSetor) {
		this.idSetor = idSetor;
	}

	public String getRamal() {
		return ramal;
	}

	public void setRamal(String ramal) {
		this.ramal = ramal;
	}

	public PerfilUsuario getPerfil() {
		return perfil;
	}

	public void setPerfil(PerfilUsuario perfil) {
		this.perfil = perfil;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}
