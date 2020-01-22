package org.zxl.springbootdemo.security.service;

import org.zxl.springbootdemo.security.entity.UserInfo;

public interface UserInfoService {
    public UserInfo findByUsername(String username);
}
