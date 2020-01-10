package org.zxl.springbootdemo.starter.autoconfigure;

public class HelloService {
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

    public HelloService(String hello, Integer age, String address) {
        this.hello = hello;
        this.age = age;
        this.address = address;
    }

    public String sayHello(String name){
        return "Hello, " + name;
    }
}
