package br.com.seteideias.testeconexaopostgres.repository;

import br.com.seteideias.testeconexaopostgres.repository.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterfaceNecessariaParaIteracaoComOBancoRepository extends JpaRepository<ClienteEntity, String> {
}
