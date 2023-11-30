package com.pedrocavalero.jugvale2023.mvctest;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public String hello() {
    	return "Hello World";
    }
    
    @GetMapping("/{id}")
    public User handleRequest(@PathVariable String id) {

        Optional<User> user = userRepository.findById(id);
        return user.orElse(new User("Pedro"));
    }
}