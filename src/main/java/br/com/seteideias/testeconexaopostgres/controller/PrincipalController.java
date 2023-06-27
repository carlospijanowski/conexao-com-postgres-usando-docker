package br.com.seteideias.testeconexaopostgres.controller;

import br.com.seteideias.testeconexaopostgres.dto.request.RequestPayload;
import br.com.seteideias.testeconexaopostgres.dto.response.ResponsePayload;
import br.com.seteideias.testeconexaopostgres.service.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrincipalController {
    @Autowired
    private CepService service;

    @PostMapping("/cadastro")
    public ResponsePayload metodoParaGravarNoBancoERetornarOObjetoSalvo(@RequestBody RequestPayload payloadQueChega) {
        return service.salvarNoBanco(payloadQueChega);
    }
}
