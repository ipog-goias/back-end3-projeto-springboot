package br.edu.ipog.backend3.rh.service;

import br.edu.ipog.backend3.rh.contratos.ProfessorRequest;
import br.edu.ipog.backend3.rh.contratos.ProfessorResponse;
import br.edu.ipog.backend3.rh.interfaces.IService;
import br.edu.ipog.backend3.rh.repository.ProfessorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ProfessorService implements
        IService<ProfessorRequest, ProfessorResponse, Integer> {

    @Autowired //injeção de dependência
    private ProfessorRepository professorRepository;

    @Override
    public ProfessorResponse create(ProfessorRequest request) {
        return null;
    }

    @Override
    public ProfessorResponse read(Integer id) {
        return null;
    }

    @Override
    public List<ProfessorResponse> read() {
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
    public ProfessorResponse updateAll(Integer id, ProfessorRequest request) {
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
    public ProfessorResponse updatePart(Integer id, ProfessorRequest request) {
        return null;
    }

    /**
     * Recebo um ID e apago o registro. Após a execução, devo devolver um T2 (response / reposta)
     *
     * @param id
     * @return
     */
    @Override
    public ProfessorResponse delete(Integer id) {
        return null;
    }
}
