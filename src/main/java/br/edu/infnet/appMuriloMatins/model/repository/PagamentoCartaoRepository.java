package br.edu.infnet.appMuriloMatins.model.repository;

import br.edu.infnet.appMuriloMatins.model.domain.PagamentoCartao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoCartaoRepository extends CrudRepository<PagamentoCartao, Integer> {
}
