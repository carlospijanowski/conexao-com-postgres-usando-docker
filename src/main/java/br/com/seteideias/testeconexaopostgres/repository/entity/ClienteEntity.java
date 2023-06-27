package br.com.seteideias.testeconexaopostgres.repository.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name="Cliente")
public class ClienteEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private String id;

    @Column(name = "nome_cliente")
    private String nomeCliente;
    @Column
    private String cep;
    @Column
    private String logradouro;

}
