package org.zxl.springbootdemo.redis.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.zxl.springbootdemo.redis.entity.Friend;

/**
 * @author zhangxiaolong
 * @ClassName FriendMapper
 * @Description TODO
 * @Date 2019/3/14 17:35
 * @Version 1.0
 **/
@Mapper
public interface FriendMapper {
    @Select("select * from t_friend where fr_id = #{frId}")
    Friend findFriend(@Param("frId") Long frId);
}
