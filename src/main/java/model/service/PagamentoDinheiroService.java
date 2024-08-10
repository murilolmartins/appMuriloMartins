package model.service;

import model.domain.PagamentoDinheiro;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class PagamentoDinheiroService {

    Map<Integer, PagamentoDinheiro> pagamentosDinheiro = new HashMap<>();
    Integer id = 0;

    public void incluir(PagamentoDinheiro pagamentoDinheiro) {
        pagamentoDinheiro.setId(++id);

        pagamentosDinheiro.put(pagamentoDinheiro.getId(), pagamentoDinheiro);
    }

    public Collection<PagamentoDinheiro> obterLista() {
        return pagamentosDinheiro.values();
    }

    public PagamentoDinheiro obterPorId(int id) {
        return pagamentosDinheiro.get(id);
    }

    public void excluirPorId(int id) {
        pagamentosDinheiro.remove(id);
    }

}
