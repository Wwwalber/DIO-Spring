package com.dio.primeiros_passos.bevscomp;

import org.springframework.context.annotation.Bean;

import com.google.gson.Gson;

public class Beans {  
    @Bean // agora pose ser injetado em qualquer parte da aplicação
    public Gson gson(){
        return new Gson();
    }
}
