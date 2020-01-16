package org.zxl.springbootdemo.shardsphere.jdbctest1.service.impl;

import io.shardingsphere.api.HintManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zxl.springbootdemo.shardsphere.jdbctest1.entity.TUser;
import org.zxl.springbootdemo.shardsphere.jdbctest1.repository.UserRepository;
import org.zxl.springbootdemo.shardsphere.jdbctest1.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Transactional
    public int addUser(TUser user) {
        // 强制路由主库
        HintManager.getInstance().setMasterRouteOnly();
        TUser tUser1 = new TUser();
        tUser1.setUserId(user.getUserId());
        List<TUser> usersqry = userRepository.select(tUser1);
        if(usersqry.size()>0){
            return -100;
        }

        return userRepository.insert(user);
    }
    @Transactional
    public int addUsers(TUser user, TUser user2) {
        // 强制路由主库
        //HintManager.getInstance().setMasterRouteOnly();
        return userRepository.insert(user);
    }

    public List<TUser> list() {
        return userRepository.selectAll();
    }
}
