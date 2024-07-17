package com.dio.primeiros_passos.singlprototy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {
    /* tenho dois remetentes */ 
    /* mas como singleton */
    /* as variáveis estão apontando para mesma referência */
    @Autowired
    private Remetente noreply;
    @Autowired
    private Remetente techTeam;

    public void enviarConfirmacaoCadastro(){
        System.out.println(noreply); // aqui é injetado que o remetente é o noreply
        System.out.println("Seu cadastro foi aprovado");
    }

    public void enviarMensagemBoasVindas(){
        techTeam.setEmail("tech@dio.com.br");
        System.out.println(techTeam);// aqui é injetado que o remetente é o techTeam
        System.out.println("Bem-vindo à Tech Elite");
    }
}
