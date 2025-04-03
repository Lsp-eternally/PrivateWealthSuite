package com.alxy.authservice.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @author 李尚奇
 * @date 2025/4/2
 */
@Data
public class Request {
    @NotBlank(message = "手机号不能为空")
    private String phoneNumber;

    @NotBlank(message = "密码不能为空")
    private String password;

    private String Name;

    private String email;

}