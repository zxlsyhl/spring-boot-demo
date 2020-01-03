package org.zxl.springbootdemo.shiro.service;

import org.springframework.stereotype.Service;

/**
 * @author zhangxiaolong
 * @ClassName ShiroService
 * @Description TODO
 * @Date 2019/3/16 11:10
 * @Version 1.0
 **/
@Service
public class ShiroService {
    public String getPasswordByUsername(String username){
        switch (username){
            case "liming":
                return "123";
            case "hanli":
                return "456";
            case "admin":
                return "456";
            default:
                return null;
        }
    }
}
