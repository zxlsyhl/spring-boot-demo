package org.zxl.springbootdemo.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zxl.springbootdemo.security.entity.UserInfo;
import org.zxl.springbootdemo.security.repository.UserInfoRepository;

import java.util.List;

@RestController
public class SecurityController {
    @GetMapping("/hello1")
    @PreAuthorize("hasAnyRole('first')") //设置方法的角色
    public String hello1(){
        return "hello spring security";
    }

    @GetMapping("/hello2")
    @PreAuthorize("hasAnyRole('second')")
    public String hello2(){
        return "hello spring security";
    }

    @GetMapping("/hello3")
    @PreAuthorize("hasAnyRole('third')")
    public String hello3(){
        return "hello spring security";
    }

    @Autowired
    private UserInfoRepository userInfoRepository;


    @GetMapping("/getUserInfos")
    @PreAuthorize("hasAnyRole('first')")
    public List<UserInfo> getUserInfos(){
        List<UserInfo> userInfos = userInfoRepository.findAll();
        return userInfos;
    }
}
