package com.nightmare.wu.dao;

import com.nightmare.wu.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: WuChang
 * @Description:
 * @Date: Created in  2019-07-29 15:34
 * @Modified By:
 */
@Repository
public interface UserDao extends JpaRepository<User,Long> {

    @Override
    User save(User user);
}
