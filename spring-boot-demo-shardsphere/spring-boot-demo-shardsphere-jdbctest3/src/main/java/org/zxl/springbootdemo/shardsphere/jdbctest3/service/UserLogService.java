package org.zxl.springbootdemo.shardsphere.jdbctest3.service;

import org.zxl.springbootdemo.shardsphere.jdbctest3.entity.UserLog;

import java.util.List;

public interface UserLogService {

    Integer addUserLog(UserLog user);

    List<UserLog> userLoglist();
}
