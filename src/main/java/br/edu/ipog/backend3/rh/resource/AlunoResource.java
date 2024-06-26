package br.edu.ipog.backend3.rh.resource;

import br.edu.ipog.backend3.rh.contratos.AlunoRequest;
import br.edu.ipog.backend3.rh.contratos.AlunoResponse;
import br.edu.ipog.backend3.rh.interfaces.GenericOperationsv4;
import br.edu.ipog.backend3.rh.mappers.AlunoMapper;
import br.edu.ipog.backend3.rh.model.Aluno;
import br.edu.ipog.backend3.rh.service.AlunoService;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/aluno")
public class AlunoResource implements GenericOperationsv4<AlunoRequest, AlunoResponse, Integer> {

    @Autowired //injeção de dependência
    private AlunoService alunoService;

    @Autowired
    private HttpServletRequest httpServletRequest;
    @Autowired
    private AlunoMapper alunoMapper;

    /**
     * @see https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/http/ResponseEntity.html
     * @param request
     * @return
     */
    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public ResponseEntity<AlunoResponse> create(@Valid @RequestBody AlunoRequest request) {
        URI location = UriComponentsBuilder.fromUriString(httpServletRequest.getRequestURL().toString()).build().toUri();

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(location);
        headers.setLastModified(LocalDateTime.now().atZone(ZoneId.of("-4")));

        AlunoResponse response = alunoService.create(request);

        return new ResponseEntity<>(response, headers, HttpStatus.CREATED);

    }

    @GetMapping(
            value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public ResponseEntity<AlunoResponse> read(@PathVariable("id") Integer id) throws Exception {

        AlunoResponse response = alunoService.read(id);

        return ResponseEntity.ok().body(response);
    }

    @GetMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public ResponseEntity<List<AlunoResponse>> read() {

        List<AlunoResponse> lista = alunoService.read();

        return ResponseEntity.ok().body(lista);
    }

    /**
     * PUT(1,request);
     * Geralmente nas requisições PUT OU PATH, você sempre vai receber um ID, e um body (corpo/json)
     * com os dados para serem atualizados.
     *
     * @param id
     * @param request
     * @return
     */
    @PutMapping(
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public ResponseEntity<AlunoResponse> updateAll(@PathVariable("id") Integer id,
                                                   @Valid @RequestBody AlunoRequest request) {
        return null;
    }

    /**
     * Este método é para ser utilizado na chamada do verbo PATCH
     *
     * @param id
     * @param request
     * @return
     */
    @PatchMapping(
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public ResponseEntity<AlunoResponse> updatePart(@PathVariable("id") Integer id,
                                                    @Valid @RequestBody AlunoRequest request) throws Exception {

        AlunoResponse response = alunoService.updateAll(id, request);

        return ResponseEntity.ok().body(response);
    }

    /**
     * Recebo um ID e apago o registro. Após a execução, devo devolver um T2 (response / reposta)
     *
     * @param id
     * @return
     */

    @DeleteMapping(
            value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public ResponseEntity<AlunoResponse> delete(@PathVariable("id") Integer id) throws Exception {

        AlunoResponse response = alunoService.delete(id);

        return ResponseEntity.ok().body(response);
    }
}
