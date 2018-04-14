package com.skillsup.services.impl;

import com.skillsup.DAO.repo.UserDAO;
import com.skillsup.services.DTO.UserDTO;
import com.skillsup.services.UserServices;
import com.skillsup.services.convert.UserConvert;

public class UserServiceImpl implements UserServices{
    private final UserDAO userDao;
    private final UserConvert userConvert;
    public UserServiceImpl(UserDAO userDao,UserConvert userConvert) {
        this.userDao = userDao;
        this.userConvert = userConvert;
    }

    @Override
    public void create(UserDTO user) {

        userDao.create(userConvert.toEntity(user));
    }
}
