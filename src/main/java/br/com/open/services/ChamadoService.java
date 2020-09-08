package br.com.open.services;

import br.com.open.model.Chamado;
import br.com.open.model.dto.ChamadoDTO;

public interface ChamadoService {

	Chamado abrirChamado(ChamadoDTO chamado);

}
