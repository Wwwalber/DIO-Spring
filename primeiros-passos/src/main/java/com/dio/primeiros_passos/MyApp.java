package com.dio.primeiros_passos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {

    private Calculadora calculadora; // informo que vou precisar disso

    @Override
    public void run(String... args) throws Exception {
        Calculadora calculadora = new Calculadora();
        System.out.println("O resultado é "+ calculadora.somar(2,7));
    }
}
