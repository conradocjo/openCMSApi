package io.swagger.api;

import io.swagger.model.Setor;
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
public class SetorApiController implements SetorApi {

    private static final Logger log = LoggerFactory.getLogger(SetorApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SetorApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> cadastrarSetor(@ApiParam(value = "Realiza cadastro de setor." ,required=true )  @Valid @RequestBody Setor body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deletarSetor(@Min(1L)@ApiParam(value = "ID do setor à ser deletado",required=true) @PathVariable("idSetor") Long idSetor) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deletarTipoChamadoNaoAssociado(@Min(1L)@ApiParam(value = "ID do tipoChamado à ser deletado",required=true) @PathVariable("idTipoChamado") Long idTipoChamado) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Setor>> listarSetores() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Setor>>(objectMapper.readValue("[ {  \"nome\" : \"nome\",  \"id\" : 0,  \"dataCriacao\" : \"2000-01-23T04:56:07.000+00:00\",  \"status\" : \"ativo\"}, {  \"nome\" : \"nome\",  \"id\" : 0,  \"dataCriacao\" : \"2000-01-23T04:56:07.000+00:00\",  \"status\" : \"ativo\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Setor>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Setor>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
