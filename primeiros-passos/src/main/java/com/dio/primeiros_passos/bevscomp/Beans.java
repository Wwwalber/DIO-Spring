package com.dio.primeiros_passos.bevscomp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.gson.Gson;
@Configuration
public class Beans {  
    @Bean // agora pose ser injetado em qualquer parte da aplicação
    public Gson gson(){
        return new Gson();
    }
}
