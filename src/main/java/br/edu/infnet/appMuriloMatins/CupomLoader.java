package br.edu.infnet.appMuriloMatins;

import model.domain.Cupom;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;

@Component
public class CupomLoader implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        FileReader file = new FileReader("Cupom.txt");

        BufferedReader reader = new BufferedReader(file);


        while (reader.ready()) {
            String linha = reader.readLine();

            var dados = linha.split(";");


            var cupom = new Cupom(dados[0], dados[1], Float.valueOf(dados[2]), dados[3]);

            System.out.println(cupom);
        }


        reader.close();

    }
}
