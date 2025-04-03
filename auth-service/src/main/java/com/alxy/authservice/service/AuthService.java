package com.alxy.authservice.service;

import com.alxy.authservice.dto.ClientDTO;
import com.alxy.authservice.dto.Request;
import com.alxy.authservice.dto.Result;

/**
 * @author 李尚奇
 * @date 2025/4/2
 */

/**
 * * @author 李尚奇
 * * @date 2025/4/2
 */
public interface AuthService {


    public Result<?> loginWithPassword(String phoneNumber, String password);

    public Result<?> loginWithOAuth2(String oauthCode, String provider);

    public Result<?> createUser(ClientDTO request);
}