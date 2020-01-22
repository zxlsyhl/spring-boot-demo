package org.zxl.springbootdemo.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {
    @GetMapping("/toIndex")
    public String toIndex(){
        return "index";
    }

    @GetMapping({"","/","/index"})
    public String index() {
        return "/index";
    }

    @GetMapping("/login")
    public String login() {
        return "/login";
    }
}
