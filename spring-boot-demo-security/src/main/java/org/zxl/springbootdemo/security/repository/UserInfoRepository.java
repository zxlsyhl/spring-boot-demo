package org.zxl.springbootdemo.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zxl.springbootdemo.security.entity.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
    public UserInfo findByUsername(String username);
}
