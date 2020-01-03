package org.zxl.springbootdemo.shiro.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.zxl.springbootdemo.shiro.service.ShiroService;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Set;

/**
 * @author zhangxiaolong
 * @ClassName MyShiroRealm
 * @Description TODO
 * @Date 2019/3/16 11:11
 * @Version 1.0
 **/
public class MyShiroRealm extends AuthorizingRealm{
    @Resource
    private ShiroService shiroService;
    /**
     * 授权
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
//        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
//        return authorizationInfo;
        // 1. 从 PrincipalCollection 中来获取登录用户的信息
        String userName = (String) principals.getPrimaryPrincipal();

        Set<String> roles = new HashSet<String>();
        roles.add("user");
        if ("admin".equals(userName)) {
            roles.add("admin");
        }

        // 3. 创建 SimpleAuthorizationInfo, 并设置其 reles 属性.
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo(roles);

        // 4. 返回 SimpleAuthorizationInfo 对象 .
        return info;
    }

    /**
     * 登录认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //获取用户账号
        String username = token.getPrincipal().toString();

        String password = shiroService.getPasswordByUsername(username);
        if (password != null) {
            AuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                    username,   //认证通过后，存放在session,一般存放user对象
                    password,   //用户数据库中的密码
                    getName());    //返回Realm名
            return authenticationInfo;
        }
        return null;
    }

}
