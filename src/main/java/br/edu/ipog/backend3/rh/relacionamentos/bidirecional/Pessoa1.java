package br.edu.ipog.backend3.rh.relacionamentos.bidirecional;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data //faz get/set/equals/hascode/toString
@Entity(name = "PESSOA_1" ) //Classe gerenciada pelo JPA
@Table(name = "PESSOA_1") //cria tabela co o nome passado por parâmetro
public class Pessoa1 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    //relacionamento bi-direcional
    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true,
            mappedBy = "pessoa"
    )
    private List<Veiculo1> veiculos = new ArrayList<>();
}
