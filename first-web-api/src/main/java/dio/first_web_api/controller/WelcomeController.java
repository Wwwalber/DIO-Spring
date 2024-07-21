package dio.first_web_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // informa que é um component rest /* geralmente teremos vários controllers */
public class WelcomeController {

    // informa que é um recurso http
    @GetMapping
    public String welcome() { 
        return "Welcome to my first Spring Boot Web API";
    }
}
