package edu.tongji.comm.spring.demo.dao;

import edu.tongji.comm.spring.demo.domain.User;

/**
 * Created by chen on 2017/7/4.
 */
public interface UserDAO {
    User selectUser(int id);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int id);
}
