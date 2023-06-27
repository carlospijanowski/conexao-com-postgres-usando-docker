package br.com.seteideias.testeconexaopostgres.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name="cep")
public class CepEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id"/*, nullable = false*/)
    private String id;
    @Column
    private String cep;
    @Column
    private String logradouro;

}
