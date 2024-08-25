package br.edu.infnet.appMuriloMatins.controller;

import br.edu.infnet.appMuriloMatins.model.domain.Produto;
import br.edu.infnet.appMuriloMatins.model.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping(value = "/produto/listar")
    public Collection<Produto> listarProdutos() {
        return produtoService.obterLista();
    }

    @PostMapping(value = "/produto/incluir")
    public void incluirProduto(Produto produto) {
        produtoService.incluir(produto);
    }

    @GetMapping(value = "/produto/{id}")
    public Produto obterPorId(@PathVariable int id) {
        return produtoService.obterPorId(id);
    }

    @DeleteMapping(value = "/produto/excluir/{id}")
    public void excluirPorId(@PathVariable int id) {
        produtoService.excluirPorId(id);
    }
}
