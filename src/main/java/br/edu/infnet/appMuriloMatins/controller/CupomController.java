package br.edu.infnet.appMuriloMatins.controller;

import br.edu.infnet.appMuriloMatins.model.domain.Cupom;
import br.edu.infnet.appMuriloMatins.model.service.CupomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class CupomController {

    @Autowired
    private CupomService cupomService;

    @GetMapping(value = "/cupom/listar")
    public Collection<Cupom> listarCupom() {
        return cupomService.obterLista();
    }

    @PostMapping(value = "/cupom/incluir")
    public void incluirCupom(Cupom cupom) {
        cupomService.incluir(cupom);
    }

    @GetMapping(value = "/cupom/{id}")
    public Cupom obterPorId(@PathVariable int id) {
        return cupomService.obterPorId(id);
    }

    @DeleteMapping(value = "/cupom/excluir/{id}")
    public void excluirPorId(@PathVariable int id) {
        cupomService.excluirPorId(id);
    }
}
