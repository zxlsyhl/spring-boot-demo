package org.zxl.springbootdemo.shardsphere.jdbctest1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zxl.springbootdemo.shardsphere.jdbctest1.entity.UserInfoDetail;
import org.zxl.springbootdemo.shardsphere.jdbctest1.entity.UserLog;
import org.zxl.springbootdemo.shardsphere.jdbctest1.service.UserLogService;

import java.util.List;

@RestController
@RequestMapping("/userLog")
public class UserLogController {
    private Logger logger = LoggerFactory.getLogger(UserLogController.class);

    @Autowired
    private UserLogService userLogService;


    @PostMapping("/addUserLog")
    public Integer addUserLog(UserLog userLog){
        return userLogService.addUserLog(userLog);
    }

    @GetMapping("/userLoglist")
    public List<UserLog> userLoglist(){
        return userLogService.userLoglist();
    }

    @GetMapping("/add")
    public Object add() {

        for(int i=100;i<150;i++) {
            UserLog userLog = new UserLog();
            userLog.setLogId(i);
            userLog.setLogName("logname"+i);
            userLog.setUserId(i);
            long resutl=   userLogService.addUserLog(userLog);
            logger.info("insert:"+userLog.toString()+" result:"+resutl);
        }
        return "ok";
    }

    @GetMapping("/userInfoDetail")
    public List<UserInfoDetail> userInfoDetail() {
        return userLogService.userInfoDetail();
    }

}
