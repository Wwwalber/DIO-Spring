package com.dio.primeiros_passos.bevscomp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

@Component // i have access to  component font. Now i can inject it. Vai ser um componente na minh aplicação
public class ConversorJson {
    @Autowired
    private Gson gson; // anula new gson
    public ViaCepResponse converter(String json ){ // convert to json by Gson library
        ViaCepResponse response = gson.fromJson(json,ViaCepResponse.class);
        return response;
    }

    // mas e o @Component no Gson, já que é externo?
    
}