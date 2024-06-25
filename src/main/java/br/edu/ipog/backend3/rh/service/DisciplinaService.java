package br.edu.ipog.backend3.rh.service;

import br.edu.ipog.backend3.rh.contratos.DisciplinaRequest;
import br.edu.ipog.backend3.rh.contratos.DisciplinaResponse;
import br.edu.ipog.backend3.rh.interfaces.IService;
import br.edu.ipog.backend3.rh.repository.DisciplinaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class DisciplinaService implements
        IService<DisciplinaRequest, DisciplinaResponse, Integer> {

    @Autowired //injeção de dependência
    private DisciplinaRepository disciplinaRepository;

    @Override
    public DisciplinaResponse create(DisciplinaRequest request) {
        return null;
    }

    @Override
    public DisciplinaResponse read(Integer id) {
        return null;
    }

    @Override
    public List<DisciplinaResponse> read() {
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
    public DisciplinaResponse updateAll(Integer id, DisciplinaRequest request) {
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
    public DisciplinaResponse updatePart(Integer id, DisciplinaRequest request) {
        return null;
    }

    /**
     * Recebo um ID e apago o registro. Após a execução, devo devolver um T2 (response / reposta)
     *
     * @param id
     * @return
     */
    @Override
    public DisciplinaResponse delete(Integer id) {
        return null;
    }
}
