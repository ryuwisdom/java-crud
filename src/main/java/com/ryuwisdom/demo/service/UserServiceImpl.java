package com.ryuwisdom.demo.service;

import com.ryuwisdom.demo.domain.User;
import com.ryuwisdom.demo.dto.UserDTO;
import com.ryuwisdom.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired // 생성자 주입
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    @Override
//    public User createUser(UserDTO userDTO) {
//        User user = new User();
//        user.setName(userDTO.getUsername());
//        user.setEmail(userDTO.getEmail());
//        // 필요한 필드 설정
//
//        return userRepository.save(user);
//    }
//
//    @Override
//    public User getUserById(Long id) {
//        Optional<User> user = userRepository.findById(id);
//        return user.orElse(null);
//    }

    @Override
    public User createUser(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
//        Optional<User> userOpt = userRepository.findById(id);
//        if (userOpt.isPresent()) {
//            User user = userOpt.get();
//            return new UserDTO(user.getName(), user.getEmail());
//        } else {
//            return null;
//        }
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(Long id, UserDTO userDTO) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setName(userDTO.getUsername());
            user.setEmail(userDTO.getEmail());
            return userRepository.save(user);
        } else {
            return null;
        }
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
