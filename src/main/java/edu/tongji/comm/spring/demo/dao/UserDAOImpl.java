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
        user.setUsername("Tom");
        user.setPassword("123456");
        return user;
    }

    public void addUser(User user) {

    }

    public void updateUser(User user) {

    }

    public void deleteUser(int id) {

    }
}
