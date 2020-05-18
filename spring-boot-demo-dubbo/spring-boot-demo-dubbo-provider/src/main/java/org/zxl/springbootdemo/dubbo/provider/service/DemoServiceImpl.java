package org.zxl.springbootdemo.dubbo.provider.service;

import org.apache.dubbo.config.annotation.Service;
import org.apache.springbootdemo.dubbo.interfaces.DemoService;

@Service(version = "${demo.service.version}")
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return String.format("Hello,%s;",name);
    }
}
