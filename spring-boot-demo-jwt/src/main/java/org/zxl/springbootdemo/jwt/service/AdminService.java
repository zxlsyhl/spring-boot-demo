package org.zxl.springbootdemo.jwt.service;

import org.springframework.stereotype.Service;
import org.zxl.springbootdemo.jwt.entity.Admin;

/**
 * @author zhangxiaolong
 * @ClassName AdminService
 * @Description TODO
 * @Date 2019/3/18 15:12
 * @Version 1.0
 **/
@Service
public class AdminService {
    private Long id = 0L;
    String roles = "";
    public Admin login(String loginname, String password){
        id++;
        if("zhangsan".equals(loginname)){
            roles = "admin";
        }else if("lisi".equals(loginname)){
            roles = "user";
        }else {
            return null;
        }
        return new Admin(id.toString(),loginname,password,roles);
    }
}
