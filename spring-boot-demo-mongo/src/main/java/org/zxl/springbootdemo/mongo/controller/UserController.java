package org.zxl.springbootdemo.mongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.zxl.springbootdemo.mongo.entity.User;
import org.zxl.springbootdemo.mongo.repository.UserRepository;

/**
 * Created by 123456 on 2019/3/24.
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/addUser")
    public String addUser(@RequestParam Long id, @RequestParam String userName, @RequestParam String passWord) {
        User user = new User();
        user.setId(id);
        user.setUserName(userName);
        user.setPassWord(passWord);
        userRepository.saveUser(user);
        return "0000";
    }

    /**
     * 根据用户名查询对象
     * @param userName
     * @return
     */
    @GetMapping("/findUserByUserName")
    public User findUserByUserName(@RequestParam String userName) {
        User user = userRepository.findUserByUserName(userName);
        return user;
    }
}
