package com.yuqing.service;

import com.yuqing.dao.UserDao;

public interface UserService {
    public void save();
    public void setUserDao(UserDao userDao);
}
