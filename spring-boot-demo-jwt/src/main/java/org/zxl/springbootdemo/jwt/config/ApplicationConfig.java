package org.zxl.springbootdemo.jwt.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.zxl.springbootdemo.jwt.interceptor.JwtInterceptor;

/**
 * @author zhangxiaolong
 * @ClassName ApplicationConfig
 * @Description TODO
 * @Date 2019/3/18 20:08
 * @Version 1.0
 **/
@Configuration
public class ApplicationConfig extends WebMvcConfigurationSupport{
    @Autowired
    private JwtInterceptor jwtInterceptor;

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(jwtInterceptor)
                .addPathPatterns("/**")  //所有路径都拦截
                .excludePathPatterns("/login/**");  //除了登录的路径不拦截
    }
}
