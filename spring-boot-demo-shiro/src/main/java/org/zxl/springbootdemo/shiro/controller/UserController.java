package org.zxl.springbootdemo.shiro.controller;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zxl.springbootdemo.shiro.entity.User;

/**
 * @author zhangxiaolong
 * @ClassName UserController
 * @Description TODO
 * @Date 2019/3/16 12:32
 * @Version 1.0
 **/
@RestController
@RequiresRoles("user")
public class UserController {
    private int userId = 0;
    private int userAge = 10;
    @GetMapping("/getUser")
    public User getUser(String userName){
        userId++;
        userAge++;
        return new User(userId,userName,userAge);
    }

    @GetMapping("/get")
    public int get(){
        return userId;
    }
}
