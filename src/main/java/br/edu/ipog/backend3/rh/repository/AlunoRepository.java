package br.edu.ipog.backend3.rh.repository;

import br.edu.ipog.backend3.rh.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
}
