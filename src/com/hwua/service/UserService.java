package com.hwua.service;

import com.hwua.entity.User;

public interface UserService {
    public String selectUserByUsername(String user_name,String user_password);

    public int insertUser(User user);
}
