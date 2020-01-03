package org.zxl.springbootdemo.masterslavedb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zxl.springbootdemo.masterslavedb.entity.ZqhDiary;
import org.zxl.springbootdemo.masterslavedb.service.ZqhDiaryService;

import java.util.List;

/**
 * Created by 123456 on 2019/7/2.
 */
@RestController
@RequestMapping("/zqh")
public class ZqhDiaryController {
    @Autowired
    private ZqhDiaryService zqhDiaryService;

    @RequestMapping("/insert")
    public String insert(@RequestBody ZqhDiary zqhDiary){
        zqhDiaryService.insert(zqhDiary);
        return "success";
    }

    @RequestMapping("/selectAll")
    public List<ZqhDiary> selectAll(){
        return zqhDiaryService.selectAll();
    }
}
