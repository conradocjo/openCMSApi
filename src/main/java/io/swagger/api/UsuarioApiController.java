package io.swagger.api;

import io.swagger.model.Usuario;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-08-24T23:05:39.296Z")

@Controller
public class UsuarioApiController implements UsuarioApi {

    private static final Logger log = LoggerFactory.getLogger(UsuarioApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UsuarioApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> adicionarNovoUsuario(@ApiParam(value = "EndPoint para gravar usuário na base de dados." ,required=true )  @Valid @RequestBody Usuario body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> alterarSenha(@DecimalMin("1") @DecimalMax("10") @ApiParam(value = "EndPoint para alterar senha do usuário.",required=true) @PathVariable("novaSenha") String novaSenha) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> bloquearUsuario(@Min(1L)@ApiParam(value = "ID do usuário que será bloqueado.",required=true) @PathVariable("idUsuario") Long idUsuario) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deslogarUsuario() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> editarUsuario(@ApiParam(value = "EndPoint para parte de edição de usuário." ,required=true )  @Valid @RequestBody Usuario body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Usuario>> listarPerfilDeUsuario(@NotNull @ApiParam(value = "Retorna perfil de usuário", required = true, allowableValues = "available, pending, sold") @Valid @RequestParam(value = "status", required = true) List<String> status) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Usuario>>(objectMapper.readValue("[ {  \"imagemDePerfil\" : \"imagemDePerfil\",  \"setor\" : \"setor\",  \"nome\" : \"nome\",  \"gestor\" : false,  \"perfil\" : \"administrador\",  \"senha\" : \"senha\",  \"matricula\" : \"matricula\",  \"usuario\" : \"usuario\",  \"id\" : 0,  \"dataNascimento\" : \"2000-01-23T04:56:07.000+00:00\",  \"ramal\" : \"ramal\",  \"dataCriacao\" : \"2000-01-23T04:56:07.000+00:00\",  \"email\" : \"email\",  \"status\" : \"ativo\"}, {  \"imagemDePerfil\" : \"imagemDePerfil\",  \"setor\" : \"setor\",  \"nome\" : \"nome\",  \"gestor\" : false,  \"perfil\" : \"administrador\",  \"senha\" : \"senha\",  \"matricula\" : \"matricula\",  \"usuario\" : \"usuario\",  \"id\" : 0,  \"dataNascimento\" : \"2000-01-23T04:56:07.000+00:00\",  \"ramal\" : \"ramal\",  \"dataCriacao\" : \"2000-01-23T04:56:07.000+00:00\",  \"email\" : \"email\",  \"status\" : \"ativo\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Usuario>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Usuario>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> realizarLogin(@NotNull @ApiParam(value = "Usuário que irá realizar operações.", required = true) @Valid @RequestParam(value = "usuario", required = true) String usuario,@NotNull @ApiParam(value = "Senha do usuário que irá realizar operações.", required = true) @Valid @RequestParam(value = "senha", required = true) String senha) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<String>(objectMapper.readValue("\"\"", String.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

}
