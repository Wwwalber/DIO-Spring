package dio.spring_jpa.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.spring_jpa.model.User;

@Component // para injetar sem new
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
     
      //List<User> users = repository.filtrarPorNome("WALBER");
      List<User> users = repository.findByNameContaining("WALBER");

        for(User u: users){
            System.out.println(u);
        }
        //insertUser();
    
    }
    private void insertUser(){
        User user = new User();
        user.setName("WALBER");
        user.setUsername("wwwalber");
        user.setPassword("123");
        repository.save(user);

        User user2 = new User();
        user2.setName("WALBER COSTA");
        user2.setUsername("wwwalber");
        user2.setPassword("123");
        repository.save(user2);

        User user3 = new User();
        user3.setName("WALBER OLIVEIRA");
        user3.setUsername("walber3");
        user3.setPassword("oliveira");
        repository.save(user3);

        for (User u: repository.findAll()){
            System.out.println(u);
        }
    }
}
