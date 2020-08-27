package br.com.open.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.open.model.Setor;
import br.com.open.repositories.SetorRepository;
import br.com.open.services.SetorService;

@Service
public class SetorServiceImpl implements SetorService {

	@Autowired
	private SetorRepository repo;

	@Override
	public Setor cadastrarSetor(Setor setor) {
		return repo.save(setor);
	}

}
