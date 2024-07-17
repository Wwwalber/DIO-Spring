package com.dio.primeiros_passos.singlprototy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {
    @Bean /* vai ser criado 1 vez para a execução */
    @Scope("prototype")
    public Remetente remetente() {
        System.out.println("CRIANDO OBJETO REMETENTE");
        Remetente remetente = new Remetente();
        remetente.setEmail("noreply@dio.com");
        remetente.setNome("Digital Inovation One");
        return remetente;
    }
}
