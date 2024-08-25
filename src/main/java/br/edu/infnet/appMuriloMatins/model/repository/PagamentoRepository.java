package br.edu.infnet.appMuriloMatins.model.repository;


import br.edu.infnet.appMuriloMatins.model.domain.Pagamento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends CrudRepository<Pagamento, Integer> {
}
