package br.edu.ipog.backend3.rh.repository;

import br.edu.ipog.backend3.rh.model.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Integer> {
}
