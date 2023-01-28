package com.yanxi.domain;

import lombok.Data;

@Data
public class User extends CommonEntity{
    private int userId;
    private int deptId;
    private String userName;
    private String nickName;
    private String password;
}
