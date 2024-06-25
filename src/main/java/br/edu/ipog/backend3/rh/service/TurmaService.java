package br.edu.ipog.backend3.rh.service;

import br.edu.ipog.backend3.rh.contratos.TurmaRequest;
import br.edu.ipog.backend3.rh.contratos.TurmaResponse;
import br.edu.ipog.backend3.rh.interfaces.IService;
import br.edu.ipog.backend3.rh.model.Turma;
import br.edu.ipog.backend3.rh.repository.TurmaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class TurmaService implements IService<TurmaRequest, TurmaResponse, Integer> {

    @Autowired //injeção de dependência
    private TurmaRepository turmaRepository;

    @Override
    public TurmaResponse create(TurmaRequest request) {
        return null;
    }

    @Override
    public TurmaResponse read(Integer id) {
        return null;
    }

    @Override
    public List<TurmaResponse> read() {
        return List.of();
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
    @Override
    public TurmaResponse updateAll(Integer id, TurmaRequest request) {
        return null;
    }

    /**
     * Este método é para ser utilizado na chamada do verbo PATCH
     *
     * @param id
     * @param request
     * @return
     */
    @Override
    public TurmaResponse updatePart(Integer id, TurmaRequest request) {
        return null;
    }

    /**
     * Recebo um ID e apago o registro. Após a execução, devo devolver um T2 (response / reposta)
     *
     * @param id
     * @return
     */
    @Override
    public TurmaResponse delete(Integer id) {
        return null;
    }
}
