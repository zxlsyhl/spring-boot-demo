package org.zxl.springbootdemo.shardsphere.jdbctest3.service.impl;

import org.apache.shardingsphere.transaction.annotation.ShardingTransactionType;
import org.apache.shardingsphere.transaction.core.TransactionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zxl.springbootdemo.shardsphere.jdbctest3.entity.TUser;
import org.zxl.springbootdemo.shardsphere.jdbctest3.entity.User;
import org.zxl.springbootdemo.shardsphere.jdbctest3.repository.TUserRepository;
import org.zxl.springbootdemo.shardsphere.jdbctest3.repository.UserRepository;
import org.zxl.springbootdemo.shardsphere.jdbctest3.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    TUserRepository tUserRepository;

    @Override
    public int addUser(TUser user) {
        // 强制路由主库
//        HintManager.getInstance().setMasterRouteOnly();
//        TUser tUser1 = new TUser();
//        tUser1.setUserId(user.getUserId());
//        List<TUser> usersqry = userRepository.select(tUser1);
//        if(usersqry.size()>0){
//            return -100;
//        }
        return tUserRepository.insertUser(user);
    }

    @Transactional
    @Override
    public void addTwoTUser() {
        TUser tUser1 = new TUser();
        tUser1.setUserId(300);
        tUser1.setUserName("300");
        tUserRepository.insertUser(tUser1);
        TUser tUser2 = new TUser();
        tUser2.setUserId(301);
        tUser2.setUserName("301");
        tUserRepository.insertUser(tUser2);
        System.out.println("****************");
    }

    @ShardingTransactionType(TransactionType.XA)
    @Transactional
    public void addTUser2(){
        tUserRepository.addTUser2();
    }
    @Override
    public List<TUser> getTUserByUser() {
        return tUserRepository.getTUserByUser();
    }

    @Override
    public List<TUser> tUserList() {
        return tUserRepository.getUserList();
    }


    @Override
    public Integer addUser(User user) {

        // 强制路由主库
        //HintManager.getInstance().setMasterRouteOnly();
        return userRepository.addUser(user);
    }

    @Override
    public List<User> list() {

        return userRepository.list();
    }

    @Override
    public Integer updateUserById(int id, String username) {
        return userRepository.updateUserById(id,username);
    }

    @Override
    public Integer updateUserByUsername(String username, String password) {
        return userRepository.updateUserByUsername(username,password);
    }

    @Override
    public List<User> selectUsersByLogId(int logId){
        return userRepository.selectUsersByLogId(logId);
    }
}
