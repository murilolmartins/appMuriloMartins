package br.edu.infnet.appMuriloMatins.controller;


import model.domain.PagamentoDinheiro;
import model.service.PagamentoDinheiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class PagamentoDinheiroController {

    @Autowired
    private PagamentoDinheiroService pagamentoDinheiroService;

    @GetMapping(value = "/pagamentoDinheiro/listar")
    public Collection<PagamentoDinheiro> listarPagamentoDinheiro() {
        return pagamentoDinheiroService.obterLista();
    }

    @PostMapping(value = "/pagamentoDinheiro/incluir")
    public void incluirPagamentoDinheiro(PagamentoDinheiro pagamentoDinheiro) {
        pagamentoDinheiroService.incluir(pagamentoDinheiro);
    }

    @GetMapping(value = "/pagamentoDinheiro/{id}")
    public PagamentoDinheiro obterPorId(@PathVariable int id) {
        return pagamentoDinheiroService.obterPorId(id);
    }

    @DeleteMapping(value = "/pagamentoDinheiro/excluir/{id}")
    public void excluirPorId(@PathVariable int id) {
        pagamentoDinheiroService.excluirPorId(id);
    }
}
