package org.zxl.springbootdemo.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true) //开启spring方法级安全
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Autowired
    private CustomUserDetailService customUserDetailService;
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().withUser("admin").password("1234567");
//
//        auth.inMemoryAuthentication()
////                .passwordEncoder(new BCryptPasswordEncoder())
//                .withUser("admin")
//                .password(passwordEncoder().encode("123456"))
//                .roles("first","second");
//
//        auth.inMemoryAuthentication()
////                .passwordEncoder(new BCryptPasswordEncoder())
//                .withUser("user")
//                .password(passwordEncoder().encode("123456"))
//                .roles("third");
        auth.userDetailsService(customUserDetailService).passwordEncoder(passwordEncoder());
    }


    //在WebSecurityConfig复写configure(HttpSecurityhttp)方法，复写登录页面的路径
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests() // 定义哪些URL需要被保护、哪些不需要被保护
                .antMatchers("/login").permitAll()// 设置所有人都可以访问登录页面
                .anyRequest().authenticated()  // 任何请求,登录后可以访问
                .and()
                .formLogin().loginPage("/login")
        ;

    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
