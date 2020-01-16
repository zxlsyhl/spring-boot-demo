package org.zxl.springbootdemo.shardsphere.jdbctest3.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.zxl.springbootdemo.shardsphere.jdbctest3.entity.User;

import java.util.List;

@Component
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

