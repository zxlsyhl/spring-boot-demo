package org.zxl.springbootdemo.shardsphere.jdbctest1.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.zxl.springbootdemo.shardsphere.jdbctest1.entity.TUser;
import org.zxl.springbootdemo.shardsphere.jdbctest1.util.MyMapper;

@Mapper
@Component
public interface UserRepository extends MyMapper<TUser> {

}

