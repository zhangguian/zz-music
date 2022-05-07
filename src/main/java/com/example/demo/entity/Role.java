package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Entity;

/**
 * @author zhangguian
 * @description role
 * @date 2022/5/7
 */
@Entity
@Data
public class Role extends AbstractEntity{
    private String name;

    private String title;
}
