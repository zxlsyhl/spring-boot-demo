package org.zxl.springbootdemo.shardsphere.jdbctest2.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.zxl.springbootdemo.shardsphere.jdbctest2.entity.User;

import java.util.List;

@Mapper
public interface UserRepository {
//    int insertUser(TUser user);
//    List<TUser> getUserList();

    Integer addUser(User user);

    List<User> list();

    List<User> selectUsersByLogId(@Param("logId") int logId);

    Integer updateUserById(@Param("id") int id, @Param("username") String username);

    Integer updateUserByUsername(@Param("username") String username, @Param("password") String password);
}

