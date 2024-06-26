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

        Aluno aluno = alunoMapper.toEntity(request); //converte request para model
        Aluno alunoGravado = alunoRepository.save(aluno); //grava no banco e devolve model
        AlunoResponse alunoResponse = alunoMapper.toResponse(alunoGravado); //devolve para a camada resource um response;

        log.info("Fim: AlunoService.create");
        log.debug("AlunoService.create: {}", alunoResponse);

        return alunoResponse;

        //converter request para model
        /*Aluno aluno = new Aluno();
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

        return alunoResponse;*/
    }

    @Override
    public AlunoResponse read(Integer id) throws Exception {
        Aluno aluno = alunoRepository.findById(id).orElseThrow(Exception::new);
        return alunoMapper.toResponse(aluno);
    }

    @Override
    public List<AlunoResponse> read() {

        List<Aluno> listaAlunos = alunoRepository.findAll();

        return alunoMapper.toResponseList(listaAlunos);
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
    public AlunoResponse updateAll(Integer id, AlunoRequest request) throws Exception {

        //Pesquisamos o ID que foi passado pela camada de resource
        Aluno alunoEncontrado = alunoRepository.findById(id).orElseThrow(Exception::new);

        //Ao encontrados o registro (alunoEncontrado), atualizamos TODOS os dados conforme a SEMÂNTICA do verbo PUT
        alunoEncontrado.setNome(request.getNome());
        alunoEncontrado.setMatricula(request.getMatricula());
        alunoEncontrado.setNota(request.getNota());
        alunoEncontrado.setNotaFormal(request.getNotaFormal());

        alunoRepository.save(alunoEncontrado);

        return alunoMapper.toResponse(alunoEncontrado);
    }

    /**
     * Este método é para ser utilizado na chamada do verbo PATCH
     *
     * @param id
     * @param request
     * @return
     */
    @Override
    public AlunoResponse updatePart(Integer id, AlunoRequest request) throws Exception {
        //Pesquisamos o ID que foi passado pela camada de resource
        Aluno alunoEncontrado = alunoRepository.findById(id).orElseThrow(Exception::new);


        if(request.getNome()!=null && !request.getNome().isEmpty() && !request.getNome().isBlank()){
            alunoEncontrado.setNome(request.getNome());
        }

        if(request.getMatricula()!=null && !request.getMatricula().isEmpty()){
            alunoEncontrado.setMatricula(request.getMatricula());
        }

        if(request.getNota()!=null && request.getNota().doubleValue() > 0){
            alunoEncontrado.setNota(request.getNota());
        }

        if(request.getNotaFormal()!=null && request.getNotaFormal().doubleValue() > 0){
            alunoEncontrado.setNotaFormal(request.getNotaFormal());
        }

        alunoRepository.save(alunoEncontrado);

        return alunoMapper.toResponse(alunoEncontrado);
    }

    /**
     * Recebo um ID e apago o registro. Após a execução, devo devolver um T2 (response / reposta)
     *
     * @param id
     * @return
     */
    @Override
    public AlunoResponse delete(Integer id) throws Exception {

        //garanto que encontrei o registro para deletar
        Aluno alunoEncontrado = alunoRepository.findById(id).orElseThrow(Exception::new);

        //apaga o registro no banco de dados
        alunoRepository.delete(alunoEncontrado);

        return alunoMapper.toResponse(alunoEncontrado);
    }
}
