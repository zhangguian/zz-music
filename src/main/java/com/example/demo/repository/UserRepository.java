package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author zhangguian
 * @description
 * @date 2022/5/6
 */
public interface UserRepository extends JpaRepository<User, String> {
    List<User> findByUsername(String username);
    User getByUsername(String username);
}
