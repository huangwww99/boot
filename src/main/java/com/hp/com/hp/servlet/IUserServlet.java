package com.hp.com.hp.servlet;

import com.hp.com.hp.pojo.User;

import java.util.List;

public interface IUserServlet {
    /**
     * 查询所有用户信息
     * @return
     */
    public List<User> userList ();

    /**
     * 修改用户信息
     * @param uId
     * @return
     */
    public User put(Integer uId);
}
