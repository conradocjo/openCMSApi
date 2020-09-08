package br.com.open.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.open.model.Chamado;
import br.com.open.model.Tramite;
import br.com.open.model.dto.ChamadoDTO;
import br.com.open.repositories.ChamadoRepository;
import br.com.open.repositories.UsuarioRepository;
import br.com.open.services.ChamadoService;

@Service
public class ChamadoServiceImpl implements ChamadoService {

	@Autowired
	private ChamadoRepository repo;

	private UsuarioRepository usuarioRepository;

	@Override
	public Chamado abrirChamado(ChamadoDTO chamado) {
//		Usuario responsavel = usuarioRepository.findById(chamado.getIdUsuarioResponsavel()).get();
//		Usuario solicitante = usuarioRepository.findById(chamado.getIdUsuarioSolicitante()).get();
		Tramite tramite = new Tramite(chamado.getTramite());

		Chamado novoChamado = new Chamado(chamado.getTitulo(), null, null);

		tramite.setChamado(novoChamado);

		return this.repo.save(novoChamado);
	}
}
