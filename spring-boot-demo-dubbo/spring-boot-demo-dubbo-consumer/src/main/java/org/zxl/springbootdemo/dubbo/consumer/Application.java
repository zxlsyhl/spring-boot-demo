package org.zxl.springbootdemo.dubbo.consumer;

import org.apache.dubbo.config.annotation.Reference;
import org.apache.springbootdemo.dubbo.interfaces.DemoService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

//@EnableAutoConfiguration
@SpringBootApplication
public class Application {

    @Reference(version = "${demo.service.version}")
    private DemoService demoService;

    public static void main(String[] args) throws IOException {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public ApplicationRunner runner(){
        return args -> System.out.println(demoService.sayHello("consumer"));
    }
}
