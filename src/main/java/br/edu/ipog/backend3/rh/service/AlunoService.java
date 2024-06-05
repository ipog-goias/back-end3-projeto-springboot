package br.edu.ipog.backend3.rh.service;

import br.edu.ipog.backend3.rh.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    @Autowired //injeção de dependência
    private AlunoRepository alunoRepository;
}
