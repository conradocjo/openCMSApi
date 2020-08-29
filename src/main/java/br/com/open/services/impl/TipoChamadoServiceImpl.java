package br.com.open.services.impl;

import static java.util.Objects.nonNull;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.open.api.services.exceptions.DataIntegrityException;
import br.com.open.model.TipoChamado;
import br.com.open.model.enumerators.StatusAtivoInativo;
import br.com.open.repositories.TipoChamadoRepository;
import br.com.open.services.TipoChamadoService;

@Service
public class TipoChamadoServiceImpl implements TipoChamadoService {

	@Autowired
	private TipoChamadoRepository repo;

	@Override
	public TipoChamado salvar(TipoChamado body) {
		return repo.save(body);
	}

	@Override
	public void excluir(TipoChamado body) {
		try {
			repo.delete(body);
		} catch (DataIntegrityException e) {
			throw new DataIntegrityException(e.getMessage(), e.getCause());
		}
	}

	@Override
	public TipoChamado ativarDesativarTipoChamado(Long id) {
		TipoChamado tipoChamado = null;
		if (nonNull(id)) {
			tipoChamado = repo.findById(id).get();
			if (nonNull(tipoChamado)) {
				if (tipoChamado.getStatus().equals(StatusAtivoInativo.ATIVO)) {
					tipoChamado.setStatus(StatusAtivoInativo.INATIVO);
				} else {
					tipoChamado.setStatus(StatusAtivoInativo.ATIVO);
				}
			}
		}
		return repo.save(tipoChamado);
	}

	@Override
	public List<TipoChamado> listarTodosTiposChamado() {
		return repo.findAll();
	}

	@Override
	public void deletarSetorPorId(Long id) {
		if (nonNull(id)) {
			TipoChamado tipoChamado = repo.findById(id).get();
			if (nonNull(tipoChamado)) {
				repo.delete(tipoChamado);
			}
		}
	}
}
