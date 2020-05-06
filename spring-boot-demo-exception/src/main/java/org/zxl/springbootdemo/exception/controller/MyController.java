package org.zxl.springbootdemo.exception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zxl.springbootdemo.exception.error.MyException;
import org.zxl.springbootdemo.exception.tools.APIResponse;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/my")
public class MyController {
    @ResponseBody
    @GetMapping("/hello")
    public APIResponse hello(){
        Map<String , String> map = new HashMap<>();
        map.put("a","b");
        int b = 1;
        int c = 0;
        System.out.println(b/c);
        return new APIResponse("0000","成功",map);
    }

    @GetMapping("/bytt")
    public String bytt(){
        if(1==1){
            throw new MyException("1234", "1234567890");
        }
        return "0000";
    }
}
