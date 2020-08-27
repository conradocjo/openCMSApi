package br.com.open.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.open.model.Setor;

@Repository
public interface SetorRepository extends JpaRepository<Setor, Long> {

}
