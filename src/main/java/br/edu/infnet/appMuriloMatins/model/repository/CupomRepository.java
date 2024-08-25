package br.edu.infnet.appMuriloMatins.model.repository;

import br.edu.infnet.appMuriloMatins.model.domain.Cupom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CupomRepository extends CrudRepository<Cupom , Integer> {
}
