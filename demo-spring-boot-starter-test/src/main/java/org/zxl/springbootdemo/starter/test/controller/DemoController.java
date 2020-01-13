package org.zxl.springbootdemo.starter.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zxl.springbootdemo.starter.autoconfigure.HelloService;

@RestController
public class DemoController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/getHello")
    public String getHello(){
        return helloService.getHello();
    }

    @GetMapping("/sayHello")
    public String sayHello(){
        return helloService.sayHello("nnn");
    }
}
