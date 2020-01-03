package org.zxl.springbootdemo.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.zxl.springbootdemo.jwt.entity.Admin;
import org.zxl.springbootdemo.jwt.service.AdminService;
import org.zxl.springbootdemo.jwt.util.JwtUtil;
import org.zxl.springbootdemo.jwt.util.Result;
import org.zxl.springbootdemo.jwt.util.ResultGenerator;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangxiaolong
 * @ClassName LoginController
 * @Description TODO
 * @Date 2019/3/18 15:10
 * @Version 1.0
 **/
@RestController
public class LoginController {
    @Autowired
    private AdminService adminService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public Result login(@RequestBody Map<String, String> map) {
        String loginname = map.get("loginname");
        String password = map.get("password");
        Admin admin = adminService.login(loginname, password);
        if (admin == null) {
            return ResultGenerator.getFailResult("用户名或密码错误");
        }
        //如果登录成功就生成token令牌
        String jwt = jwtUtil.createJWT(admin.getId(), admin.getLoginname(), admin.getRoles());
        Map<String, Object> rmap=new HashMap<>();//前端需要什么信息给它返回什么信息
        rmap.put("token",jwt);
        rmap.put("role","admin");
        rmap.put("loginname",admin.getLoginname());
        return ResultGenerator.getSuccessResult(rmap) ;
    }

}
