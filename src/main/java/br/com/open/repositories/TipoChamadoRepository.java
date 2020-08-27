package br.com.open.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.open.model.TipoChamado;

@Repository
public interface TipoChamadoRepository extends JpaRepository<TipoChamado, Long> {

}
