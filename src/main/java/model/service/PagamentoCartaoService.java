package model.service;

import model.domain.PagamentoCartao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class PagamentoCartaoService {

    Map<Integer, PagamentoCartao> pagamentosCartao = new HashMap<>();
    Integer id = 0;

    public void incluir( PagamentoCartao pagamentoCartao) {
        pagamentoCartao.setId(++id);

        pagamentosCartao.put(pagamentoCartao.getId(), pagamentoCartao);
    }

    public Collection<PagamentoCartao> obterLista() {
        return pagamentosCartao.values();
    }

    public PagamentoCartao obterPorId(int id) {
        return pagamentosCartao.get(id);
    }

    public void excluirPorId(int id) {
        pagamentosCartao.remove(id);
    }

}
