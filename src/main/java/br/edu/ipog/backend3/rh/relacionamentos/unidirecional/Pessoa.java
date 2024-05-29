package br.edu.ipog.backend3.rh.relacionamentos.unidirecional;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data //faz get/set/equals/hascode/toString
@Entity //Classe gerenciada pelo JPA
@Table(name = "PESSOA") //cria tabela co o nome passado por parâmetro
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    //relacionamento uni-direcional
    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "pessoa_id")
    private List<Veiculo> veiculos = new ArrayList<>();
}
