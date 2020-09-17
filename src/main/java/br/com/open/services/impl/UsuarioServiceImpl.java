package br.com.open.services.impl;

import static java.util.Objects.nonNull;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.open.dao.GenericDao;
import br.com.open.model.Usuario;
import br.com.open.model.enumerators.StatusAtivoInativo;
import br.com.open.repositories.UsuarioRepository;
import br.com.open.services.UsuarioService;

@Service
public class UsuarioServiceImpl extends GenericDao<Usuario> implements UsuarioService {

	@Autowired
	private UsuarioRepository repo;

	@Override
	public Usuario salvar(Usuario usuario) {
		return repo.save(usuario);
	}

	@Override
	public Usuario bloquearDesbloquearUsuario(Long id) {
		Usuario usuario = repo.recuperarUsuarioPorId(id);
		if (nonNull(usuario)) {
			if (usuario.getStatus().equals(StatusAtivoInativo.ATIVO)) {
				usuario.setStatus(StatusAtivoInativo.INATIVO);
			} else {
				usuario.setStatus(StatusAtivoInativo.ATIVO);
			}
		}
		return repo.save(usuario);
	}

	@Override
	public Usuario recuperarUsuarioPorId(Long id) {
		return repo.findById(id).get();
	}
	
	@Override
	public List<Usuario> retornaTodosUsuarios() {
		return repo.buscarTodosUsuarios();
	}
	
	@Override
	public void deletarUsuario(Usuario usuario) {
		this.repo.delete(usuario);
	}

}
