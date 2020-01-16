package org.zxl.springbootdemo.shardsphere.jdbctest1.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.zxl.springbootdemo.shardsphere.jdbctest1.entity.UserInfoDetail;
import org.zxl.springbootdemo.shardsphere.jdbctest1.entity.UserLog;

import java.util.List;

@Component
@Mapper
public interface UserLogRepository {
    Integer addUserLog(UserLog user);

    List<UserLog> userLoglist();

    List<UserInfoDetail> userInfoDetail();
}

