package edu.tongji.comm.spring.demo.service;

import edu.tongji.comm.spring.demo.dao.UserDAO;
import edu.tongji.comm.spring.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by chen on 2017/7/4.
 */

@Component
public class UserService {

    @Autowired
    private UserDAO userDAO;


    public User selectUser(int id) {

        return userDAO.getUserById(id);
    }

    public void addUser(User user) {

        userDAO.addUser(user);
    }

    public void updateUser(User user) {

        userDAO.updateUser(user);
    }

    public int deleteUser(int id) {

        return userDAO.deleteUserById(id);
    }


}
