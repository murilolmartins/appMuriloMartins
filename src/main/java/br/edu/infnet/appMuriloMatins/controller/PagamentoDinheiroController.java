package br.edu.infnet.appMuriloMatins.controller;


import br.edu.infnet.appMuriloMatins.model.domain.PagamentoDinheiro;
import br.edu.infnet.appMuriloMatins.model.service.PagamentoDinheiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class PagamentoDinheiroController {

    @Autowired
    private PagamentoDinheiroService pagamentoDinheiroService;

    @GetMapping(value = "/pagamento-dinheiro/listar")
    public Collection<PagamentoDinheiro> listarPagamentoDinheiro() {
        return pagamentoDinheiroService.obterLista();
    }

    @PostMapping(value = "/pagamento-dinheiro/incluir")
    public void incluirPagamentoDinheiro(PagamentoDinheiro pagamentoDinheiro) {
        pagamentoDinheiroService.incluir(pagamentoDinheiro);
    }

    @GetMapping(value = "/pagamento-dinheiro/{id}")
    public PagamentoDinheiro obterPorId(@PathVariable int id) {
        return pagamentoDinheiroService.obterPorId(id);
    }

    @DeleteMapping(value = "/pagamento-dinheiro/excluir/{id}")
    public void excluirPorId(@PathVariable int id) {
        pagamentoDinheiroService.excluirPorId(id);
    }
}
