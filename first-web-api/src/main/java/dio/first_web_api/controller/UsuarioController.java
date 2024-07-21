package dio.first_web_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import dio.first_web_api.model.Usuario;
import dio.first_web_api.repository.UsuarioRepository;

@RestController
public class UsuarioController {  //será como um proxi, não terá regras de negócios
    
    @Autowired //injetado
    private UsuarioRepository repository;

    @GetMapping("/users") // retorna todos os usuarios
    public List<Usuario> getUsers(){
        return repository.findAll();
    }

    @GetMapping("/users/{username}") // usar parâmetro vindo da uri
    public Usuario getOne(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }
}
