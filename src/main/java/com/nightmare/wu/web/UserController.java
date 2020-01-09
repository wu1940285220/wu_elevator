package com.nightmare.wu.web;

import com.nightmare.wu.dao.UserDao;
import com.nightmare.wu.entity.User;
import com.nightmare.wu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Optional;

/**
 * @Author: WuChang
 * @Description:
 * @Date: Created in  2019-07-29 15:36
 * @Modified By:
 */
@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserService userService;

    /**
     * @method: findById
     * @description: 获取用户
     * @author: WuChang
     * @date: 2019-07-29 15:38
     */
    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        User user = userDao.findOne(id);
        return user;
    }

    /**
     * @method: saveUser
     * @description:保存用户
     * @author: WuChang
     * @date: 2020-01-09 14:54
     */
    @GetMapping("/saveUser")
    public User saveUser(){
        User user = new User();
        user.setAge(87);
        user.setBalance(new BigDecimal(20000));
        user.setName("畅");
        user.setUsername("吴");
        return userService.save(user);
    }
}
