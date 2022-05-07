package com.example.demo.repository;

import com.example.demo.entity.User;
import com.example.demo.enums.Gender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author zhangguian
 * @description
 * @date 2022/5/6
 */
@SpringBootTest
class UserRepositoryTest {
    @Autowired
    UserRepository repository;
    @Test
    void findByUsername() {
        User user = new User();

        user.setUsername("zhangguian");
        user.setNickname("ANJING");
        user.setEnabled(true);
        user.setLocked(false);
        user.setPassword("1542");
        user.setGender(Gender.MALE);
        user.setLastLoginIp("127.0.0.1");
        user.setLastLoginTime(new Date());

        User saveUser = repository.save(user);
        User result = repository.getByUsername("zhangguian");
        System.out.println((saveUser.toString()));
        System.out.println((result.toString()));
    }
}