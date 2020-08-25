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
 * Chamado
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-08-24T23:05:39.296Z")




public class Chamado   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("titulo")
  private String titulo = null;

  @JsonProperty("tramite")
  private String tramite = null;

  @JsonProperty("documentoAnexo")
  private String documentoAnexo = null;

  @JsonProperty("responsavel")
  private String responsavel = null;

  @JsonProperty("solicitante")
  private String solicitante = null;

  /**
   * Status do chamado
   */
  public enum StatusEnum {
    INICIADO("iniciado"),
    
    EM_ANDAMENTO("em andamento"),
    
    ESCALONADO("escalonado"),
    
    CONCLUIDO("concluido");

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

  @JsonProperty("tipoChamado")
  private String tipoChamado = null;

  @JsonProperty("dataCriacao")
  private OffsetDateTime dataCriacao = null;

  public Chamado id(Long id) {
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

  public Chamado titulo(String titulo) {
    this.titulo = titulo;
    return this;
  }

  /**
   * Get titulo
   * @return titulo
  **/
  @ApiModelProperty(value = "")


  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public Chamado tramite(String tramite) {
    this.tramite = tramite;
    return this;
  }

  /**
   * Get tramite
   * @return tramite
  **/
  @ApiModelProperty(value = "")


  public String getTramite() {
    return tramite;
  }

  public void setTramite(String tramite) {
    this.tramite = tramite;
  }

  public Chamado documentoAnexo(String documentoAnexo) {
    this.documentoAnexo = documentoAnexo;
    return this;
  }

  /**
   * Get documentoAnexo
   * @return documentoAnexo
  **/
  @ApiModelProperty(value = "")


  public String getDocumentoAnexo() {
    return documentoAnexo;
  }

  public void setDocumentoAnexo(String documentoAnexo) {
    this.documentoAnexo = documentoAnexo;
  }

  public Chamado responsavel(String responsavel) {
    this.responsavel = responsavel;
    return this;
  }

  /**
   * Get responsavel
   * @return responsavel
  **/
  @ApiModelProperty(value = "")


  public String getResponsavel() {
    return responsavel;
  }

  public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
  }

  public Chamado solicitante(String solicitante) {
    this.solicitante = solicitante;
    return this;
  }

  /**
   * Get solicitante
   * @return solicitante
  **/
  @ApiModelProperty(value = "")


  public String getSolicitante() {
    return solicitante;
  }

  public void setSolicitante(String solicitante) {
    this.solicitante = solicitante;
  }

  public Chamado status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status do chamado
   * @return status
  **/
  @ApiModelProperty(value = "Status do chamado")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Chamado tipoChamado(String tipoChamado) {
    this.tipoChamado = tipoChamado;
    return this;
  }

  /**
   * Get tipoChamado
   * @return tipoChamado
  **/
  @ApiModelProperty(value = "")


  public String getTipoChamado() {
    return tipoChamado;
  }

  public void setTipoChamado(String tipoChamado) {
    this.tipoChamado = tipoChamado;
  }

  public Chamado dataCriacao(OffsetDateTime dataCriacao) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Chamado chamado = (Chamado) o;
    return Objects.equals(this.id, chamado.id) &&
        Objects.equals(this.titulo, chamado.titulo) &&
        Objects.equals(this.tramite, chamado.tramite) &&
        Objects.equals(this.documentoAnexo, chamado.documentoAnexo) &&
        Objects.equals(this.responsavel, chamado.responsavel) &&
        Objects.equals(this.solicitante, chamado.solicitante) &&
        Objects.equals(this.status, chamado.status) &&
        Objects.equals(this.tipoChamado, chamado.tipoChamado) &&
        Objects.equals(this.dataCriacao, chamado.dataCriacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, titulo, tramite, documentoAnexo, responsavel, solicitante, status, tipoChamado, dataCriacao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Chamado {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    titulo: ").append(toIndentedString(titulo)).append("\n");
    sb.append("    tramite: ").append(toIndentedString(tramite)).append("\n");
    sb.append("    documentoAnexo: ").append(toIndentedString(documentoAnexo)).append("\n");
    sb.append("    responsavel: ").append(toIndentedString(responsavel)).append("\n");
    sb.append("    solicitante: ").append(toIndentedString(solicitante)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tipoChamado: ").append(toIndentedString(tipoChamado)).append("\n");
    sb.append("    dataCriacao: ").append(toIndentedString(dataCriacao)).append("\n");
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

