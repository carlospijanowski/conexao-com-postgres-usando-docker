package br.com.seteideias.testeconexaopostgres;

import br.com.seteideias.testeconexaopostgres.model.CepEntity;
import br.com.seteideias.testeconexaopostgres.repository.InterfaceNecessariaParaIteracaoComOBanco;
import br.com.seteideias.testeconexaopostgres.service.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired

    private CepService cepService;

    @PostMapping("/cadastro")
    public CepEntity consultaCEP(@RequestBody CepEntity cepEntity){
        return cepService.salvarNoBanco(cepEntity);
    }


}
