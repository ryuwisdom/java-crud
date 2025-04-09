package com.ryuwisdom.demo.service;

import com.ryuwisdom.demo.dto.UserDTO_1;
import com.ryuwisdom.demo.domain.User_1;
import java.util.List;

public interface UserService_1 {
    User_1 createUser(UserDTO_1 dto);
    User_1 getUserById(Long id);
    List<User_1> getAllUsers();
    User_1 updateUser(Long id,UserDTO_1 dto);
    void deleteUser(Long id);

}
