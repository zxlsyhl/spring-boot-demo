package org.zxl.springbootdemo.shardsphere.jdbctest1.service;

import org.zxl.springbootdemo.shardsphere.jdbctest1.entity.UserInfoDetail;
import org.zxl.springbootdemo.shardsphere.jdbctest1.entity.UserLog;

import java.util.List;

public interface UserLogService {

    Integer addUserLog(UserLog user);

    List<UserLog> userLoglist();

    List<UserInfoDetail> userInfoDetail();
}
