package com.hp.com.hp.controller;

import com.hp.com.hp.pojo.User;
import com.hp.com.hp.servlet.IUserServlet;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping("user")
@Controller
public class UserController {
    @Resource
    private IUserServlet userServlet;
    @RequestMapping(value = "user")
    public String userList(HttpServletRequest request){
        List<User> users = userServlet.userList();
        request.setAttribute("userList" ,users);
        return "main";
    }
    @RequestMapping(value = "/put")
    public String put(Integer uId,HttpServletRequest request){
        User user = userServlet.put(uId);
        request.setAttribute("user" , user);
        return "putUser";
    }
    @RequestMapping(value = "/putId")
    public String putId(String uRealName){
        System.out.println(uRealName);
        return "redirect:/user/user";
    }

}
