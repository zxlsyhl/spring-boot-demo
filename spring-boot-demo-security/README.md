借鉴： https://www.iteye.com/blog/412887952-qq-com-2441544

2020-01-22： 221.Spring Boot+Spring Security：登出和403处理

一、去除拦截
1、在启动类中添加 @SpringBootApplication(exclude = SecurityAutoConfiguration.class)
二、配置文件中配置用户名、密码
spring:
  security:
    user:
      name: admin   #配置用户名
      password: 123456   #配置密码

三、