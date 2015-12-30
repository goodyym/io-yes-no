package com.good.impl;


import com.good.mapper.LoginMapper;
import com.good.model.User;
import com.good.service.LoginService1;
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
public class LoginServiceImpl implements LoginService1 {

    @Autowired
    LoginMapper loginMapper;

    public User getUserByName(String username){
        return loginMapper.getUserByName(User.tableName,username);
    }
}
