package br.edu.ipog.backend3.rh.relacionamentos.bidirecional;

import br.edu.ipog.backend3.rh.relacionamentos.unidirecional.Veiculo;
import jakarta.persistence.*;
import lombok.Data;

@Data //faz get/set/equals/hascode/toString
@Entity (name = "VEICULO_1") //Classe gerenciada pelo JPA
@Table(name = "VEICULO_1") //cria tabela co o nome passado por parâmetro
public class Veiculo1 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    //relacionamento bi-direcional
    @ManyToOne(fetch = FetchType.LAZY)
    private Pessoa1 pessoa;

    public void teste(){

        Veiculo1 veiculo1 = new Veiculo1();
        veiculo1.getPessoa();


    }

}
