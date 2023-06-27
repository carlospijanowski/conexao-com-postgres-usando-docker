package br.com.seteideias.testeconexaopostgres.dto.request;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class RequestPayload {
    private String nomeCliente;
    @Column
    private String cep;
    @Column
    private String logradouro;
}
