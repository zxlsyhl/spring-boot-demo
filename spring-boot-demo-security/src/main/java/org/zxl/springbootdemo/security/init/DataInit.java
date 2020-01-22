package org.zxl.springbootdemo.security.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.zxl.springbootdemo.security.entity.UserInfo;
import org.zxl.springbootdemo.security.repository.UserInfoRepository;

import javax.annotation.PostConstruct;

@Service
public class DataInit {
    @Autowired
    UserInfoRepository userInfoRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostConstruct
    public void dataInit(){
        System.out.println("init userdata start************************************************");

        UserInfo admin = new UserInfo();
        admin.setUsername("admin");
        admin.setPassword(passwordEncoder.encode("123"));
        admin.setRole(UserInfo.Role.first);
        userInfoRepository.save(admin);


        UserInfo user = new UserInfo();
        user.setUsername("user");
        user.setPassword(passwordEncoder.encode("456"));
        user.setRole(UserInfo.Role.second);
        userInfoRepository.save(user);

        System.out.println("init userdata end************************************************");
    }

}
