package org.zxl.springbootdemo.shardsphere.jdbctest1.service;


import org.zxl.springbootdemo.shardsphere.jdbctest1.entity.TUser;

import java.util.List;

public interface UserService {

    int addUser(TUser user);

    List<TUser> list();
}
