package com.amar.demo.service;

import com.amar.demo.entity.User;
import com.amar.demo.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dingmx
 * @date 2018/12/1 11:10
 */

@Service
public class UserService {

    @Autowired(required = false)
    UserMapper userMapper;

    public int addUser(User user) {
        return userMapper.insert(user);
    }

    /*
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    public PageInfo<User> findAllUser(int pageNum, int pageSize) {
        /*if(pageNum < 2) {
            throw new BusinessException("pageNum small");
        }*/
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<User> userList = userMapper.selectUsers();
        PageInfo result = new PageInfo(userList);
        return result;
    }
}
