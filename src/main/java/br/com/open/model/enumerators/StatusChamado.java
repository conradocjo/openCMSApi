package br.com.open.model.enumerators;

public enum StatusChamado {
	
	INICIADO("I"),

	EM_ANDAMENTO("A"),

	ESCALONADO("E"),

	CONCLUIDO("C");

	private String value;

	StatusChamado(String value) {
		this.value = value;
	}

	public String toString() {
		return String.valueOf(value);
	}

	public static StatusChamado fromValue(String text) {
		for (StatusChamado b : StatusChamado.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}
