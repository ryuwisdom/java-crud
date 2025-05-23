package com.ryuwisdom.demo.repository;

import com.ryuwisdom.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}