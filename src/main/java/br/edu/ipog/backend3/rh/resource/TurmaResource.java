package br.edu.ipog.backend3.rh.resource;

import br.edu.ipog.backend3.rh.contratos.ProfessorResponse;
import br.edu.ipog.backend3.rh.contratos.TurmaRequest;
import br.edu.ipog.backend3.rh.contratos.TurmaResponse;
import br.edu.ipog.backend3.rh.interfaces.GenericOperationsv4;
import br.edu.ipog.backend3.rh.service.TurmaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
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

@RestController
@RequestMapping(path = "/api/v1/turma")
@Tag(name = "turma", description = "Documentação relacionada ao resource turma")
public class TurmaResource
        implements GenericOperationsv4<TurmaRequest, TurmaResponse, Integer> {

    @Autowired //injeção de dependência
    private TurmaService turmaService;

    //POST
    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Operation(
            summary = "Cria uma turma",
            description = "Método responsável para criar uma turma no sistema",
            tags = {"turma"}
    )
    /*
    * 201 (Created) SHOULD
200 (OK) or 204 (No Content)
303 (See Other) - redirecionamento
    * */
    @ApiResponses({
            @ApiResponse(responseCode = "201",
                    description = "Método responsável para criar uma turma no sistema",
                    content = { @Content(schema = @Schema(implementation = TurmaResource.class),
                                                    mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "304", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) }
    )
    @Override
    public ResponseEntity<TurmaResponse> create(@Valid @RequestBody TurmaRequest request) {
        return null;
    }

    //GET http://localhost:8080/turma/1
    @GetMapping(
            value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Operation(
            summary = "Consulta uma turma baseado no identificador de acesso.",
            description = "Método responsável para consultar uma turma no sistema",
            tags = {"turma"}
    )
    @Override
    public ResponseEntity<TurmaResponse> read(@PathVariable("id") Integer id) {
        return null;
    }

    //GET http://localhost:8080/turma
    @GetMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Operation(
            summary = "Lista todas as turmas",
            description = "Método responsável para listar as turmas no sistema",
            tags = {"turma"}
    )
    @Override
    public ResponseEntity<List<TurmaResponse>> read() {
        return null;
    }

    //PUT(1,body)
    //PUT - http://localhost:8080/api/v1/turma/1
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
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Operation(
            summary = "Atualiza todo o objeto turma",
            description = "Método responsável para atualizar uma turma no sistema",
            tags = {"turma"}
    )
    @Override
    public ResponseEntity<TurmaResponse> updateAll(@PathVariable("id") Integer id,
                                                   @Valid @RequestBody TurmaRequest request) {
        return null;
    }

    //PATCH(1,body)
    /**
     * Este método é para ser utilizado na chamada do verbo PATCH
     *
     * @param id
     * @param request
     * @return
     */
    @PatchMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Operation(
            summary = "Atualiza parte de um objeto de turma",
            description = "Método responsável para atualizar parte de objeto turma no sistema",
            tags = {"turma"}
    )
    @Override
    public ResponseEntity<TurmaResponse> updatePart(@PathVariable("id") Integer id,
                                                    @Valid @RequestBody TurmaRequest request) {
        return null;
    }

    //DELETE(1)
    // DELETE http:///localhost:8080/v1/turma/1
    /**
     * Recebo um ID e apago o registro. Após a execução, devo devolver um T2 (response / reposta)
     *
     * @param id
     * @return
     */
    @DeleteMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Operation(
            summary = "Deleta uma turma",
            description = "Método responsável para deletar uma turma no sistema",
            tags = {"turma"}
    )
    @Override
    public ResponseEntity<TurmaResponse> delete(@PathVariable("id") Integer id) {
        return null;
    }
}
