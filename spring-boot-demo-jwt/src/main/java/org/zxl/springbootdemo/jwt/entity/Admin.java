package org.zxl.springbootdemo.jwt.entity;

/**
 * @author zhangxiaolong
 * @ClassName Admin
 * @Description TODO
 * @Date 2019/3/18 15:12
 * @Version 1.0
 **/
public class Admin {
    private String id;
    private String loginname;
    private String password;
    private String roles;

    public Admin(String id, String loginname, String password, String roles) {
        this.id = id;
        this.loginname = loginname;
        this.password = password;
        this.roles = roles;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
