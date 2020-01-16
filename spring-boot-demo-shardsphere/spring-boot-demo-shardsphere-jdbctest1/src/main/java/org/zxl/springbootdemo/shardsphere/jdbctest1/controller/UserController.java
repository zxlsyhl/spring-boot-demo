package org.zxl.springbootdemo.shardsphere.jdbctest1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.zxl.springbootdemo.shardsphere.jdbctest1.entity.TUser;
import org.zxl.springbootdemo.shardsphere.jdbctest1.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public Object list() {
        return userService.list();
    }

    @PostMapping("/add")
    public Object add(@RequestBody TUser user) {
        return userService.addUser(user);
    }
}
