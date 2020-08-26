package br.com.open.model.enumerators;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PesoChamado {

	PESO_1(1),

	PESO_2(2),

	PESO_3(3),

	PESO_4(4),

	PESO_5(5);

	private Integer value;

	PesoChamado(Integer value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static PesoChamado fromValue(String text) {
		for (PesoChamado b : PesoChamado.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}
