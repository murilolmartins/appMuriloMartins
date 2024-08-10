package br.edu.infnet.appMuriloMatins.controller;


import model.domain.PagamentoCartao;
import model.service.PagamentoCartaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class PagamentoCartaoController {

    @Autowired
    private PagamentoCartaoService pagamentoCartaoService;

    @GetMapping(value = "/pagamentoCartao/listar")
    public Collection<PagamentoCartao> listarPagamentoCartao() {
        return pagamentoCartaoService.obterLista();
    }

    @PostMapping(value = "/pagamentoCartao/incluir")
    public void incluirPagamentoCartao(PagamentoCartao pagamentoCartao) {
        pagamentoCartaoService.incluir(pagamentoCartao);
    }

    @GetMapping(value = "/pagamentoCartao/{id}")
    public PagamentoCartao obterPorId(@PathVariable int id) {
        return pagamentoCartaoService.obterPorId(id);
    }

    @DeleteMapping(value = "/pagamentoCartao/excluir/{id}")
    public void excluirPorId(@PathVariable int id) {
        pagamentoCartaoService.excluirPorId(id);
    }

}
