package br.edu.infnet.appMuriloMatins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
		"br.edu.infnet.appMuriloMatins.model.domain",
		"br.edu.infnet.appMuriloMatins.model.repository",
		"br.edu.infnet.appMuriloMatins.model.service",
		"br.edu.infnet.appMuriloMatins"
})
public class AppMuriloMatinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppMuriloMatinsApplication.class, args);
	}
}