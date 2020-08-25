package br.com.open.model;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * Usuario
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-08-24T23:05:39.296Z")




public class Usuario   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("nome")
  private String nome = null;

  @JsonProperty("imagemDePerfil")
  private String imagemDePerfil = null;

  @JsonProperty("matricula")
  private String matricula = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("usuario")
  private String usuario = null;

  @JsonProperty("senha")
  private String senha = null;

  @JsonProperty("setor")
  private String setor = null;

  @JsonProperty("gestor")
  private Boolean gestor = false;

  @JsonProperty("ramal")
  private String ramal = null;

  /**
   * Order Status
   */
  public enum StatusEnum {
    ATIVO("ativo"),
    
    INATIVO("inativo");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  /**
   * Perfil do usuário
   */
  public enum PerfilEnum {
    ADMINISTRADOR("administrador"),
    
    GERENTE("gerente"),
    
    DIRETOR("diretor"),
    
    ATENDENTE("atendente"),
    
    COMUM("comum");

    private String value;

    PerfilEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PerfilEnum fromValue(String text) {
      for (PerfilEnum b : PerfilEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("perfil")
  private PerfilEnum perfil = null;

  @JsonProperty("dataCriacao")
  private OffsetDateTime dataCriacao = null;

  @JsonProperty("dataNascimento")
  private OffsetDateTime dataNascimento = null;

  public Usuario id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


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

  /**
   * Get nome
   * @return nome
  **/
  @ApiModelProperty(value = "")


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

  /**
   * Get imagemDePerfil
   * @return imagemDePerfil
  **/
  @ApiModelProperty(value = "")


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

  /**
   * Get matricula
   * @return matricula
  **/
  @ApiModelProperty(value = "")


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

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")


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

  /**
   * Get usuario
   * @return usuario
  **/
  @ApiModelProperty(value = "")


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

  /**
   * Get senha
   * @return senha
  **/
  @ApiModelProperty(value = "")


  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public Usuario setor(String setor) {
    this.setor = setor;
    return this;
  }

  /**
   * Get setor
   * @return setor
  **/
  @ApiModelProperty(value = "")


  public String getSetor() {
    return setor;
  }

  public void setSetor(String setor) {
    this.setor = setor;
  }

  public Usuario gestor(Boolean gestor) {
    this.gestor = gestor;
    return this;
  }

  /**
   * Get gestor
   * @return gestor
  **/
  @ApiModelProperty(value = "")


  public Boolean isGestor() {
    return gestor;
  }

  public void setGestor(Boolean gestor) {
    this.gestor = gestor;
  }

  public Usuario ramal(String ramal) {
    this.ramal = ramal;
    return this;
  }

  /**
   * Get ramal
   * @return ramal
  **/
  @ApiModelProperty(value = "")


  public String getRamal() {
    return ramal;
  }

  public void setRamal(String ramal) {
    this.ramal = ramal;
  }

  public Usuario status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Order Status
   * @return status
  **/
  @ApiModelProperty(value = "Order Status")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Usuario perfil(PerfilEnum perfil) {
    this.perfil = perfil;
    return this;
  }

  /**
   * Perfil do usuário
   * @return perfil
  **/
  @ApiModelProperty(value = "Perfil do usuário")


  public PerfilEnum getPerfil() {
    return perfil;
  }

  public void setPerfil(PerfilEnum perfil) {
    this.perfil = perfil;
  }

  public Usuario dataCriacao(OffsetDateTime dataCriacao) {
    this.dataCriacao = dataCriacao;
    return this;
  }

  /**
   * Get dataCriacao
   * @return dataCriacao
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDataCriacao() {
    return dataCriacao;
  }

  public void setDataCriacao(OffsetDateTime dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  public Usuario dataNascimento(OffsetDateTime dataNascimento) {
    this.dataNascimento = dataNascimento;
    return this;
  }

  /**
   * Get dataNascimento
   * @return dataNascimento
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(OffsetDateTime dataNascimento) {
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
    return Objects.equals(this.id, usuario.id) &&
        Objects.equals(this.nome, usuario.nome) &&
        Objects.equals(this.imagemDePerfil, usuario.imagemDePerfil) &&
        Objects.equals(this.matricula, usuario.matricula) &&
        Objects.equals(this.email, usuario.email) &&
        Objects.equals(this.usuario, usuario.usuario) &&
        Objects.equals(this.senha, usuario.senha) &&
        Objects.equals(this.setor, usuario.setor) &&
        Objects.equals(this.gestor, usuario.gestor) &&
        Objects.equals(this.ramal, usuario.ramal) &&
        Objects.equals(this.status, usuario.status) &&
        Objects.equals(this.perfil, usuario.perfil) &&
        Objects.equals(this.dataCriacao, usuario.dataCriacao) &&
        Objects.equals(this.dataNascimento, usuario.dataNascimento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, imagemDePerfil, matricula, email, usuario, senha, setor, gestor, ramal, status, perfil, dataCriacao, dataNascimento);
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
    sb.append("    gestor: ").append(toIndentedString(gestor)).append("\n");
    sb.append("    ramal: ").append(toIndentedString(ramal)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    perfil: ").append(toIndentedString(perfil)).append("\n");
    sb.append("    dataCriacao: ").append(toIndentedString(dataCriacao)).append("\n");
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

