package org.zxl.springbootdemo.masterslavedb.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.zxl.springbootdemo.masterslavedb.entity.ZqhDiary;

import java.util.List;

/**
 * Created by 123456 on 2019/7/2.
 */
@Mapper
public interface ZqhDiaryMapper {
    @Insert("insert into zqh_diary (id,name,description) values(#{id},#{name},#{description})")
    int insert(ZqhDiary zqhDiary);

    @Update("update zqn_diary set name = #{name},description=#{description} where id = #{id}")
    int save(ZqhDiary zqhDiary);

    @Select("select * from zqh_diary")
    List<ZqhDiary> selectAll();

    String getToken(String appId);
}
