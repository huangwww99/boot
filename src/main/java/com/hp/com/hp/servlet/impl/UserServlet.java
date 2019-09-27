package com.hp.com.hp.servlet.impl;

import com.hp.com.hp.mapper.UserMapper;
import com.hp.com.hp.pojo.User;
import com.hp.com.hp.servlet.IUserServlet;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServlet implements IUserServlet {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> userList() {
        return  userMapper.userList();
    }
    /**
     * 修改用户信息
     * @param uId
     * @return
     */
    public User put(Integer uId){
        System.out.println(uId);
        return userMapper.put(uId);
    }
}
