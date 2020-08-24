package io.swagger.api;

import io.swagger.model.Chamado;
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
public class ChamadoApiController implements ChamadoApi {

    private static final Logger log = LoggerFactory.getLogger(ChamadoApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ChamadoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> inserirTramite(@DecimalMin("1") @DecimalMax("10") @ApiParam(value = "EndPoint para alterar senha do usuário.",required=true) @PathVariable("tramite") String tramite) {
        String accept = request.getHeader("Accept");
        System.out.println("Cheguei aqui.");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> listarTodosChamadosPorSetor(@DecimalMin("1") @DecimalMax("10") @ApiParam(value = "EndPoint para alterar senha do usuário.",required=true) @PathVariable("setor") String setor) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> listarTodosChamadosPorUsuario(@DecimalMin("1") @DecimalMax("10") @ApiParam(value = "EndPoint para alterar senha do usuário.",required=true) @PathVariable("usuario") String usuario) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> registrarNovoChamado(@ApiParam(value = "EndPoint responsável por registrar novo chamado." ,required=true )  @Valid @RequestBody Chamado body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
