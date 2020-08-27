package br.com.open.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.open.model.Chamado;
import br.com.open.repositories.ChamadoRepository;
import br.com.open.services.ChamadoService;

@Service
public class ChamadoServiceImpl implements ChamadoService {

	@Autowired
	private ChamadoRepository repo;

	@Override
	public Chamado abrirChamado(Chamado chamado) {
		return repo.save(chamado);
	}
}
