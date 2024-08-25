package br.edu.infnet.appMuriloMatins.model.service;

import br.edu.infnet.appMuriloMatins.model.domain.Cupom;
import br.edu.infnet.appMuriloMatins.model.repository.CupomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class CupomService {

    @Autowired
    private CupomRepository cupomRepository;

    public void incluir(Cupom cupom) {
        cupomRepository.save(cupom);
    }

    public Collection<Cupom> obterLista() {
        return  (Collection<Cupom>) cupomRepository.findAll();
    }

    public Cupom obterPorId(int id) {
        return cupomRepository.findById(id).orElse(null);
    }

    public void excluirPorId(int id) {
        cupomRepository.deleteById(id);
    }

    public int getQuantidadeCupons() {
        return (int) cupomRepository.count();
    }

}
