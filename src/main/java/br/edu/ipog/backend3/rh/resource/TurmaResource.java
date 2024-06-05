package br.edu.ipog.backend3.rh.resource;

import br.edu.ipog.backend3.rh.service.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/turma")
public class TurmaResource {

    @Autowired //injeção de dependência
    private TurmaService turmaService;
}
