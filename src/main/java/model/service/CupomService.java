package model.service;

import model.domain.Cupom;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class CupomService {

    Map<Integer, Cupom> cupons = new HashMap<>();
    Integer id = 0;

    public void incluir(Cupom cupom) {
        cupom.setId(++id);

        cupons.put(cupom.getId(), cupom);
    }

    public Collection<Cupom> obterLista() {
        return  cupons.values();
    }

    public Cupom obterPorId(int id) {
        return cupons.get(id);
    }

    public void excluirPorId(int id) {
        cupons.remove(id);
    }

}
