package org.zxl.springbootdemo.restdoc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RestdocController {

    @GetMapping("/test1")
    public Map test1(@RequestParam(required = false,defaultValue = "zqh") String name){
        Map<String,String> result = new HashMap<>();
        result.put("a","123");
        result.put("b", "456");
        result.put("name",name);
        return result;
    }


    @GetMapping("/test2")
    public Map test2(@RequestParam(required = false,defaultValue = "10") int age){
        Map<String,Object> result = new HashMap<>();
        result.put("a","123");
        result.put("b", "456");
        result.put("age",age);
        return result;
    }
}
