package org.zxl.springbootdemo.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zxl.springbootdemo.jwt.util.JwtUtil;
import org.zxl.springbootdemo.jwt.util.Result;
import org.zxl.springbootdemo.jwt.util.ResultGenerator;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhangxiaolong
 * @ClassName IndexController
 * @Description TODO
 * @Date 2019/3/18 19:51
 * @Version 1.0
 **/
@RestController
public class IndexController {
    @Autowired
    private HttpServletRequest request;

    @Autowired
    private JwtUtil jwtUtil;

    @DeleteMapping("/deleteById")
    public Result deleteById(String id) {

        try {
            if(request.getAttribute("admin_claims") == null){
                throw new RuntimeException("权限不足");
            }
        } catch (Exception e) {
            return ResultGenerator.getFailResult(e.getMessage());
        }
        return ResultGenerator.getSuccessResult();
    }
}
