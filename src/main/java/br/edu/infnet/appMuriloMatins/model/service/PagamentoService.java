package br.edu.infnet.appMuriloMatins.model.service;

import br.edu.infnet.appMuriloMatins.model.domain.Pagamento;
import br.edu.infnet.appMuriloMatins.model.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PagamentoService {

    @Autowired
    private PagamentoRepository pagamentoRepository;


    public Collection<Pagamento> obterLista() {
        return (Collection<Pagamento>) pagamentoRepository.findAll();
    }


    public int getQuantidadePagamentos() {
        return (int) pagamentoRepository.count();
    }

}
