package br.com.open.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * TipoChamado
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-08-24T23:05:39.296Z")




public class TipoChamado   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("nome")
  private String nome = null;

  /**
   * Peso do chamado
   */
  public enum PesoEnum {
    _1("peso 1"),
    
    _2("peso 2"),
    
    _3("peso 3"),
    
    _4("peso 4"),
    
    _5("peso 5");

    private String value;

    PesoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PesoEnum fromValue(String text) {
      for (PesoEnum b : PesoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("peso")
  private PesoEnum peso = null;

  @JsonProperty("tempoMedioSLA")
  private Long tempoMedioSLA = null;

  /**
   * Status do tipo
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

  public TipoChamado id(Long id) {
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

  public TipoChamado nome(String nome) {
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

  public TipoChamado peso(PesoEnum peso) {
    this.peso = peso;
    return this;
  }

  /**
   * Peso do chamado
   * @return peso
  **/
  @ApiModelProperty(value = "Peso do chamado")


  public PesoEnum getPeso() {
    return peso;
  }

  public void setPeso(PesoEnum peso) {
    this.peso = peso;
  }

  public TipoChamado tempoMedioSLA(Long tempoMedioSLA) {
    this.tempoMedioSLA = tempoMedioSLA;
    return this;
  }

  /**
   * Get tempoMedioSLA
   * @return tempoMedioSLA
  **/
  @ApiModelProperty(value = "")


  public Long getTempoMedioSLA() {
    return tempoMedioSLA;
  }

  public void setTempoMedioSLA(Long tempoMedioSLA) {
    this.tempoMedioSLA = tempoMedioSLA;
  }

  public TipoChamado status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status do tipo
   * @return status
  **/
  @ApiModelProperty(value = "Status do tipo")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
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
    return Objects.equals(this.id, tipoChamado.id) &&
        Objects.equals(this.nome, tipoChamado.nome) &&
        Objects.equals(this.peso, tipoChamado.peso) &&
        Objects.equals(this.tempoMedioSLA, tipoChamado.tempoMedioSLA) &&
        Objects.equals(this.status, tipoChamado.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, peso, tempoMedioSLA, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoChamado {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    peso: ").append(toIndentedString(peso)).append("\n");
    sb.append("    tempoMedioSLA: ").append(toIndentedString(tempoMedioSLA)).append("\n");
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

