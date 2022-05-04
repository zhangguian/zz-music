package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangguian
 * @description defaultController
 * @date 2022/4/29
 */

@RestController
@RequestMapping("/hello")
@CrossOrigin
public class DefaultController {
    @GetMapping
    public String sayHello() {
        return "欢迎程序员ANJING的音乐盒";
    }
}
