package org.zxl.springbootdemo.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hellojsp(){
        System.out.println("111111111");
        return "index";
    }

    @GetMapping("/add")
    public String add(){
        return "add";
    }
}
