package org.zxl.springbootdemo.shardsphere.jdbctest3.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zxl.springbootdemo.shardsphere.jdbctest3.entity.UserLog;
import org.zxl.springbootdemo.shardsphere.jdbctest3.repository.UserLogRepository;
import org.zxl.springbootdemo.shardsphere.jdbctest3.service.UserLogService;

import java.util.List;

@Service
public class UserLogServiceImpl implements UserLogService {
    @Autowired
    UserLogRepository userLogRepository;

    @Override
    public Integer addUserLog(UserLog userLog) {
        return userLogRepository.addUserLog(userLog);
    }

    @Override
    public List<UserLog> userLoglist() {
        return userLogRepository.userLoglist();
    }
}
