package br.edu.ipog.backend3.rh.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "TURMA")
public class Turma extends BaseModel {
    @Column(name = "NOME", length = 100, nullable = false)
    private String nome;
}
