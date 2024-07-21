package dio.first_web_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.first_web_api.model.Usuario;
import dio.first_web_api.repository.UsuarioRepository;


@RestController
@RequestMapping("/users")
public class UsuarioController {  //será como um proxi, não terá regras de negócios
    
    @Autowired //injetado
    private UsuarioRepository repository;

    @GetMapping("") // retorna todos os usuarios
    public List<Usuario> getUsers(){
        return repository.findAll();
    }

    @GetMapping("/{username}") // usar parâmetro vindo da uri
    public Usuario getOne(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }

    @DeleteMapping("/{id}") // http só reliza no navegador gets, para deletar parâmetropreciso de um cliente http
    public void delete(@PathVariable("id") Integer id){ //
        repository.deleteById(id);
    }

    @PostMapping("")
    public void postUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }

}
