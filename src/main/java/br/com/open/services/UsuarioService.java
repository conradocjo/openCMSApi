package br.com.open.services;

import java.util.List;

import br.com.open.model.Usuario;

public interface UsuarioService {

	Usuario salvar(Usuario usuario);

	Usuario recuperarUsuarioPorId(Long id);

	Usuario bloquearDesbloquearUsuario(Long id);

	List<Usuario> retornaTodosUsuarios();

	void deletarUsuario(Usuario usuario);

}
