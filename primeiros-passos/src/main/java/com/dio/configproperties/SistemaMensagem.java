package com.dio.configproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner{

    @Autowired     // para não dar new
    private Remetente remetente;

    @Override
    public void run(String... args) throws Exception {


        System.out.println("Mensagem enviada por: " + remetente.getNome()
                + "\nE-mail:" + remetente.getEmail()
                + "\nCom telefones para contato: " + remetente.getTelefones());
        }

}