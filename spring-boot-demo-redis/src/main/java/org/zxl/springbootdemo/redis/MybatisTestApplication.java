package org.zxl.springbootdemo.redis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangxiaolong
 * @ClassName MybatisTestApplication
 * @Description TODO
 * @Date 2019/3/14 17:32
 * @Version 1.0
 **/
@SpringBootApplication
@MapperScan("zxl.boot.cache.mybatisTest.dao")
public class MybatisTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisTestApplication.class,args);
    }
}
