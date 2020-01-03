package org.zxl.springbootdemo.shiro.controller;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zxl.springbootdemo.shiro.util.Result;
import org.zxl.springbootdemo.shiro.util.ResultGenerator;

/**
 * @author zhangxiaolong
 * @ClassName IndexController
 * @Description TODO
 * @Date 2019/3/16 11:00
 * @Version 1.0
 **/
@RestController
public class IndexController {
    @RequiresRoles("admin")
    @GetMapping("/nihao")
    public Result nihao(){
        return ResultGenerator.getSuccessResult();
    }

    @GetMapping("/hello")
    @RequiresRoles("user")
    public Result hello(){
        return ResultGenerator.getSuccessResult();
    }
}
