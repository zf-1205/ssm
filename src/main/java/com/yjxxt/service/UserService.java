package com.yjxxt.service;

import com.yjxxt.dao.UserMapper;
import com.yjxxt.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User queryUserByUserId(Integer userId){
        return userMapper.queryUserByUserId(userId);
    }
}
