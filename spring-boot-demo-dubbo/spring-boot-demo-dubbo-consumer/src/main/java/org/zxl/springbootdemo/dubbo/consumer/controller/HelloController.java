package org.zxl.springbootdemo.dubbo.consumer.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.apache.springbootdemo.dubbo.interfaces.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference(version = "${demo.service.version}")
    private DemoService demoService;

    @GetMapping("/hello")
    public String hello(@RequestParam String name){
        String sayStr = demoService.sayHello(name);
        System.out.println(sayStr);
        return sayStr;
    }
}
