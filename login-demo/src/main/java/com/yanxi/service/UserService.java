package com.yanxi.service;

import com.yanxi.domain.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author BlueFire
 * @since 2021-03-21
 */
public interface UserService {

    //通过用户名查询用户信息
    public User selectUserByUserName(String username);


}
