package br.edu.ipog.backend3.rh.resource;

import br.edu.ipog.backend3.rh.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/disciplina")
public class DisciplinaResource {

    @Autowired //injeção de dependência
    private DisciplinaService disciplinaService;
}
