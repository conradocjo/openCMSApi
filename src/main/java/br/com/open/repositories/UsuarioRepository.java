package br.com.open.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.open.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	@Query(nativeQuery = false, value = "select u from Usuario u inner join fetch u.setor setor order by u.nome")
	public List<Usuario> buscarTodosUsuarios();

	@Query(nativeQuery = false, value = "select u from Usuario u  inner join fetch u.setor setor where u.id = :id")
	public Usuario recuperarUsuarioPorId(@Param("id") Long id);

	@Query(nativeQuery = false, value = "select usuario from Usuario usuario\n" + "inner join fetch Setor setor\n"
			+ "where matricula = :matricula\n" + "and usuario = :usuario\n" + "and nome = :nome")
	public Usuario recuperarUsuarioPorMatriculaUsuarioNome(@Param("matricula") String matricula,
			@Param("usuario") String usuario, @Param("nome") String nome);

}
