package br.com.open.model.enumerators;

public enum PerfilUsuario {

	ADMINISTRADOR(1, "ADM"),

	GERENTE(2, "GER"),

	DIRETOR(3, "DIR"),

	ATENDENTE(4, "ATE"),

	COMUM(5, "COM");

	private int cod;
	private String descricao;

	private PerfilUsuario(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public static PerfilUsuario toEnum(Integer cod) {

		if (cod == null) {
			return null;
		}

		for (PerfilUsuario x : PerfilUsuario.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}

		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}
