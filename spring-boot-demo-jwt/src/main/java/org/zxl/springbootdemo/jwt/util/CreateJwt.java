package org.zxl.springbootdemo.jwt.util;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

/**
 * @author zhangxiaolong
 * @ClassName CreateJwt
 * @Description TODO
 * @Date 2019/3/18 10:03
 * @Version 1.0
 **/
public class CreateJwt {
    public static void main(String[] args) {
        JwtBuilder builder =
                Jwts.builder()//生成jwt，下面是荷载的内容
                .setId("123")//当前登录用户id
                .setSubject("佩奇")//用户名
                .setIssuedAt(new Date())//签发时间
                .signWith(SignatureAlgorithm.HS256,"pikapika")//加密方式为hs256，盐是pikapika
                .claim("role","admin")//添加自定义属性
                .setExpiration(new Date(new Date().getTime()+60000));//设置一分钟过期
        //输出token
        System.out.println(builder.compact());
    }

//    public static String create(){
//        JwtBuilder builder =
//                Jwts.builder() // 生成jwt,下面是载荷的内容
//                .setId("123") // 当前登录用户的id
//                .setSubject("佩奇") // 用户名
//                .setIssuedAt(new Date()) // 签发时间
//                .signWith(SignatureAlgorithm.HS256, "pikapika"); // 加密方式是hs256,盐是pikapika
//        // 输出token
//        return builder.compact();
//    }
}
