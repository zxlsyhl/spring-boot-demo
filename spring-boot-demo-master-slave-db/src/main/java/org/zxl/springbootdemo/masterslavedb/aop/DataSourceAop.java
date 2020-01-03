package org.zxl.springbootdemo.masterslavedb.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.zxl.springbootdemo.masterslavedb.config.DBContextHolder;

/**
 * Created by 123456 on 2019/6/30.
 */
@Aspect
@Component
public class DataSourceAop {
    @Pointcut("!@annotation(org.zxl.springbootdemo.masterslavedb.Master) " +
            "&& (execution(* org.zxl.springbootdemo.masterslavedb.service..*.select*(..)) " +
            "|| execution(* org.zxl.springbootdemo.masterslavedb.service..*.get*(..)))")
    public void readPointcut() {

    }

    @Pointcut("@annotation(org.zxl.springbootdemo.masterslavedb.Master) " +
            "|| execution(* org.zxl.springbootdemo.masterslavedb.service..*.insert*(..)) " +
            "|| execution(* org.zxl.springbootdemo.masterslavedb.service..*.add*(..)) " +
            "|| execution(* org.zxl.springbootdemo.masterslavedb.service..*.update*(..)) " +
            "|| execution(* org.zxl.springbootdemo.masterslavedb.service..*.edit*(..)) " +
            "|| execution(* org.zxl.springbootdemo.masterslavedb.service..*.delete*(..)) " +
            "|| execution(* org.zxl.springbootdemo.masterslavedb.service..*.remove*(..))")
    public void writePointcut() {

    }

    @Before("readPointcut()")
    public void read() {
        DBContextHolder.slave();
    }

    @Before("writePointcut()")
    public void write() {
        DBContextHolder.master();
    }


    /**
     * 另一种写法：if...else...  判断哪些需要读从数据库，其余的走主数据库
     */
//    @Before("execution(* com.cjs.example.service.impl.*.*(..))")
//    public void before(JoinPoint jp) {
//        String methodName = jp.getSignature().getName();
//
//        if (StringUtils.startsWithAny(methodName, "get", "select", "find")) {
//            DBContextHolder.slave();
//        }else {
//            DBContextHolder.master();
//        }
//    }
}
