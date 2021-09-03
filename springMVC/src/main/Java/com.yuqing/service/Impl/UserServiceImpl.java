package com.yuqing.service.Impl;

import com.yuqing.dao.UserDao;
import com.yuqing.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    @Override
    public void save() {
        userDao.save();
    }

    @Override
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
