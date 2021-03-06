package br.com.open.api;

import static java.util.Objects.nonNull;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.open.model.Chamado;
import br.com.open.model.dto.ChamadoDTO;
import br.com.open.services.ChamadoService;
import io.swagger.annotations.ApiParam;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-08-24T23:05:39.296Z")

@Controller
public class ChamadoApiController implements ChamadoApi {

	private static final Logger log = LoggerFactory.getLogger(ChamadoApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;
	
	@Autowired
	private ChamadoService service;

	@org.springframework.beans.factory.annotation.Autowired
	public ChamadoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	public ResponseEntity<Void> inserirTramite(@DecimalMin("1") @DecimalMax("10") @ApiParam(value = "EndPoint para alterar senha do usuário.", required = true) @PathVariable("tramite") String tramite) {
		System.out.println("Cheguei aqui.");
		return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<Void> listarTodosChamadosPorSetor(@DecimalMin("1") @DecimalMax("10") @ApiParam(value = "EndPoint para alterar senha do usuário.", required = true) @PathVariable("setor") String setor) {
		return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<Void> listarTodosChamadosPorUsuario(@DecimalMin("1") @DecimalMax("10") @ApiParam(value = "EndPoint para alterar senha do usuário.", required = true) @PathVariable("usuario") String usuario) {
		return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
	}

	
	public ResponseEntity<Chamado> registrarNovoChamado(@ApiParam(value = "EndPoint responsável por registrar novo chamado.", required = true) @Valid @RequestBody ChamadoDTO body) {
		Chamado chamadoGerado = null;
		try {
			if (nonNull(body)) {
				chamadoGerado = this.service.abrirChamado(body);
				return ResponseEntity.ok(chamadoGerado);
			} else {
				return new ResponseEntity<Chamado>(HttpStatus.METHOD_NOT_ALLOWED);
			}
		} catch (Exception e) {
			return new ResponseEntity<Chamado>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}


}
