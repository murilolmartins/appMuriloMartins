package br.edu.infnet.appMuriloMatins;

import br.edu.infnet.appMuriloMatins.model.domain.Cupom;
import br.edu.infnet.appMuriloMatins.model.domain.PagamentoCartao;
import br.edu.infnet.appMuriloMatins.model.domain.PagamentoDinheiro;
import br.edu.infnet.appMuriloMatins.model.domain.Produto;
import br.edu.infnet.appMuriloMatins.model.service.CupomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;

@Component
@Order(1)
public class CupomLoader implements ApplicationRunner {

    @Autowired
    private CupomService cupomService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        FileReader file = new FileReader("files/Cupom.txt");

        BufferedReader reader = new BufferedReader(file);

        Cupom cupom = null;

        while (reader.ready()) {
            String linha = reader.readLine();

            var dados = linha.split(";");

            switch (dados[0]) {
                case "Cupom":

                    cupom = new Cupom(dados[1], dados[2], Float.valueOf(dados[3]), dados[4]);

                    cupomService.incluir(cupom);
                    break;
                case "Produto":
                    var produto = new Produto(dados[1], Float.parseFloat(dados[2]),
                            Integer.parseInt(dados[3]));

                    cupom.setProdutos(produto);

                    break;
                case "PagamentoCartao":
                    var pagamentoCartao = new PagamentoCartao(dados[1],
                            Float.parseFloat(dados[2]), dados[3], dados[4],
                            Boolean.parseBoolean(dados[5]));

                    cupom.setPagamentos(pagamentoCartao);

                    break;
                case "PagamentoDinheiro":
                    var pagamentoDinheiro = new PagamentoDinheiro(dados[1],
                            Float.parseFloat(dados[4]), Float.parseFloat(dados[3]),
                            Float.parseFloat(dados[2]));

                    cupom.setPagamentos(pagamentoDinheiro);

                    break;
            }


        }


        reader.close();

        for (Cupom c : cupomService.obterLista()) {
            System.out.println(c);
        }

    }
}
