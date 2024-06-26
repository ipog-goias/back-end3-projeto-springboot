package br.edu.ipog.backend3.rh.interfaces;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/generics/types.html">Generics Java</a>
 * T - Type (Pode ser qualquer coisa = Pessoa, Aluno (geralmente camada Model)
 * N - Number (Integer, Double, etc; Geralmente é um wrapper)
 *
 * Iremos fazer o CRUD
 * create -> post > 1 registro
 * read -> get > 1 registro (id) ou n registros (lista)
 * update ->put (atualiza tudo), patch (atualiza parte)
 *         >  identificar o registro(id), precisamos do objeto para ser atualizado;
 * delete -> delete
 *
 * T - indica o "tipo": Aluno, Disciplina, Professor ou Turma
 * N - Indica o identificador [tipo] (pk) que será utilizada -= N indica Number (Integer, Long...)
 *
 * A camada de resource recebe uma requisição (request),
 * que por sua 'passa' este contrato para 'frente' (camada de serviço).
 * A camada de serviço converter a requisição para uma camada de model para ser persistida
 * no banco de dados.
 *
 * O desafio nosso neste contrato para a CAMADA DE RESOURCE, é criar um contrato que recebe Request, Response e o identificador
 *
 * REQUEST = T1 = ProfessorRequest
 * RESPONSE = T2 = ProfessorResponse
 * N = Integer
 * ResponseEntity deve encapsular T2 ele só pode estar contido na camada de RESOURCE.
 */
public interface IService<T1, T2, N> {

    //POST - create(request);
    //T1 REQUEST, T2 RESPONSE
    T2 create(T1 request);

    //GET - read(1);
    //T2 RESPONSE
    T2 read(N id) throws Exception ;

    //GET - read(); devolve uma lista
    List<T2> read();

    /**
     * PUT(1,request);
     * Geralmente nas requisições PUT OU PATH, você sempre vai receber um ID, e um body (corpo/json)
     * com os dados para serem atualizados.
     * @param request
     * @param id
     * @return
     */
    T2 updateAll(N id, T1 request) throws Exception;

    /**
     * Este método é para ser utilizado na chamada do verbo PATCH
     * @param id
     * @param request
     * @return
     */
    T2 updatePart(N id, T1 request) throws Exception;

    /**
     * Recebo um ID e apago o registro. Após a execução, devo devolver um T2 (response / reposta)
     * @param id
     * @return
     */
    T2 delete(N id) throws Exception;
}
