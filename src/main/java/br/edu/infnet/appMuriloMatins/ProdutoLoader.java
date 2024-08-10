package br.edu.infnet.appMuriloMatins;

import model.domain.Produto;
import model.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;


@Component
public class ProdutoLoader implements ApplicationRunner {

    @Autowired
    private ProdutoService produtoService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        FileReader file = new FileReader("files/Produto.txt");

        BufferedReader reader = new BufferedReader(file);

        while (reader.ready()) {
            String linha = reader.readLine();

            var dados = linha.split(";");

            var produto = new Produto(dados[0], Float.parseFloat(dados[1]),
                    Integer.parseInt(dados[2]));

            produtoService.incluir(produto);
        }

        reader.close();

    }
}
