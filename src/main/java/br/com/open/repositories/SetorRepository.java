package br.com.open.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.open.model.Setor;

@Repository
public interface SetorRepository extends JpaRepository<Setor, Long> {

	@Query(nativeQuery = false, value = "select setor from Setor setor where setor.id = :id")
	public Setor retornaUsuarioPorId(@Param("id") Long id);

}
