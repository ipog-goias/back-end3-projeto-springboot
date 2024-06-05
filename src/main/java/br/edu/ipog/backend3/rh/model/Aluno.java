package br.edu.ipog.backend3.rh.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity //Este parâmetro indica que o JPA irá gerenciar o estado desta classe.
@Table(name = "ALUNO") //Indica o nome da tabela para ser criada no banco de dados
public class Aluno extends BaseModel {

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "MATRICULA", nullable = false)
    private String matricula;

    @Column(name = "NOTA", columnDefinition = "numeric(9,2)", nullable = false)
    private BigDecimal nota;

    @Column(name = "NOTA_FORMAL", precision = 9, scale = 2, nullable = false)
    private BigDecimal notaFormal;
}
