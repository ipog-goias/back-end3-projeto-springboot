package br.edu.ipog.backend3.rh.resource;

import br.edu.ipog.backend3.rh.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/professor")
public class ProfessorResource {

    @Autowired //injeção de dependência
    private ProfessorService professorService;
}
