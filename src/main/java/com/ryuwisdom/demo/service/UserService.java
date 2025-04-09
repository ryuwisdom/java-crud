package com.ryuwisdom.demo.service;

import com.ryuwisdom.demo.dto.UserDTO;
import com.ryuwisdom.demo.domain.User;
import java.util.List;

public interface UserService {
    // User가 이유는 실제 DB저장되는 객체(=엔티티)
    User createUser(UserDTO userDTO);
    User getUserById(Long id);
    List<User> getAllUsers();
    User updateUser(Long id,UserDTO userDTO);
    void deleteUser(Long id);
}
