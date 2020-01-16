package org.zxl.springbootdemo.shardsphere.jdbctest2.service;

import org.zxl.springbootdemo.shardsphere.jdbctest2.entity.TUser;
import org.zxl.springbootdemo.shardsphere.jdbctest2.entity.User;

import java.util.List;

public interface UserService {

    int addUser(TUser user);

    List<TUser> tUserList();
    List<TUser> getTUserByUser();

    Integer addUser(User user);

    List<User> list();

    List<User> selectUsersByLogId(int logId);

    Integer updateUserById(int id, String username);

    Integer updateUserByUsername(String username, String password);
}
