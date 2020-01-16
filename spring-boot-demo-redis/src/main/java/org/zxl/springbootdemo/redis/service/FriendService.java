package org.zxl.springbootdemo.redis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.zxl.springbootdemo.redis.dao.FriendMapper;
import org.zxl.springbootdemo.redis.entity.Friend;

/**
 * @author zhangxiaolong
 * @ClassName FriendService
 * @Description
 * @Date 2019/3/14 17:37
 * @Version 1.0
 **/
@Service
public class FriendService {
    @Autowired
    private FriendMapper friendMapper;

    @Cacheable(cacheNames = "friend", key = "#frId.toString()")
    public Friend findFriend(Long frId){
        return friendMapper.findFriend(frId);
    }

}
