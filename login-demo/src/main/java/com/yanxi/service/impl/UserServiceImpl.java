package com.yanxi.service.impl;

import com.yanxi.mapper.UserMapper;
import com.yanxi.domain.User;
import com.yanxi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUserByUserName(String username) {
        return userMapper.selectUserByUserName(username);
    }
}
