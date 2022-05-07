package com.example.demo.dto;

import com.example.demo.vo.RoleVo;
import lombok.Data;

import java.util.List;

/**
 * @author zhangguian
 * @description UserDto
 * @date 2022/5/7
 */
@Data
public class UserDto {
    private String id;
    private String username;

    private String nickname;

    private List<RoleVo> roles;
}
