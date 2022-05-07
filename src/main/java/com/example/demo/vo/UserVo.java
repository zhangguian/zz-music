package com.example.demo.vo;

import lombok.Data;

import java.util.List;

/**
 * @author zhangguian
 * @description UserVo
 * @date 2022/5/7
 */
@Data
public class UserVo {
    private String id;
    private String username;

    private String nickname;

    private List<RoleVo> roles;
}
