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
 * T = RESPONSE,
 * U = request
 *
 */
public interface GenericOperationsv2<T, U, N> {

    /**
     * Mètodo para criar T
     * @param request
     * @return
     */
    public T create(U request);

    /**
     * Método para consultar T baseado no identificador N informado
     * @param id
     * @return
     */
    public T read(N id);

    /**
     * Retorna uma lista de T
     * @return
     */
    public List<T> read();

    /**
     * Iremos passar N(id) para buscar o registro e T(entity) para atualizar o objeto;
     * @param id
     * @param request
     * @return
     */
    public T update(N id, U request);

    /**
     * Deleta um registro com base no identificador N(id)
     * @param id
     */
    public void delete(N id);

}