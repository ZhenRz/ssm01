package com.hwua.controller;

import com.hwua.entity.User;
import com.hwua.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

//控制层
@Controller
@RequestMapping("/user")
public class UserController {
    public UserController(){
        System.out.println("UserController -------------------------------");
    }
    @Autowired
    UserService userService;
    @RequestMapping(value = "/login",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String login(String user_name, String user_password,
                        String auth, HttpSession hs){
        //从会话中获取随机数
        String rand = (String)hs.getAttribute("rand");
        if (rand.equalsIgnoreCase(auth)){
            String info = userService.selectUserByUsername(user_name,user_password);
            if (info.equals("登录成功")){
                hs.setAttribute("user_name",user_name);
            }
            return info;
        }else{
            return "验证码错误";
        }




    }
    @RequestMapping(value = "/register",produces = "text/html;charset=UTF-8")
    @Transactional
    public String register(String userName,String passWord,Integer sex,String birthday,String identity,String email,String mobile,String address) {
        User user = new User(null, userName, passWord, sex, birthday, identity, email, mobile, address);
        int number = userService.insertUser(user);
        if (number == 1) {
            return "index";
        } else {
            return "register";
        }
    }
    @RequestMapping(value = "/logout",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String logout(HttpSession hs){
        hs.setAttribute("user_name",null);
        //hs.removeAttribute("user_name");
        return "注销成功";
    }
}
