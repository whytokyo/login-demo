package com.yanxi.controller;

import com.yanxi.common.model.dto.ResponseResult;
import com.yanxi.domain.model.LoginBody;
import com.yanxi.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController

public class LoginController {
    @Autowired
    private LoginService loginService;


    @PostMapping(value = "/login")
    public ResponseResult login(@RequestBody LoginBody loginBody) {
        String token = loginService.login(loginBody.getUsername(), loginBody.getPassword());
        Map<String, Object> result = new HashMap<>();
        result.put("token", token);
        return ResponseResult.okResult(result);
    }
}
