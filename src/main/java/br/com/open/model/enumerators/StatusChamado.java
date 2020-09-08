package br.com.open.model.enumerators;

public enum StatusChamado {
	
	ABERTO("Aberto"),
	
	INICIADO("Iniciado"),

	EM_ANDAMENTO("Em andamento"),

	ESCALONADO("Escalonado"),

	CONCLUIDO("Concluído");

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
