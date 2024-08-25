package br.edu.infnet.appMuriloMatins.controller;


import br.edu.infnet.appMuriloMatins.model.domain.PagamentoCartao;
import br.edu.infnet.appMuriloMatins.model.service.PagamentoCartaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class PagamentoCartaoController {

    @Autowired
    private PagamentoCartaoService pagamentoCartaoService;

    @GetMapping(value = "/pagamento-cartao/listar")
    public Collection<PagamentoCartao> listarPagamentoCartao() {
        return pagamentoCartaoService.obterLista();
    }

    @PostMapping(value = "/pagamento-cartao/incluir")
    public void incluirPagamentoCartao(PagamentoCartao pagamentoCartao) {
        pagamentoCartaoService.incluir(pagamentoCartao);
    }

    @GetMapping(value = "/pagamento-cartao/{id}")
    public PagamentoCartao obterPorId(@PathVariable int id) {
        return pagamentoCartaoService.obterPorId(id);
    }

    @DeleteMapping(value = "/pagamento-cartao/excluir/{id}")
    public void excluirPorId(@PathVariable int id) {
        pagamentoCartaoService.excluirPorId(id);
    }

}
