package org.zxl.springbootdemo.shiro.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zxl.springbootdemo.shiro.util.Result;
import org.zxl.springbootdemo.shiro.util.ResultGenerator;

import java.util.UUID;

/**
 * @author zhangxiaolong
 * @ClassName LoginController
 * @Description TODO
 * @Date 2019/3/16 11:20
 * @Version 1.0
 **/
@RestController
public class LoginController {
    @PostMapping("/doLogin")
    public Result doLogin(String username, String password) {

        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try {
            subject.login(token);
        } catch (AuthenticationException e) {
            e.printStackTrace();
            token.clear();
            return ResultGenerator.getFailResult("登录失败，用户名或密码错误！");
        }

        return ResultGenerator.getSuccessResult("登录成功");
    }

    public static void main(String[] args) {
        System.out.println(UUID.randomUUID());
        System.out.println(UUID.randomUUID());
        System.out.println(UUID.randomUUID());
    }
}
