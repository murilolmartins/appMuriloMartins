package br.edu.infnet.appMuriloMatins.model.repository;

import br.edu.infnet.appMuriloMatins.model.domain.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
}