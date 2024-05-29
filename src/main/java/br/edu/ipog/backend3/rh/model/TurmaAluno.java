package br.edu.ipog.backend3.rh.model;

import br.edu.ipog.backend3.rh.embedable.TurmaAlunoId;
import jakarta.persistence.*;

@Entity
@Table(name = "TURMA_ALUNO")
public class TurmaAluno {

    //vincular o embedable (chave-composta /tipo composto)
    @EmbeddedId
    private TurmaAlunoId id;

    //Fazer mapeamentos @ManyToOne

    @ManyToOne
    @MapsId("alunoId")
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    @ManyToOne
    @MapsId("turmaId")
    @JoinColumn(name = "turma_id")
    private Turma turma;
}
