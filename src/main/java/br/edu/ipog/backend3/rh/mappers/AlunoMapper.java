package br.edu.ipog.backend3.rh.mappers;

import br.edu.ipog.backend3.rh.contratos.AlunoRequest;
import br.edu.ipog.backend3.rh.contratos.AlunoResponse;
import br.edu.ipog.backend3.rh.model.Aluno;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AlunoMapper {


    //Neste cenário estamos passando o modelo Aluno e requeremo que os
    // dados seja convertidos
    // em response ou request
    AlunoResponse toResponse(Aluno aluno);
    AlunoRequest toRequest(Aluno aluno);

    /*
    * Estamos recebendo response e request. Queremos converter o objeto para entidate (model)
    * */
    Aluno toEntity(AlunoResponse alunoResponse);
    Aluno toEntity(AlunoRequest alunoRequest);

}
