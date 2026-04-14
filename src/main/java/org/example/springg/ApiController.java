package org.example.springg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello backend";
    }
    @GetMapping("/user")
    public User user(){
        return new User("Ilya", 20);
    }
}
