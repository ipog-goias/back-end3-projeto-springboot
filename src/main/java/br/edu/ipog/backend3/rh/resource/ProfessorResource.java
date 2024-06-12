package br.edu.ipog.backend3.rh.resource;

import br.edu.ipog.backend3.rh.contratos.ProfessorRequest;
import br.edu.ipog.backend3.rh.contratos.ProfessorResponse;
import br.edu.ipog.backend3.rh.interfaces.GenericOperationsv4;
import br.edu.ipog.backend3.rh.model.Aluno;
import br.edu.ipog.backend3.rh.service.ProfessorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Passo 1 - Identificar as ações do método e mapear conforme a OPERAÇÃO/VERBO http.
 *
 * create - @PostMapping
 * read - @GetMapping
 * updateAll - @PutMapping
 * updatePart - @PatchMapping
 * delete - @deleteMapping
 *
 * Passo 2 - Indentificar os parâmetros de entrada e anotá-los conforme necessário
 * create - @PostMapping
 * read - @GetMapping
 * updateAll - @PutMapping
 * updatePart - @PatchMapping
 * delete - @deleteMapping
 *
 * Quando estamos RECEBENDO(T1) um objeto no parâmetro do método estamos 'CONSUMINDO' um serviço.
 * Quando estavamos DEVOLVENDO(T2) um objeto, estamos PRODUZINDO informações;
 *
 *
 */
@Slf4j //nos ajuda a escrever logs
@RestController //indica que é uma camada para api
@RequestMapping(path = "/api/v1/professor")
@Tag(name = "professor", description = "Documentação relacionada a resource(recurso) professor")
public class ProfessorResource implements
        GenericOperationsv4<ProfessorRequest, ProfessorResponse, Integer> {

    @Autowired //injeção de dependência
    private ProfessorService professorService;

    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    //Neste ponto estamos documentando a operação, ou seja, o métodos POST(HTTP)
    @Operation(
            summary = "Cria um professor",
            description = "Método responsável para criar um professor nos sitema",
            tags = {"professor"}
    )

    //https://ead.ipog.edu.br/moodle/mod/page/view.php?id=1464776
    //Neste ponto iremos documentar a response do método POST
    @ApiResponses({
            @ApiResponse(responseCode = "201",
                    content = { @Content(schema = @Schema(implementation = ProfessorResponse.class),
                            mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "304", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })

    @Override
    public ResponseEntity<ProfessorResponse> create(@RequestBody ProfessorRequest request) {
        return null;
    }

    //GET http://localhost:8080/api/v1/professor/1
    //GET http://localhost:8080/api/v1/professor/{id}
    @GetMapping(
            value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public ResponseEntity<ProfessorResponse> read(@PathVariable("id") Integer id) {
        return null;
    }

    //GET http://localhost:8080/api/v1/professor
    @GetMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public ResponseEntity<List<ProfessorResponse>> read() {
        return null;
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
    // PUT - http://localhost:8080/api/v1/professor/1
    //        obj (json) como body (corpo da requisição)
    @PutMapping(
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public ResponseEntity<ProfessorResponse> updateAll(@PathVariable("id") Integer id,
                                                       @RequestBody ProfessorRequest request) {
        return null;
    }

    /**
     * Este método é para ser utilizado na chamada do verbo PATCH
     *
     * @param id
     * @param request
     * @return
     */
    // PATCH - http://localhost:8080/api/v1/professor/1
    //        obj (json) como body (corpo da requisição)
    @PatchMapping(
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public ResponseEntity<ProfessorResponse> updatePart(@PathVariable("id") Integer id,
                                                        @RequestBody ProfessorRequest request) {
        return null;
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
    public ResponseEntity<ProfessorResponse> delete(@PathVariable("id") Integer id) {
        return null;
    }
}
