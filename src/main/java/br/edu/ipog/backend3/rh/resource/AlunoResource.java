package br.edu.ipog.backend3.rh.resource;

import br.edu.ipog.backend3.rh.contratos.AlunoRequest;
import br.edu.ipog.backend3.rh.contratos.AlunoResponse;
import br.edu.ipog.backend3.rh.interfaces.GenericOperationsv2;
import br.edu.ipog.backend3.rh.interfaces.IResource;
import br.edu.ipog.backend3.rh.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/aluno")
public class AlunoResource {

    @Autowired //injeção de dependência
    private AlunoService alunoService;

}
