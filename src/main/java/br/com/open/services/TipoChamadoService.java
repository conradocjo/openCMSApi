package br.com.open.services;

import java.util.List;

import br.com.open.model.TipoChamado;

public interface TipoChamadoService {

	TipoChamado salvar(TipoChamado body);

	void excluir(TipoChamado body);

	TipoChamado ativarDesativarTipoChamado(Long id);

	void deletarSetorPorId(Long id);

	List<TipoChamado> listarTodosTiposChamado();

}
