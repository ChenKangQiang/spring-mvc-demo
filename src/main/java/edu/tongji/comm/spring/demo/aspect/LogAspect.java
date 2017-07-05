package edu.tongji.comm.spring.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by chen on 2017/7/4.
 */

@Component
@Aspect
public class LogAspect {

    @Pointcut("execution(* edu.tongji.comm.spring.demo.service.*.*(..))")
    public void logPointCut() {
    }

    @After("logPointCut()")
    public void after() {
        System.out.println("after aspect executed");
    }

    @Before("logPointCut()")
    public void before() {
        System.out.println("before aspect executing");
    }

    /*


    @AfterReturning(pointcut = "logPointCut()", returning = "returnVal")
    public void afterReturning(JoinPoint joinPoint, Object returnVal) {
        System.out.println("afterReturning executed, return result is "
                + returnVal);
    }


    @Around("logPointCut()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around start..");
        try {
            pjp.proceed();
        } catch (Throwable ex) {
            System.out.println("error in around");
            throw ex;
        }
        System.out.println("around end");
    }

    @AfterThrowing(pointcut = "logPointCut()", throwing = "error")
    public void afterThrowing(JoinPoint jp, Throwable error) {
        System.out.println("error:" + error);
    }

    */


}
