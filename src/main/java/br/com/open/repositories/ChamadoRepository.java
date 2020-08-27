package br.com.open.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.open.model.Chamado;

@Repository
public interface ChamadoRepository extends JpaRepository<Chamado, Long> {

}
