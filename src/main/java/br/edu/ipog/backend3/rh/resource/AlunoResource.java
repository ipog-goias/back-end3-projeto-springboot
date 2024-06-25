package br.edu.ipog.backend3.rh.resource;

import br.edu.ipog.backend3.rh.contratos.AlunoRequest;
import br.edu.ipog.backend3.rh.contratos.AlunoResponse;
import br.edu.ipog.backend3.rh.interfaces.GenericOperationsv4;
import br.edu.ipog.backend3.rh.service.AlunoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/aluno")
public class AlunoResource implements GenericOperationsv4<AlunoRequest, AlunoResponse, Integer> {

    @Autowired //injeção de dependência
    private AlunoService alunoService;

    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public ResponseEntity<AlunoResponse> create(@Valid @RequestBody AlunoRequest request) {
        return null;
    }

    @GetMapping(
            value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public ResponseEntity<AlunoResponse> read(@PathVariable("id") Integer id) {
        return null;
    }

    @GetMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public ResponseEntity<List<AlunoResponse>> read() {
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
                                                    @Valid @RequestBody AlunoRequest request) {
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
    public ResponseEntity<AlunoResponse> delete(@PathVariable("id") Integer id) {
        return null;
    }
}
