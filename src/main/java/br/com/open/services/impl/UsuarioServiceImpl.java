package br.com.open.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.open.model.Usuario;
import br.com.open.repositories.UsuarioRepository;
import br.com.open.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository repo;

	@Override
	public Usuario adicionarUsuario(Usuario usuario) {
		return repo.save(usuario);
	}

}
