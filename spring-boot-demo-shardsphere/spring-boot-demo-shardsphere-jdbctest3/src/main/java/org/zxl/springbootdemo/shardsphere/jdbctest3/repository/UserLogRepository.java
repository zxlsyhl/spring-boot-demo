package org.zxl.springbootdemo.shardsphere.jdbctest3.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.zxl.springbootdemo.shardsphere.jdbctest3.entity.UserLog;

import java.util.List;

@Component
@Mapper
public interface UserLogRepository {
    Integer addUserLog(UserLog user);

    List<UserLog> userLoglist();

}

