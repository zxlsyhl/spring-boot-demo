package org.zxl.springbootdemo.starter.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("my.hello")
public class HelloPropreties {
    private String hello;
    private Integer age;
    private String address;

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "HelloPropreties{" +
                "hello='" + hello + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
