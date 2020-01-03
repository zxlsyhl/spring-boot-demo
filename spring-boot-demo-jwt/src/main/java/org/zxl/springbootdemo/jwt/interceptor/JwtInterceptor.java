package org.zxl.springbootdemo.jwt.interceptor;

import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.zxl.springbootdemo.jwt.util.JwtUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zhangxiaolong
 * @ClassName JwtInterceptor
 * @Description TODO
 * @Date 2019/3/18 20:06
 * @Version 1.0
 **/
@Component
public class JwtInterceptor implements HandlerInterceptor{
    @Autowired
    private JwtUtil jwtUtil;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        System.out.println("经过了拦截器。。。");
        // 不管怎样结果都是放行，具体能不能操作还是要在业务中去判断 ，现在做的只是解析token
        String header = request.getHeader("Authorization");
        if (header != null && header.startsWith("Bearer")) {
            String token = header.substring(6);
            // 解析token
            try {
                Claims claims = jwtUtil.parseJWT(token);
                if (claims != null) {
                    String role = (String) claims.get("roles");
                    if ("admin".equals(role)) {
                        request.setAttribute("admin_claims", claims); // 此时是管理员
                    }
                    if ("user".equals(role)) {
                        request.setAttribute("user_claims", claims); // 此时是普通用户
                    }
                }
            } catch (Exception e) {
                throw new RuntimeException("令牌有误");
            }
        }
        return true; // 返回true就是放行，返回false就是拦截
    }
}
