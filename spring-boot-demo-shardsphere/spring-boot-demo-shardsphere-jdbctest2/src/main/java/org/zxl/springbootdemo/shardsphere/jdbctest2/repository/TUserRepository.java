package org.zxl.springbootdemo.shardsphere.jdbctest2.repository;

import org.apache.ibatis.annotations.Mapper;
import org.zxl.springbootdemo.shardsphere.jdbctest2.entity.TUser;

import java.util.List;

@Mapper
public interface TUserRepository {
    int insertUser(TUser user);
    List<TUser> getUserList();
    List<TUser> getTUserByUser();
}

