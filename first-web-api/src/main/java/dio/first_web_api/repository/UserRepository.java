package dio.first_web_api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.first_web_api.model.Usuario;

@Repository // essa classe é um componente
public class UserRepository {
    public void save(Usuario usuario){
        if (usuario.getId()==null){
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        } else {
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        }
        System.out.println(usuario);
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para"+
        "excluir um usuário", id));
        System.out.println(id);
    }

    public List<Usuario> findAll() {
        System.out.println("LIST -  Listando os usários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        // usuarios fake
        usuarios.add(new Usuario("gleyson","password"));
        usuarios.add(new Usuario("frank","masterpass"));
        return usuarios;    
    }

    public Usuario findById(Integer id) {
        System.out.println(String.format("FIND/id - Recebendo o id: %d para"+
        "localizar um usuário", id));
        // return fake
        return new Usuario("gleyson","password");
    }

    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o usernamae: %s para localizar um usuário", username));
        // return fake
        return new Usuario("gleyson","password");
    }
}
