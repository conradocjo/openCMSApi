package br.com.open.api;

import static java.util.Objects.nonNull;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.open.model.TipoChamado;
import br.com.open.services.impl.TipoChamadoServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-08-24T23:05:39.296Z")

@Controller
public class TipoChamadoApiController implements TipoChamadoApi {

	private static final Logger log = LoggerFactory.getLogger(TipoChamadoApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@Autowired
	private TipoChamadoServiceImpl service;

	@org.springframework.beans.factory.annotation.Autowired
	public TipoChamadoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	@Override
	public ResponseEntity<TipoChamado> cadastrarTipoChamado(@Valid TipoChamado body) {
		try {
			if (nonNull(body)) {
				return ResponseEntity.ok().body(service.salvar(body));
			} else {
				return new ResponseEntity<TipoChamado>(HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			return new ResponseEntity<TipoChamado>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<List<TipoChamado>> listarTodosTiposChamado() {
		try {
			return ResponseEntity.ok(service.listarTodosTiposChamado());
		} catch (Exception e) {
			return new ResponseEntity<List<TipoChamado>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<Void> deletarTipoChamado(Long id) {
		try {
			service.deletarSetorPorId(id);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<TipoChamado> editarTipoChamado(TipoChamado tipoChamado) {
		try {
			if (nonNull(tipoChamado) && nonNull(tipoChamado.getId())) {
				return ResponseEntity.ok(service.salvar(tipoChamado));
			} else {
				return new ResponseEntity<TipoChamado>(HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			return new ResponseEntity<TipoChamado>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<TipoChamado> ativarInativarTipoChamado(Long id) {
		try {
			return ResponseEntity.ok(service.ativarDesativarTipoChamado(id));
		} catch (Exception e) {
			return new ResponseEntity<TipoChamado>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
