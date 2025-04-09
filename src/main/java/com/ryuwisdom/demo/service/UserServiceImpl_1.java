package com.ryuwisdom.demo.service;

import com.ryuwisdom.demo.domain.User_1;
import com.ryuwisdom.demo.dto.UserDTO_1;
import com.ryuwisdom.demo.repository.UserRepository;
import com.ryuwisdom.demo.repository.UserRepository_1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl_1 implements UserService_1 {

    private final UserRepository_1 userRepository_1;

    @Autowired
    public UserServiceImpl_1(UserRepository_1 userRepository_1) {
        this.userRepository_1 = userRepository_1;
    }

    @Override
    public User_1 createUser(UserDTO_1 dto) {
        User_1 user = new User_1();
        user.setUsername(dto.getUsername());
        user.setEmail(dto.getEmail());
        return userRepository_1.save(user);
    }

    @Override
    public List<User_1> getAllUsers() {
        return userRepository_1.findAll();
    }

    @Override
    public User_1 updateUser(Long id, UserDTO_1 dto) {
        Optional<User_1> optionalUser1 = userRepository_1.findById(id);
        if(optionalUser1.isPresent()) {
            User_1 user = optionalUser1.get();
            user.setUsername(dto.getUsername());
            user.setEmail(dto.getEmail());
            return userRepository_1.save(user);
        } else {
            return null;
        }
    }

    @Override
    public void deleteUser(Long id) {
        userRepository_1.deleteById(id);
    }

    @Override
    public User_1 getUserById(Long id) {
        return userRepository_1.findById(id).orElse(null);
    }
}
