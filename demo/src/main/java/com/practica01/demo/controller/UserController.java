package com.practica01.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practica01.demo.models.User;
import com.practica01.demo.service.UserService;


@RestController
@RequestMapping("/api/users")
public class UserController {
    
    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity<User[]> getAllUsers() {
        return ResponseEntity.ok(userService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable int id) {

        User user = userService.findById(id);

        if (user == null) {
            return ResponseEntity
                    .status(404)
                    .body("uauario no encontrado");
        }

        return ResponseEntity.ok(user);
    }

}
