package com.dio.primeiros_passos.bevscomp;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringPrimeirosPassosApplication2 {

	public static void main(String[] args) {
		SpringApplication.run(SpringPrimeirosPassosApplication2.class, args);
	}
	@Bean	// classe com aspecto de execução. /* ele é externo, então bean */
	public CommandLineRunner run(ConversorJson conversor) throws Exception {
						// run permite a injeção
		return args -> {
				// json - simula o retorno da requisição
			String json = "{\"cep\": \"01001-000\",\"logradouro\": \"Praça da Sé\",\"localidade\": \"São Paulo\"}";
			ViaCepResponse response = conversor.converter(json);
						// resposta da conversão
			System.out.println("Dados do CEP: " + response);
		};
	}

}

