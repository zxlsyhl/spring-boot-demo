package org.zxl.springbootdemo.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zxl.springbootdemo.security.entity.UserInfo;
import org.zxl.springbootdemo.security.repository.UserInfoRepository;
import org.zxl.springbootdemo.security.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoRepository userInfoRepository;


    @Override
    public UserInfo findByUsername(String username) {
        return userInfoRepository.findByUsername(username);
    }
}
