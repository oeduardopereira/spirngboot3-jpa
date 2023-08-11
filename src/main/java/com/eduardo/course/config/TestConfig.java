package com.eduardo.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.eduardo.course.enteties.User;
import com.eduardo.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        
        User user1 = new User(null, "Carlos", "carlos@gmail.com", "23432234", "senha123");
        User user2 = new User(null, "Celma", "celminha@gmail.com", "78975674", "senha123");

        userRepository.saveAll(Arrays.asList(user1, user2));
    }
}
