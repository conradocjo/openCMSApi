package br.com.open.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.envers.Audited;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.open.model.enumerators.PerfilUsuario;
import br.com.open.model.enumerators.StatusAtivoInativo;

@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-08-24T23:05:39.296Z")

@Audited
@Entity
@Table(name = "TB_USUARIO")
public class Usuario extends BaseModel implements Serializable {

	private static final long serialVersionUID = 4121512707416795575L;

	@Id
	@GeneratedValue
	@JsonProperty("id")
	private Long id;

	@JsonProperty("nome")
	@Column(name = "NOME", nullable = false)
	private String nome;

	@JsonProperty("imagemDePerfil")
	@Column(name = "IMAGEM_PERFIL", nullable = true)
	private String imagemDePerfil;

	@JsonProperty("matricula")
	@Column(name = "MATRICULA", nullable = true, unique = true, length = 20)
	private String matricula;

	@JsonProperty("email")
	@Column(name = "EMAIL", nullable = false, unique = true, length = 50)
	private String email;

	@JsonProperty("usuario")
	@Column(name = "USUARIO", nullable = false, unique = true, length = 20)
	private String usuario;

	@JsonProperty("senha")
	@Column(name = "SENHA", nullable = false, length = 20)
	private String senha;

	@JsonProperty("setor")
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "Setor")
	private Setor setor;

	@JsonProperty("ramal")
	@Column(name = "RAMAL", nullable = true, length = 10)
	private String ramal;

	@JsonProperty("status")
	@Enumerated(EnumType.STRING)
	@Column(name = "STATUS", nullable = false, length = 15)
	private StatusAtivoInativo status;

	@JsonProperty("perfil")
	@Enumerated(EnumType.STRING)
	@Column(name = "PERFIL_USUARIO", nullable = false, length = 15)
	private PerfilUsuario perfil;

	@JsonProperty("dataNascimento")
	@Column(name = "DATA_NASCIMENTO", nullable = true)
	private Date dataNascimento;

	public Usuario() {
	}

	public Usuario(String nome, String imagemDePerfil, String matricula, String email, String usuario, String senha,
			Setor setor, String ramal, PerfilUsuario perfil, Date dataNascimento) {
		this.setStatus(StatusAtivoInativo.ATIVO);
		this.setDataCriacao(new Date());
		this.setNome(nome);
		this.setImagemDePerfil(imagemDePerfil);
		this.setMatricula(matricula);
		this.setEmail(email);
		this.setUsuario(usuario);
		this.setSenha(senha);
		this.setSetor(setor);
		this.setRamal(ramal);
		this.setPerfil(perfil);
		this.setDataNascimento(dataNascimento);
	}

	public Usuario id(Long id) {
		this.id = id;
		return this;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario nome(String nome) {
		this.nome = nome;
		return this;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Usuario imagemDePerfil(String imagemDePerfil) {
		this.imagemDePerfil = imagemDePerfil;
		return this;
	}

	public String getImagemDePerfil() {
		return imagemDePerfil;
	}

	public void setImagemDePerfil(String imagemDePerfil) {
		this.imagemDePerfil = imagemDePerfil;
	}

	public Usuario matricula(String matricula) {
		this.matricula = matricula;
		return this;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Usuario email(String email) {
		this.email = email;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Usuario usuario(String usuario) {
		this.usuario = usuario;
		return this;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Usuario senha(String senha) {
		this.senha = senha;
		return this;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Usuario setor(Setor setor) {
		this.setor = setor;
		return this;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public Usuario ramal(String ramal) {
		this.ramal = ramal;
		return this;
	}

	public String getRamal() {
		return ramal;
	}

	public void setRamal(String ramal) {
		this.ramal = ramal;
	}

	public Usuario status(StatusAtivoInativo status) {
		this.status = status;
		return this;
	}

	public StatusAtivoInativo getStatus() {
		return status;
	}

	public void setStatus(StatusAtivoInativo status) {
		this.status = status;
	}

	public Usuario perfil(PerfilUsuario perfil) {
		this.perfil = perfil;
		return this;
	}

	public PerfilUsuario getPerfil() {
		return perfil;
	}

	public void setPerfil(PerfilUsuario perfil) {
		this.perfil = perfil;
	}

	public Usuario dataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
		return this;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Usuario usuario = (Usuario) o;
		return Objects.equals(this.id, usuario.id) && Objects.equals(this.nome, usuario.nome)
				&& Objects.equals(this.imagemDePerfil, usuario.imagemDePerfil)
				&& Objects.equals(this.matricula, usuario.matricula) && Objects.equals(this.email, usuario.email)
				&& Objects.equals(this.usuario, usuario.usuario) && Objects.equals(this.senha, usuario.senha)
				&& Objects.equals(this.ramal, usuario.ramal) && Objects.equals(this.status, usuario.status)
				&& Objects.equals(this.perfil, usuario.perfil)
				&& Objects.equals(this.getDataCriacao(), usuario.getDataCriacao())
				&& Objects.equals(this.dataNascimento, usuario.dataNascimento);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome, imagemDePerfil, matricula, email, usuario, senha, setor, ramal, status, perfil,
				getDataCriacao(), dataNascimento);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Usuario {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
		sb.append("    imagemDePerfil: ").append(toIndentedString(imagemDePerfil)).append("\n");
		sb.append("    matricula: ").append(toIndentedString(matricula)).append("\n");
		sb.append("    email: ").append(toIndentedString(email)).append("\n");
		sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
		sb.append("    senha: ").append(toIndentedString(senha)).append("\n");
		sb.append("    setor: ").append(toIndentedString(setor)).append("\n");
		sb.append("    ramal: ").append(toIndentedString(ramal)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    perfil: ").append(toIndentedString(perfil)).append("\n");
		sb.append("    dataCriacao: ").append(toIndentedString(getDataCriacao())).append("\n");
		sb.append("    dataNascimento: ").append(toIndentedString(dataNascimento)).append("\n");
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
