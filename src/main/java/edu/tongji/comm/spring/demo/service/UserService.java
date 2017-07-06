package edu.tongji.comm.spring.demo.service;

import edu.tongji.comm.spring.demo.dao.UserDAO;
import edu.tongji.comm.spring.demo.dao.UserDAOImpl;
import edu.tongji.comm.spring.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by chen on 2017/7/4.
 */

public class UserService {

//    @Autowired
    private UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }


    public User selectUser(int id) {
       return userDAO.selectUser(id);
    }

    public void addUser(User user) {
        userDAO.addUser(user);
    }

    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }


}
