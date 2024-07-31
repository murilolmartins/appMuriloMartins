package br.edu.infnet.appMuriloMatins;

import model.domain.PagamentoCartao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;

@Component
public class PagamentoCartaoLoader implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {

        FileReader file = new FileReader("PagamentoCartao.txt");

        BufferedReader reader = new BufferedReader(file);

        while (reader.ready()) {
            String linha = reader.readLine();

            var dados = linha.split(";");

            var pagamentoCartao = new PagamentoCartao(dados[0], Float.parseFloat(dados[1]), dados[2]
                    , dados[3], Boolean.parseBoolean(dados[4]));

            System.out.println(pagamentoCartao);
        }

        reader.close();

    }
}
