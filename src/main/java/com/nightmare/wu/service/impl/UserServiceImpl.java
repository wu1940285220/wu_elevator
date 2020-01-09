package com.nightmare.wu.service.impl;

import com.nightmare.wu.dao.UserDao;
import com.nightmare.wu.entity.User;
import com.nightmare.wu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: WuChang
 * @Description:
 * @Date: Created in  2020-01-09 14:33
 * @Modified By:
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public User save(User user) {
        return userDao.save(user);
    }
}
