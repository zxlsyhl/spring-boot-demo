package org.zxl.springbootdemo.shardsphere.jdbctest3.entity;

import java.io.Serializable;

public class TUser implements Serializable {
    private static final long serialVersionUID = 4451548756864872288L;
    private Integer userId;
    private String userName;
    private String userWork;
    private String userTel;
    private Integer userAge;
    private String userSex;
    private String userEmail;
    private String userDesc;

    public Integer getUserId(){
        return this.userId;
    }
    public void setUserId(Integer userId){
        this.userId = userId;
    }
    
    public String getUserName(){
        return this.userName;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    
    public String getUserWork(){
        return this.userWork;
    }
    public void setUserWork(String userWork){
        this.userWork = userWork;
    }
    
    public String getUserTel(){
        return this.userTel;
    }
    public void setUserTel(String userTel){
        this.userTel = userTel;
    }
    
    public Integer getUserAge(){
        return this.userAge;
    }
    public void setUserAge(Integer userAge){
        this.userAge = userAge;
    }
    
    public String getUserSex(){
        return this.userSex;
    }
    public void setUserSex(String userSex){
        this.userSex = userSex;
    }
    
    public String getUserEmail(){
        return this.userEmail;
    }
    public void setUserEmail(String userEmail){
        this.userEmail = userEmail;
    }
    
    public String getUserDesc(){
        return this.userDesc;
    }
    public void setUserDesc(String userDesc){
        this.userDesc = userDesc;
    }
    

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName=" + userName +
                ", userWork=" + userWork +
                ", userTel=" + userTel +
                ", userAge=" + userAge +
                ", userSex=" + userSex +
                ", userEmail=" + userEmail +
                ", userDesc=" + userDesc +
                '}';
    }

}
