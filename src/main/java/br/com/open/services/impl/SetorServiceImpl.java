package br.com.open.services.impl;

import static java.util.Objects.nonNull;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.com.open.api.services.exceptions.DataIntegrityException;
import br.com.open.model.Setor;
import br.com.open.model.enumerators.StatusAtivoInativo;
import br.com.open.repositories.SetorRepository;
import br.com.open.services.SetorService;

@Service
public class SetorServiceImpl implements SetorService {

	@Autowired
	public SetorRepository repo;

	@Override
	public Setor salvar(Setor setor) {
		return repo.save(setor);
	}
	
	@Override
	public Setor editarSetor(String nomeSetor, Long idSetor) {
		Setor setor = null;
		if (idSetor != null && nomeSetor != null) {
			setor = this.repo.findById(idSetor).get();
			setor.setNome(nomeSetor);
		}
		return repo.save(setor);
	}

	@Override
	public void deletarSetor(Setor setor) {
		try {
			repo.delete(setor);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não foi possível excluir setor.");
		}
	}

	@Override
	public void deletaSetorPorId(Long id) {
		try {
			repo.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não foi possível excluir setor.");
		}
	}

	@Override
	public Setor ativarDesativarSetor(Long id) {
		Setor setor = null;
		if (nonNull(id)) {
			setor = repo.findById(id).get();
			if (setor.getStatus().equals(StatusAtivoInativo.INATIVO)) {
				setor.setStatus(StatusAtivoInativo.ATIVO);
			} else {
				setor.setStatus(StatusAtivoInativo.INATIVO);
			}
		}
		return repo.save(setor);
	}
	
	@Override
	public List<Setor> listarTodosSetores() {
		return repo.findAll();
	}
	
	@Override
	public Setor recuperarSetorPorId(Long id) {
		return repo.findById(id).get();
	}

}
