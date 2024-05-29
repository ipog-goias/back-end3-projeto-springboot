package br.edu.ipog.backend3.rh.embedable;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class TurmaProfessorId implements Serializable {

    private Integer turmaId;

    private Integer professorId;
}
