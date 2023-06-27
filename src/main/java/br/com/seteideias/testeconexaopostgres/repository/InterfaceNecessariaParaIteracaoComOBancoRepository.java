package br.com.seteideias.testeconexaopostgres.repository;

import br.com.seteideias.testeconexaopostgres.model.CepEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface InterfaceNecessariaParaIteracaoComOBanco extends JpaRepository<CepEntity,String> {
}
