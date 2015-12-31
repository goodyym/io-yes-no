package com.good.impl;


import com.good.mapper.UserLoginMapper;
import com.good.model.User;
import com.good.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * LoginServiceImpl
 *
 * @Description: uuuuuuuuuuuuuuuuu
 * @Author: tretert
 * @Time:1
 */
@Service
public class UserLoginServiceImpl implements UserLoginService {

    @Autowired
    UserLoginMapper userLoginMapper;

    public User getUserByName(String username){
        return userLoginMapper.getUserByName(User.tableName,username);
    }
}
