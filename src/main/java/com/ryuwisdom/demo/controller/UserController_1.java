package com.ryuwisdom.demo.controller;

import com.ryuwisdom.demo.dto.UserDTO;
import com.ryuwisdom.demo.dto.UserDTO_1;
import com.ryuwisdom.demo.domain.User_1;
import com.ryuwisdom.demo.repository.UserRepository_1;
import com.ryuwisdom.demo.service.UserService_1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users_1")
public class UserController_1 {
    private final UserService_1 userService_1;

    @Autowired
    public UserController_1(UserService_1 userService_1) {
        this.userService_1 = userService_1;
    }

    @PostMapping
    public ResponseEntity<User_1> createUser(@RequestBody UserDTO_1 dto) {
        return ResponseEntity.ok(userService_1.createUser(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User_1> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(userService_1.getUserById(id));
    }

    @GetMapping
    public ResponseEntity<List<User_1>> getAllUsers() {
        return ResponseEntity.ok(userService_1.getAllUsers());
    }

    @PutMapping("/{id}")
    public ResponseEntity<User_1> updateUser(@PathVariable Long id, @RequestBody UserDTO_1 dto) {
        User_1 updated = userService_1.updateUser(id, dto);
        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<User_1> deleteUser(@PathVariable Long id) {
        userService_1.deleteUser(id);
        return ResponseEntity.ok().build();
    }
}
