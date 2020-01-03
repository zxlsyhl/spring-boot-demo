package org.zxl.springbootdemo.masterslavedb.service;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.zxl.springbootdemo.masterslavedb.entity.ZqhDiary;

import java.util.List;

/**
 * Created by 123456 on 2019/6/30.
 */
public interface ZqhDiaryService {
    int insert(ZqhDiary zqhDiary);

    int save(ZqhDiary zqhDiary);

    List<ZqhDiary> selectAll();

    String getToken(String appId);
}
