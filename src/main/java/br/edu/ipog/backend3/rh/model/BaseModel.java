package br.edu.ipog.backend3.rh.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseModel {

    @Id //definição de chave primária
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Integer id;
}
