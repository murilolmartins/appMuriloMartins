package br.edu.infnet.appMuriloMatins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "model.service")
@ComponentScan(basePackages = "br.edu.infnet.appMuriloMatins")
public class AppMuriloMatinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppMuriloMatinsApplication.class, args);
	}

}
