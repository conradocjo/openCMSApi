package br.com.open.api;

import static br.com.open.model.dto.UsuarioDTO.getUsuarioFromUsuarioDto;
import static java.util.Objects.nonNull;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.open.model.Setor;
import br.com.open.model.Usuario;
import br.com.open.model.dto.UsuarioDTO;
import br.com.open.model.enumerators.PerfilUsuario;
import br.com.open.services.impl.SetorServiceImpl;
import br.com.open.services.impl.UsuarioServiceImpl;
import io.swagger.annotations.ApiParam;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-08-24T23:05:39.296Z")

@Controller
public class UsuarioApiController implements UsuarioApi {

	private static final Logger log = LoggerFactory.getLogger(UsuarioApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@Autowired
	private UsuarioServiceImpl service;

	@Autowired
	private SetorServiceImpl setorService;

	@org.springframework.beans.factory.annotation.Autowired
	public UsuarioApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	public ResponseEntity<Usuario> adicionarNovoUsuario(
			@ApiParam(value = "EndPoint para gravar usuário na base de dados.", required = true) @Valid @RequestBody UsuarioDTO body) {
		try {
			@SuppressWarnings("unused")
			Setor setor = null;
			if (nonNull(body) && nonNull(body.getIdSetor())) {
				setor = setorService.recuperarSetorPorId(body.getIdSetor());
				Usuario usuarioGravado = service.adicionarUsuario(getUsuarioFromUsuarioDto(body.getNome(),
						body.getImagemDePerfil(), body.getMatricula(), body.getEmail(), body.getUsuario(),
						body.getSenha(), setorService.recuperarSetorPorId(body.getIdSetor()), body.getRamal(),
						body.getPerfil(), body.getDataNascimento()));
				return ResponseEntity.ok().body(usuarioGravado);
			} else {
				return new ResponseEntity<Usuario>(HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			return new ResponseEntity<Usuario>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	public ResponseEntity<Void> alterarSenha(@DecimalMin("1") @DecimalMax("10") @ApiParam(value = "EndPoint para alterar senha do usuário.", required = true) @PathVariable("novaSenha") String novaSenha) {
		try {
			if (nonNull(novaSenha)) {
				//TODO: Recupera rusuário logado e passar nova senha que será usada.
			}
		} catch (Exception e) {
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return null;
	}

	public ResponseEntity<Usuario> bloquearUsuario(@Min(1L) @ApiParam(value = "ID do usuário que será bloqueado.", required = true) @PathVariable("idUsuario") Long idUsuario) {
		try {
			if (nonNull(idUsuario)) {
				return new ResponseEntity<Usuario>(HttpStatus.BAD_REQUEST);
			} else {
				//TODO:
				return null;
			}
		} catch (Exception e) {
			return new ResponseEntity<Usuario>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public ResponseEntity<Void> deslogarUsuario() {
		return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<Void> editarUsuario(
			@ApiParam(value = "EndPoint para parte de edição de usuário.", required = true) @Valid @RequestBody Usuario body) {
		return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<List<Usuario>> listarPerfilDeUsuario(
			@NotNull @ApiParam(value = "Retorna perfil de usuário", required = true, allowableValues = "available, pending, sold") @Valid @RequestParam(value = "status", required = true) List<String> status) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<List<Usuario>>(objectMapper.readValue(
						"[ {  \"imagemDePerfil\" : \"imagemDePerfil\",  \"setor\" : \"setor\",  \"nome\" : \"nome\",  \"gestor\" : false,  \"perfil\" : \"administrador\",  \"senha\" : \"senha\",  \"matricula\" : \"matricula\",  \"usuario\" : \"usuario\",  \"id\" : 0,  \"dataNascimento\" : \"2000-01-23T04:56:07.000+00:00\",  \"ramal\" : \"ramal\",  \"dataCriacao\" : \"2000-01-23T04:56:07.000+00:00\",  \"email\" : \"email\",  \"status\" : \"ativo\"}, {  \"imagemDePerfil\" : \"imagemDePerfil\",  \"setor\" : \"setor\",  \"nome\" : \"nome\",  \"gestor\" : false,  \"perfil\" : \"administrador\",  \"senha\" : \"senha\",  \"matricula\" : \"matricula\",  \"usuario\" : \"usuario\",  \"id\" : 0,  \"dataNascimento\" : \"2000-01-23T04:56:07.000+00:00\",  \"ramal\" : \"ramal\",  \"dataCriacao\" : \"2000-01-23T04:56:07.000+00:00\",  \"email\" : \"email\",  \"status\" : \"ativo\"} ]",
						List.class), HttpStatus.NOT_IMPLEMENTED);
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<List<Usuario>>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<List<Usuario>>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<String> realizarLogin(
			@NotNull @ApiParam(value = "Usuário que irá realizar operações.", required = true) @Valid @RequestParam(value = "usuario", required = true) String usuario,
			@NotNull @ApiParam(value = "Senha do usuário que irá realizar operações.", required = true) @Valid @RequestParam(value = "senha", required = true) String senha) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<String>(objectMapper.readValue("\"\"", String.class),
						HttpStatus.NOT_IMPLEMENTED);
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
	}

	@Override
	public ResponseEntity<List<PerfilUsuario>> listarPerfis() {
		List<PerfilUsuario> perfis = Arrays.asList(PerfilUsuario.values());
		return ResponseEntity.ok().body(perfis);
	}

}
