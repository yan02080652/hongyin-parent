package com.hy.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hy.dao.UserDao;
import com.hy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Object login() {
        return userDao.findByPhoneAndState("18310222813","PER");
    }
}
