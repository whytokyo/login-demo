package com.yanxi;

import com.yanxi.domain.User;
import com.yanxi.domain.model.LoginUser;
import com.yanxi.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class LoginDemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Resource
    private AuthenticationManager authenticationManager;

    private String username = "admin";

    private String password = "123456";

    @Test
    void contextLoads() {
//        User user = userMapper.selectUserByUserName("admin");
        Authentication authentication = null;
        authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
//        User user = (User) authentication.getPrincipal();
        LoginUser loginUser = (LoginUser) authentication.getPrincipal();
        System.out.println(loginUser);
    }


}
