package com.amar.demo.mapper;

import com.amar.demo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    /**
     * 插入用户
     * @param user
     * @return
     */
    int insert(User user);

    /**
     * 查询所有用户
     * @return
     */
    List<User> selectUsers();
}
