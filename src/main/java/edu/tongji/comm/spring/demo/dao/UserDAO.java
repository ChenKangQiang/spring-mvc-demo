package edu.tongji.comm.spring.demo.dao;

import edu.tongji.comm.spring.demo.domain.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by chen on 2017/7/4.
 */

@Component
public interface UserDAO {

    User getUserById(int id);

    int addUser(User user);

    int deleteUserById(int id);

    int updateUser(User user);

}
