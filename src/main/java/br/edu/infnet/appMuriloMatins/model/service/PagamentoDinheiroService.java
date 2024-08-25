package br.edu.infnet.appMuriloMatins.model.service;

import br.edu.infnet.appMuriloMatins.model.domain.PagamentoDinheiro;
import br.edu.infnet.appMuriloMatins.model.repository.PagamentoDinheiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class PagamentoDinheiroService {

    @Autowired
    private PagamentoDinheiroRepository pagamentoDinheiroRepository;

    public void incluir(PagamentoDinheiro pagamentoDinheiro) {
        pagamentoDinheiroRepository.save(pagamentoDinheiro);
    }

    public Collection<PagamentoDinheiro> obterLista() {
        return (Collection<PagamentoDinheiro>) pagamentoDinheiroRepository.findAll();
    }

    public PagamentoDinheiro obterPorId(int id) {
        return pagamentoDinheiroRepository.findById(id).orElse(null);
    }

    public void excluirPorId(int id) {
        pagamentoDinheiroRepository.deleteById(id);
    }

    public int getQuantidadePagamentosDinheiro() {
        return (int) pagamentoDinheiroRepository.count();
    }

}
