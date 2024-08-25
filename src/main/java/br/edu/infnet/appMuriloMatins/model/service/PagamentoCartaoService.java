package br.edu.infnet.appMuriloMatins.model.service;

import br.edu.infnet.appMuriloMatins.model.domain.PagamentoCartao;
import br.edu.infnet.appMuriloMatins.model.repository.PagamentoCartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class PagamentoCartaoService {

    @Autowired
    private PagamentoCartaoRepository pagamentoCartaoRepository;


    public void incluir( PagamentoCartao pagamentoCartao) {
        pagamentoCartaoRepository.save(pagamentoCartao);
    }

    public Collection<PagamentoCartao> obterLista() {
        return (Collection<PagamentoCartao>) pagamentoCartaoRepository.findAll();
    }

    public PagamentoCartao obterPorId(int id) {
        return pagamentoCartaoRepository.findById(id).orElse(null);
    }

    public void excluirPorId(int id) {
        pagamentoCartaoRepository.deleteById(id);
    }

    public int getQuantidadePagamentosCartao() {
        return (int) pagamentoCartaoRepository.count();
    }

}
