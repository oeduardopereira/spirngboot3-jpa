package com.eduardo.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduardo.course.enteties.User;

@RestController
@RequestMapping(value = "/users")
public class UserResourcer {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Maria", "maria@gmail.com", "9234243", "senha123");
        return ResponseEntity.ok().body(u);
    }
}
