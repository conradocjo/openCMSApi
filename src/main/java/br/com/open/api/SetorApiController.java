package br.com.open.api;

import static java.util.Objects.nonNull;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.open.model.Setor;
import br.com.open.services.impl.SetorServiceImpl;
import io.swagger.annotations.ApiParam;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-08-24T23:05:39.296Z")

@Controller
public class SetorApiController implements SetorApi {

	private static final Logger log = LoggerFactory.getLogger(SetorApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@Autowired
	private SetorServiceImpl service;

	@org.springframework.beans.factory.annotation.Autowired
	public SetorApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	public ResponseEntity<Setor> cadastrarSetor(
			@ApiParam(value = "Realiza cadastro de setor.", required = true) @PathVariable String setor) {
		try {
			if (nonNull(setor)) {
				return ResponseEntity.ok(service.cadastrarSetor(new Setor(setor)));
			} else {
				return new ResponseEntity<Setor>(HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			return new ResponseEntity<Setor>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public ResponseEntity<Void> deletarSetor(
			@Min(1L) @ApiParam(value = "ID do setor à ser deletado", required = true) @PathVariable("idSetor") Long idSetor) {
		try {
			if (nonNull(idSetor)) {
				service.deletaSetorPorId(idSetor);
				return ResponseEntity.ok().build();
			} else {
				return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<Setor> editarSetor(@Valid Setor body) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseEntity<List<Setor>> listarSetores() {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<List<Setor>>(objectMapper.readValue(
						"[ {  \"nome\" : \"nome\",  \"id\" : 0,  \"dataCriacao\" : \"2000-01-23T04:56:07.000+00:00\",  \"status\" : \"ativo\"}, {  \"nome\" : \"nome\",  \"id\" : 0,  \"dataCriacao\" : \"2000-01-23T04:56:07.000+00:00\",  \"status\" : \"ativo\"} ]",
						List.class), HttpStatus.NOT_IMPLEMENTED);
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<List<Setor>>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<List<Setor>>(HttpStatus.NOT_IMPLEMENTED);
	}

	@Override
	public ResponseEntity<Setor> ativarOuDesativarSetor(@Min(1) Long id) {
		try {
			if (nonNull(id)) {
				return ResponseEntity.ok(service.ativarDesativarSetor(id));
			} else {
				return new ResponseEntity<Setor>(HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			return new ResponseEntity<Setor>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
