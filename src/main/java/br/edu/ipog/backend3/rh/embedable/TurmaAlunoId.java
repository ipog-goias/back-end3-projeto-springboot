package br.edu.ipog.backend3.rh.embedable;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class TurmaAlunoId implements Serializable {

    private Integer alunoId;

    private Integer turmaId;
}
