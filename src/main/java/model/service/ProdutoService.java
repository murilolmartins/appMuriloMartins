package model.service;

import model.domain.Produto;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ProdutoService {

    Map<Integer, Produto> produtos = new HashMap<>();
    Integer id = 0;

    public void incluir(Produto produto) {
        produto.setId(++id);

        produtos.put(produto.getId(), produto);
    }

    public Collection<Produto> obterLista() {
        return produtos.values();
    }

    public Produto obterPorId(int id) {
        return produtos.get(id);
    }

    public void excluirPorId(int id) {
        produtos.remove(id);
    }

}
