package br.edu.infnet.appMuriloMatins;

import br.edu.infnet.appMuriloMatins.model.domain.Cupom;
import br.edu.infnet.appMuriloMatins.model.domain.PagamentoDinheiro;
import br.edu.infnet.appMuriloMatins.model.service.PagamentoDinheiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;


@Component
public class PagamentoDinheiroLoader implements ApplicationRunner {

    @Autowired
    private PagamentoDinheiroService pagamentoDinheiroService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        FileReader file = new FileReader("files/PagamentoDinheiro.txt");

        BufferedReader reader = new BufferedReader(file);

        while (reader.ready()) {
            String linha = reader.readLine();

            var dados = linha.split(";");

            Cupom cupom = new Cupom();
            cupom.setId(Integer.parseInt(dados[4]));

            var pagamentoDinheiro = new PagamentoDinheiro(dados[0], Float.parseFloat(dados[2]),
                    Float.parseFloat(dados[1]), Float.parseFloat(dados[3]));


            pagamentoDinheiro.setCupom(cupom);

            pagamentoDinheiroService.incluir(pagamentoDinheiro);

        }

        reader.close();

    }
}
