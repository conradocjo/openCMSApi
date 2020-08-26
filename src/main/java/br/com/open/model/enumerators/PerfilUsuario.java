package br.com.open.model.enumerators;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PerfilUsuario {

	ADMINISTRADOR("ADM"),

	GERENTE("GER"),

	DIRETOR("DIR"),

	ATENDENTE("ATE"),

	COMUM("COM");

	private String value;

	PerfilUsuario(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static PerfilUsuario fromValue(String text) {
		for (PerfilUsuario b : PerfilUsuario.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}
