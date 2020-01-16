package org.zxl.springbootdemo.shardsphere.jdbctest3.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.zxl.springbootdemo.shardsphere.jdbctest3.entity.TUser;
import org.zxl.springbootdemo.shardsphere.jdbctest3.entity.User;
import org.zxl.springbootdemo.shardsphere.jdbctest3.service.UserService;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/tUserList")
    public Object tUserList() {
        List<TUser> tUsers = userService.tUserList();
        return tUsers;
    }

    @GetMapping("/getTUserByUser")
    public Object getTUserByUser() {
        List<TUser> tUsers = userService.getTUserByUser();
        return tUsers;
    }


    @PostMapping("/add")
    public Object add(@RequestBody TUser user) {
        return userService.addUser(user);
    }

    @PostMapping("/addTuserList")
    public String addTuserList(@RequestParam int num, @RequestParam int beginId){
        for(int i=0;i<num;i++){
            TUser tUser = new TUser();
            tUser.setUserId(beginId+i);
            tUser.setUserName("qingh"+tUser.getUserId());
            tUser.setUserAge(22);
            tUser.setUserEmail("qingh"+tUser.getUserId()+"@163.com");
            userService.addUser(tUser);
        }
        return "success";
    }

    @GetMapping("addTwoTuser")
    public String addTwoTuser(){
        userService.addTwoTUser();
        return "success";
    }

    @GetMapping("addTUser2")
    public String addTUser2(){
        userService.addTUser2();
        return "success";
    }

    Logger logger= LoggerFactory.getLogger(UserController.class);

//    @Autowired
//    private UserService userService;

    @GetMapping("/users")
    public Object list() {
        return userService.list();
    }

    @GetMapping("/selectUsersByLogId")
    public List<User> selectUsersByLogId(int logId){
        return userService.selectUsersByLogId(logId);
    }

    @GetMapping("/add")
    public Object add() {

        for(int i=100;i<150;i++) {
            User user = new User();
            user.setId(i);
            user.setUsername("forezp"+(i));
            user.setPassword("1233edwd");
            long resutl=   userService.addUser(user);
            logger.info("insert:"+user.toString()+" result:"+resutl);
        }
        return "ok";
    }

    @GetMapping("/updateUserById")
    public Integer updateUserById(@RequestParam int id, @RequestParam String username) {
        return userService.updateUserById(id,username);
    }

    @GetMapping("/updateUserByUsername")
    public Integer updateUserByUsername(@RequestParam String username, @RequestParam String password) {
        return userService.updateUserByUsername(username,password);
    }
}
