package org.zxl.springbootdemo.shardsphere.jdbctest3.service;


import org.zxl.springbootdemo.shardsphere.jdbctest3.entity.TUser;
import org.zxl.springbootdemo.shardsphere.jdbctest3.entity.User;

import java.util.List;

public interface UserService {

    int addUser(TUser user);

    void addTwoTUser();
    void addTUser2();
    List<TUser> tUserList();
    List<TUser> getTUserByUser();

    Integer addUser(User user);

    List<User> list();

    List<User> selectUsersByLogId(int logId);

    Integer updateUserById(int id, String username);

    Integer updateUserByUsername(String username, String password);
}
