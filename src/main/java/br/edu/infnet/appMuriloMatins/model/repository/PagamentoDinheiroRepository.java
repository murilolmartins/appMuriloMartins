package br.edu.infnet.appMuriloMatins.model.repository;

import br.edu.infnet.appMuriloMatins.model.domain.PagamentoDinheiro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PagamentoDinheiroRepository extends CrudRepository<PagamentoDinheiro, Integer> {
}
