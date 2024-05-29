package br.edu.ipog.backend3.rh.relacionamentos.unidirecional;

import jakarta.persistence.*;
import lombok.Data;

@Data //faz get/set/equals/hascode/toString
@Entity //Classe gerenciada pelo JPA
@Table(name = "VEICULO") //cria tabela co o nome passado por parâmetro
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
}
