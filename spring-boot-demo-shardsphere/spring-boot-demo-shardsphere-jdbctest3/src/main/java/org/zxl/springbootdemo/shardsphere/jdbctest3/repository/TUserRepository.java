package org.zxl.springbootdemo.shardsphere.jdbctest3.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.zxl.springbootdemo.shardsphere.jdbctest3.entity.TUser;

import java.util.List;

@Component
@Mapper
public interface TUserRepository {
    int insertUser(TUser user);
    void addTUser2();
    List<TUser> getUserList();
    List<TUser> getTUserByUser();
}

