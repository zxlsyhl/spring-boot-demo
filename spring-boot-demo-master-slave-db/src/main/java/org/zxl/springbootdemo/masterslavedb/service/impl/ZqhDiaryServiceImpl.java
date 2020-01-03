package org.zxl.springbootdemo.masterslavedb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zxl.springbootdemo.masterslavedb.Master.Master;
import org.zxl.springbootdemo.masterslavedb.entity.ZqhDiary;
import org.zxl.springbootdemo.masterslavedb.mapper.ZqhDiaryMapper;
import org.zxl.springbootdemo.masterslavedb.service.ZqhDiaryService;

import java.util.List;

/**
 * Created by 123456 on 2019/6/30.
 */
@Service
public class ZqhDiaryServiceImpl implements ZqhDiaryService {
    @Autowired
    private ZqhDiaryMapper zqhDiaryMapper;

    @Transactional
    @Override
    public int insert(ZqhDiary zqhDiary) {
        return zqhDiaryMapper.insert(zqhDiary);
    }

    @Master
    @Override
    public int save(ZqhDiary zqhDiary) {
        return zqhDiaryMapper.insert(zqhDiary);
    }

    @Override
    public List<ZqhDiary> selectAll() {
        return zqhDiaryMapper.selectAll();
    }

    @Master
    @Override
    public String getToken(String appId) {
        //  有些读操作必须读主数据库
        //  比如，获取微信access_token，因为高峰时期主从同步可能延迟
        //  这种情况下就必须强制从主数据读
        return null;
    }
}
