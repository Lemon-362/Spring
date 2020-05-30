package com.Lemon.Spring3.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

// 公共方法AOP：切面，存储公共功能的类
@Component
@Aspect
@Order(1)
public class MyLoggerAspect {

    // 公共切入点表达式
    @Pointcut(value = "execution(* com.Lemon.Spring3.aop.*.*(..))")
    public void test(){}

    // 前置通知：在方法前
    @Before(value = "test()")
    public void beforeMethod(JoinPoint joinPoint){

        Object[] args = joinPoint.getArgs();

        String methodName = joinPoint.getSignature().getName();

        System.out.println("method: " + methodName + ", arguments: " + Arrays.toString(args));

    }

    // 后置通知：在finally中
    @After(value = "test()")
    public void afterMethod(){

        System.out.println("后置通知");

    }

    // 返回通知：在try中，方法成功执行后，再执行返回通知
    // returning用于接受返回值
    @AfterReturning(value = "test()", returning = "result")
    public void afterRunning(JoinPoint joinPoint, Object result){

        String methodName = joinPoint.getSignature().getName();

        System.out.println("method: " + methodName + ", result: " + result);

    }

    // 异常通知：在catch中
    // throwing用于接受返回的异常类型
    @AfterThrowing(value = "test()", throwing = "e")
    public void afterThrowing(Exception e){

        System.out.println("有异常，messages: " + e);

    }
}
