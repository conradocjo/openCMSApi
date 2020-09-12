package br.com.open.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.open.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	@Query(nativeQuery = false, value = "select u from Usuario u inner join fetch u.setor setor")
	public List<Usuario> buscarTodosUsuarios();
	
}
