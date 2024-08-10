package br.edu.infnet.appMuriloMatins;

import model.domain.PagamentoDinheiro;
import model.service.PagamentoDinheiroService;
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

            var pagamentoDinheiro = new PagamentoDinheiro(dados[0], Float.parseFloat(dados[2]),
                    Float.parseFloat(dados[1]), Float.parseFloat(dados[3]));

            pagamentoDinheiroService.incluir(pagamentoDinheiro);
        }

        reader.close();

    }
}
