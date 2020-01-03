package org.zxl.springbootdemo.jwt.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

import java.text.SimpleDateFormat;

/**
 * @author zhangxiaolong
 * @ClassName ParseJwt
 * @Description TODO
 * @Date 2019/3/18 13:45
 * @Version 1.0
 **/
public class ParseJwt {
    public static void main(String[] args) {
        String token =
                "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIxMjMiLCJzdWIiOiLkvanlpYciLCJpYXQiOjE1NTI4OTA1NjAsInJvbGUiOiJhZG1pbiIsImV4cCI6MTU1Mjg5MDYyMH0.lG8x8VqUGGnvMXXpx3Re6wsaIJiPBKJj-y61O5nl-_M";
        Claims claims = Jwts.parser().setSigningKey("pikapika").parseClaimsJws(token).getBody();
        // 获取具体的参数
        System.out.println("用户id：" + claims.getId());
        System.out.println("登录时间：" + claims.getIssuedAt());
        System.out.println(
                "登录时间：" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(claims.getIssuedAt()));
        System.out.println("用户名：" + claims.getSubject());
        System.out.println("角色：" + claims.get("role"));
    }
}
