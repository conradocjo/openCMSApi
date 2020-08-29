package br.com.open.services;

import java.util.List;

import br.com.open.model.Setor;

public interface SetorService {

	Setor salvar(Setor setor);
	
	void deletarSetor(Setor setor);

	void deletaSetorPorId(Long id);

	Setor ativarDesativarSetor(Long id);

	Setor editarSetor(String nomeSetor, Long idSetor);

	List<Setor> listarTodosSetores();

}
