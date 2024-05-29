package br.edu.ipog.backend3.rh.model;

import br.edu.ipog.backend3.rh.embedable.TurmaProfessorId;
import jakarta.persistence.*;

@Entity
@Table(name = "TURMA_PROFESSOR")
public class TurmaProfessor {

    @EmbeddedId
    private TurmaProfessorId id;

    //Relacionamentos
    @ManyToOne
    @MapsId("turmaId")
    @JoinColumn(name = "turma_id")
    private Turma turma;

    @ManyToOne
    @MapsId("professorId")
    @JoinColumn(name = "professor_id")
    private Professor professor;
}
