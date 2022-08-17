package com.xbrain.project.resources;

import com.xbrain.project.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Gabriel", "gabriel@gmail.com", "9999-9999", "321");
        return ResponseEntity.ok().body(u);
    }
}
