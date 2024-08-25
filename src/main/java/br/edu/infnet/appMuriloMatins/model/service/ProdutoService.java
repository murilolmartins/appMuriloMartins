package br.edu.infnet.appMuriloMatins.model.service;

import br.edu.infnet.appMuriloMatins.model.domain.Produto;
import br.edu.infnet.appMuriloMatins.model.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;


    public void incluir(Produto produto) {
        produtoRepository.save(produto);
    }

    public Collection<Produto> obterLista() {
        return (Collection<Produto>) produtoRepository.findAll();
    }

    public Produto obterPorId(int id) {
        return produtoRepository.findById(id).orElse(null);
    }

    public void excluirPorId(int id) {
        produtoRepository.deleteById(id);
    }

    public int getQuantidadeProdutos() {
        return (int) produtoRepository.count();
    }

}
