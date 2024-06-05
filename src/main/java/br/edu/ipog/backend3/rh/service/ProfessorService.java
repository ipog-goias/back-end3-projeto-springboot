package br.edu.ipog.backend3.rh.service;

import br.edu.ipog.backend3.rh.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {

    @Autowired //injeção de dependência
    private ProfessorRepository professorRepository;
}
