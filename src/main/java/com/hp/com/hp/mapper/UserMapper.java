package com.hp.com.hp.mapper;
import com.hp.com.hp.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user")
    public List<User> userList ();
    /**
     * 修改用户信息
     * @param uId
     * @return
     */
    @Results({@Result(property = "uId", column = "uId")})
    @Select("select * from user where uId=#{uId}")
    public User put(@Param("uId") Integer uId);
}

