package com.yjxxt.dao;

import com.yjxxt.po.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public interface UserMapper {
    User queryUserByUserId(Integer userId);
}
