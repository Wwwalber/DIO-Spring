package com.dio.aplproperties;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class SistemaMensagem implements CommandLineRunner{
    // por expresssion
    @Value("${nome:NoReply}") // se não achar nome -> NoReply
    private String nome;
    @Value("${email}")
    private String email;
    @Value("${telefones}")
    private List<Long> telefones;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + nome
                + "\nE-mail:" + email
                + "\nCom telefones para contato: " + telefones);
        System.out.println("Seu cadastro foi aprovado");
    }

}
