package edu.tongji.comm.spring.demo.dao;

import edu.tongji.comm.spring.demo.domain.User;
import org.springframework.stereotype.Component;

/**
 * Created by chen on 2017/7/4.
 */

public class UserDAOImpl implements UserDAO {

    public User selectUser(int id) {
        User user = new User();
        user.setId(id);
        user.setAge(26);
        user.setUsername("Tom");
        user.setEmail("tom@meituan.com");
        return user;
    }

    public void addUser(User user) {

    }

    public void updateUser(User user) {

    }

    public void deleteUser(int id) {

    }
}
