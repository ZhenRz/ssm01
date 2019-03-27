package com.hwua.dao;

import com.hwua.entity.User;

public interface UserDao {

    //根据用户名来查询用户
    public User selectUserByUsername(String user_name);
    //注册用户
    public int insertUser(User user);

}
