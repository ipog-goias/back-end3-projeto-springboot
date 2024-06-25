package br.edu.ipog.backend3.rh.resource;

import br.edu.ipog.backend3.rh.contratos.DisciplinaRequest;
import br.edu.ipog.backend3.rh.contratos.DisciplinaResponse;
import br.edu.ipog.backend3.rh.interfaces.GenericOperationsv3;
import br.edu.ipog.backend3.rh.interfaces.GenericOperationsv4;
import br.edu.ipog.backend3.rh.model.Disciplina;
import br.edu.ipog.backend3.rh.service.DisciplinaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * C.R.U.D
 * Create - POST
 * Read - GET
 * Update - PUT (atualiza tudo), PATCH (atualiza parte)
 * Delete - DELETE
 *
 */
@RestController
@RequestMapping(path = "/api/v1/disciplina")
public class DisciplinaResource implements GenericOperationsv4<DisciplinaRequest, DisciplinaResponse, Integer> {

    @Autowired //injeção de dependência
    private DisciplinaService disciplinaService;


    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public ResponseEntity<DisciplinaResponse> create(@Valid @RequestBody DisciplinaRequest request) {
        return null;
    }

    @GetMapping(
            value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public ResponseEntity<DisciplinaResponse> read(@PathVariable("id") Integer id) {
        return null;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @Override
    public ResponseEntity<List<DisciplinaResponse>> read() {
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
    public ResponseEntity<DisciplinaResponse> updateAll(@PathVariable("id") Integer id,
                                                        @Valid @RequestBody DisciplinaRequest request) {
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
    public ResponseEntity<DisciplinaResponse> updatePart(@PathVariable("id") Integer id,
                                                         @Valid @RequestBody DisciplinaRequest request) {
        return null;
    }

    /**
     * Recebo um ID e apago o registro. Após a execução, devo devolver um T2 (response / reposta)
     *
     * @param id
     * @return
     */
    @DeleteMapping(
            value = "/{id}"
    )
    @Override
    public ResponseEntity<DisciplinaResponse> delete(@PathVariable("id") Integer id) {
        return null;
    }
}
