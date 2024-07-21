package dio.spring_jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import dio.spring_jpa.model.User;


public interface UserRepository extends JpaRepository<User, Integer> {

    // query method
    
    List<User> findByNameContaining(String name);

    // method with custom query
    User findByUsername(String username);

    // Query Override
    @Query("SELECT u FROM User u WHERE u.name LIKE %:name%")
    List<User> filtrarPorNome(@Param("name") String name);
}
