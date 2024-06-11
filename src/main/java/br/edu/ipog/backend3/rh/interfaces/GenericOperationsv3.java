package br.edu.ipog.backend3.rh.interfaces;

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
 */
public interface GenericOperationsv3<T,N> {

    public T create(T entidade);

    public T read(N id);

    public List<T>read();

    public T updatePart(N id, T entidade);

    public T updateFull(N id, T entidade);

    public void delete(N id);



}
