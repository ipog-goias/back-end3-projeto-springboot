package br.edu.ipog.backend3.rh.service;

import br.edu.ipog.backend3.rh.contratos.AlunoRequest;
import br.edu.ipog.backend3.rh.contratos.AlunoResponse;
import br.edu.ipog.backend3.rh.interfaces.IService;
import br.edu.ipog.backend3.rh.mappers.AlunoMapper;
import br.edu.ipog.backend3.rh.model.Aluno;
import br.edu.ipog.backend3.rh.repository.AlunoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class AlunoService implements IService<AlunoRequest, AlunoResponse, Integer> {

    @Autowired
    private AlunoMapper alunoMapper;

    @Autowired //injeção de dependência
    private AlunoRepository alunoRepository;

    @Override
    public AlunoResponse create(AlunoRequest request) {
        log.info("Iniciado: AlunoService.create");

        //converter request para model
        Aluno aluno = new Aluno();
        aluno.setNome(request.getNome());
        aluno.setMatricula(request.getMatricula());
        aluno.setNota(request.getNota());
        aluno.setNotaFormal(request.getNotaFormal());

        Aluno alunoGravado = alunoRepository.save(aluno);

        //converter model para response
        AlunoResponse alunoResponse = new AlunoResponse();
        alunoResponse.setNome(alunoGravado.getNome());
        alunoResponse.setMatricula(alunoGravado.getMatricula());
        alunoResponse.setNota(alunoGravado.getNota());
        alunoResponse.setNotaFormal(alunoGravado.getNotaFormal());

        return alunoResponse;
    }

    @Override
    public AlunoResponse read(Integer id) {
        return null;
    }

    @Override
    public List<AlunoResponse> read() {
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
    public AlunoResponse updateAll(Integer id, AlunoRequest request) {
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
    public AlunoResponse updatePart(Integer id, AlunoRequest request) {
        return null;
    }

    /**
     * Recebo um ID e apago o registro. Após a execução, devo devolver um T2 (response / reposta)
     *
     * @param id
     * @return
     */
    @Override
    public AlunoResponse delete(Integer id) {
        return null;
    }
}
