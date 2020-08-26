package br.com.open.model.enumerators;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum StatusAtivoInativo {

	ATIVO("A"),

	INATIVO("I");

	private String value;

	StatusAtivoInativo(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static StatusAtivoInativo fromValue(String text) {
		for (StatusAtivoInativo b : StatusAtivoInativo.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}
