package org.zxl.springbootdemo.security.entity;

import javax.persistence.*;

@Entity
public class UserInfo {
    public enum Role{
        first,second,third
    }

    @Id
    @GeneratedValue
    private long uid;//主键

    private String username;//用户名.
    private String password;//密码.

    @Enumerated(EnumType.STRING)
    private Role role;

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role.name() +
                '}';
    }
}
