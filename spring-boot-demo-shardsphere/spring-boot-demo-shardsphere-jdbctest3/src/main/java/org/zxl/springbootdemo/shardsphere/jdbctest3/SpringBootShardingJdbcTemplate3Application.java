package org.zxl.springbootdemo.shardsphere.jdbctest3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableConfigurationProperties
public class SpringBootShardingJdbcTemplate3Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootShardingJdbcTemplate3Application.class,args);
    }
}
