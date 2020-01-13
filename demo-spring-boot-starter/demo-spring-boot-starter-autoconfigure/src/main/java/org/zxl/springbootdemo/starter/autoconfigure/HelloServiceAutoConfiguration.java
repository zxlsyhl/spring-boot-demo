package org.zxl.springbootdemo.starter.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HelloPropreties.class)
public class HelloServiceAutoConfiguration {
    private final HelloPropreties helloPropreties;

    public HelloServiceAutoConfiguration(HelloPropreties helloPropreties) {
        this.helloPropreties = helloPropreties;
    }

    @Bean
    @ConditionalOnMissingBean
    public HelloService helloService(){
        return new HelloService(this.helloPropreties.getHello(),
                this.helloPropreties.getAge(),
                this.helloPropreties.getAddress());
    }
}
