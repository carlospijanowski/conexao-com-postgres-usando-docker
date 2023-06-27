package br.com.seteideias.testeconexaopostgres.service;

import br.com.seteideias.testeconexaopostgres.dto.request.RequestPayload;
import br.com.seteideias.testeconexaopostgres.dto.response.ResponsePayload;
import br.com.seteideias.testeconexaopostgres.repository.entity.ClienteEntity;
import br.com.seteideias.testeconexaopostgres.repository.InterfaceNecessariaParaIteracaoComOBancoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CepService {
    @Autowired
    InterfaceNecessariaParaIteracaoComOBancoRepository repository;
    public ResponsePayload salvarNoBanco(RequestPayload payloadQueChega) {

        /**
         * eu preciso salvar um tipo clienteEntity
         * entao eu converto para o tipo!!!!
         */
        ClienteEntity clienteEntity = new ClienteEntity();
        clienteEntity.setNomeCliente(payloadQueChega.getNomeCliente());
        clienteEntity.setCep(payloadQueChega.getCep());
        clienteEntity.setLogradouro(payloadQueChega.getLogradouro());

        /**
         * agora eu posso salvar
         * como retorno, o save me retorna uma ClienteEntity
         */
        ClienteEntity entity = repository.save(clienteEntity);


        /**
         * como o metodo precisa retornar um ResponsePayload eu converto para o objeto
         */
        ResponsePayload responsePayload = new ResponsePayload();
        responsePayload.setId(entity.getId());
        responsePayload.setNomeCliente(entity.getNomeCliente());
        responsePayload.setCep(entity.getCep());
        responsePayload.setLogradouro(entity.getLogradouro());

        /**
         * agora eu retorno o objeto correto
         */
        return responsePayload;
    }
}
