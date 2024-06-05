package br.edu.ipog.backend3.rh.service;

import br.edu.ipog.backend3.rh.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisciplinaService {

    @Autowired //injeção de dependência
    private DisciplinaRepository disciplinaRepository;
}
