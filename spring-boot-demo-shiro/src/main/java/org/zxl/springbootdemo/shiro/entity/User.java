package org.zxl.springbootdemo.shiro.entity;

/**
 * @author zhangxiaolong
 * @ClassName User
 * @Description TODO
 * @Date 2019/3/16 12:33
 * @Version 1.0
 **/
public class User {
    private int userId;
    private String userName;
    private int age;

    public User(int userId, String userName, int age) {
        this.userId = userId;
        this.userName = userName;
        this.age = age;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
