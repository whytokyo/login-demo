package com.yanxi.mapper;

import com.yanxi.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    User selectUserByUserName(@Param("userName") String username);
}
