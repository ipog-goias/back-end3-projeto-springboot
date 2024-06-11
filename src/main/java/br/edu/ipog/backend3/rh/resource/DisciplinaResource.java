package br.edu.ipog.backend3.rh.resource;

import br.edu.ipog.backend3.rh.interfaces.GenericOperationsv3;
import br.edu.ipog.backend3.rh.model.Disciplina;
import br.edu.ipog.backend3.rh.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 * C.R.U.D
 * Create - POST
 * Read - GET
 * Update - PUT (atualiza tudo), PATCH (atualiza parte)
 * Delete - DELETE
 *
 */
@RestController
@RequestMapping(path = "/api/v1/disciplina")
public class DisciplinaResource implements GenericOperationsv3<Disciplina, Integer> {

    @Autowired //injeção de dependência
    private DisciplinaService disciplinaService;

    @Override
    public Disciplina create(Disciplina entidade) {
        return null;
    }

    @Override
    public Disciplina read(Integer id) {
        return null;
    }

    @Override
    public List<Disciplina> read() {
        return List.of();
    }

    @Override
    public Disciplina updatePart(Integer id, Disciplina entidade) {
        return null;
    }

    @Override
    public Disciplina updateFull(Integer id, Disciplina entidade) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
