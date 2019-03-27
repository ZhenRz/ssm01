package com.hwua.serviceImpl;

import com.hwua.dao.UserDao;
import com.hwua.entity.User;
import com.hwua.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.InputStream;

//服务层
@Service
public class UserServiceImpl implements UserService{

    @Autowired//是报错的
     UserDao userDao;

    @Override
    public String selectUserByUsername(String user_name,String user_password){
        User user = userDao.selectUserByUsername(user_name);
        if (user == null){
            return "用户名不存在";
        }else if(user.getUser_password().equals(user_password)){
            return "登录成功";
        }else{
            return "密码错误";
        }
    }

    @Override
    @Transactional
    public int insertUser(User user) {
        int number = userDao.insertUser(user);
        return number;
    }

}
