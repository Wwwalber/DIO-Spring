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
        System.out.println(techTeam);// aqui é injetado que o remetente é o techTeam.
                    /* por ser nesse caso usado como singleton, vai ser usada a mesma 
                    referência . noreply e techTeam  vão usar a mesma referência 
                    a não ser que eu mude no beans para prototype */
        System.out.println("Bem-vindo à Tech Elite");
    }
}
