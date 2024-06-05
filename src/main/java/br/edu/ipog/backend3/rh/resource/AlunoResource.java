package br.edu.ipog.backend3.rh.resource;

import br.edu.ipog.backend3.rh.contratos.AlunoRequest;
import br.edu.ipog.backend3.rh.contratos.AlunoResponse;
import br.edu.ipog.backend3.rh.interfaces.GenericOperationsv2;
import br.edu.ipog.backend3.rh.interfaces.IResource;
import br.edu.ipog.backend3.rh.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/aluno")
public class AlunoResource implements GenericOperationsv2<AlunoResponse, AlunoRequest, Integer> {

    @Autowired //injeção de dependência
    private AlunoService alunoService;

    /**
     * Mètodo para criar T
     *
     * @param request
     * @return
     */
    @Override
    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public AlunoResponse create(@RequestBody AlunoRequest request) {
        return null;
    }

    /**
     * Método para consultar T baseado no identificador N informado
     *
     * @param id
     * @return
     */
    @Override
    @GetMapping
    public AlunoResponse read(Integer id) {
        return null;
    }

    /**
     * Retorna uma lista de T
     *
     * @return
     */
    @Override
    @GetMapping
    public List<AlunoResponse> read() {
        return List.of();
    }

    /**
     * Iremos passar N(id) para buscar o registro e T(entity) para atualizar o objeto;
     *
     * @param id
     * @param request
     * @return
     */
    @Override
    @PutMapping
    public AlunoResponse update(Integer id, AlunoRequest request) {
        return null;
    }

    /**
     * Deleta um registro com base no identificador N(id)
     *
     * @param id
     */
    @Override
    @DeleteMapping
    public void delete(Integer id) {

    }

    //NÃO PODE
    //resource >> service >> repository
    //private AlunoRepository alunoRepository;

    //fazer as operações para receber da VIEW ou de alguém para passar as informações
    //para a camada de SERVIÇO.


}
