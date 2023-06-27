package br.com.seteideias.testeconexaopostgres.dto.response;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class ResponsePayload {
    private String id;

    private String nomeCliente;
    @Column
    private String cep;
    @Column
    private String logradouro;
}
