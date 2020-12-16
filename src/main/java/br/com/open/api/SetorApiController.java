package br.com.open.api;

import static java.util.Objects.nonNull;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
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

	public ResponseEntity<Setor> cadastrarSetor(@ApiParam(value = "Realiza cadastro de setor.", required = true) @PathVariable String setor) {
		try {
			if (nonNull(setor)) {
				return ResponseEntity.ok(service.salvar(new Setor(setor)));
			} else {
				return new ResponseEntity<Setor>(HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			return new ResponseEntity<Setor>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public ResponseEntity<Void> deletarSetor(@Min(1L) @ApiParam(value = "ID do setor à ser deletado", required = true) @PathVariable("idSetor") Long idSetor) {
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
	public ResponseEntity<Setor> ativarOuDesativarSetor(@Min(1L) @ApiParam(value = "ID do setor à ser deletado", required = true) @PathVariable("idSetor") Long idSetor) {
		try {
			if (nonNull(idSetor)) {
				return ResponseEntity.ok(service.ativarDesativarSetor(idSetor));
			} else {
				return new ResponseEntity<Setor>(HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			return new ResponseEntity<Setor>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<Setor> editarSetor(String nomeSetor, Long idSetor) {
		try {
			if (nonNull(nomeSetor) && nonNull(idSetor)) {
				return ResponseEntity.ok(service.editarSetor(nomeSetor,idSetor));
			} else {
				return new ResponseEntity<Setor>(HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			return new ResponseEntity<Setor>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public ResponseEntity<List<Setor>> listarSetores() {
		try {
			return ResponseEntity.ok(service.listarTodosSetores());
		} catch (Exception e) {
			return new ResponseEntity<List<Setor>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<String> teste() {
		System.out.println("Teste com debug.");
		return ResponseEntity.ok().body("Resposta 200 ok !");
	}

}
