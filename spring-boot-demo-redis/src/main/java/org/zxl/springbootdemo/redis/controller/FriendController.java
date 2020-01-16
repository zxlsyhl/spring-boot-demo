package org.zxl.springbootdemo.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.zxl.springbootdemo.redis.entity.Friend;
import org.zxl.springbootdemo.redis.service.FriendService;

/**
 * @author zhangxiaolong
 * @ClassName FriendController
 * @Description TODO
 * @Date 2019/3/14 17:46
 * @Version 1.0
 **/
@RestController
public class FriendController {
    @Autowired
    private FriendService friendService;

    @GetMapping("/findFriend")
    public Friend findFriend(@RequestParam Long frId){
        return friendService.findFriend(frId);
    }
}
