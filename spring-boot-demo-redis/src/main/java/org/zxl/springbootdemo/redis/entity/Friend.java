package org.zxl.springbootdemo.redis.entity;

/**
 * @author zhangxiaolong
 * @ClassName Friend
 * @Description
 * @Date 2019/3/14 17:33
 * @Version 1.0
 **/
public class Friend {
    private Long frId;
    private String name;
    private String nickname;
    private Long age;
    private String description;

    public Friend(Long frId, String name, String nickname, Long age, String description) {
        this.frId = frId;
        this.name = name;
        this.nickname = nickname;
        this.age = age;
        this.description = description;
    }

    public Friend() {
    }

    public Long getFrId() {
        return frId;
    }

    public void setFrId(Long frId) {
        this.frId = frId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
