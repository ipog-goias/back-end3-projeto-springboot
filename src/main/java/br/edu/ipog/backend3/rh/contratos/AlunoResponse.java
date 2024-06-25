package br.edu.ipog.backend3.rh.contratos;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AlunoResponse {

    private String nome;

    private  String matricula;

    private BigDecimal nota;

    private  BigDecimal notaFormal;
}
