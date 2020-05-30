package com.Lemon.Spring3.aopxml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

// 公共方法AOP：切面，存储公共功能的类
@Component
public class MyLogger {

    // 前置通知：在方法前
    public void beforeMethod(JoinPoint joinPoint){

        Object[] args = joinPoint.getArgs();

        String methodName = joinPoint.getSignature().getName();

        System.out.println("method: " + methodName + ", arguments: " + Arrays.toString(args));

    }

    // 后置通知：在finally中
    public void afterMethod(){

        System.out.println("后置通知");

    }

    // 返回通知：在try中，方法成功执行后，再执行返回通知
    // returning用于接受返回值
    public void afterRunning(JoinPoint joinPoint, Object result){

        String methodName = joinPoint.getSignature().getName();

        System.out.println("method: " + methodName + ", result: " + result);

    }

    // 异常通知：在catch中
    // throwing用于接受返回的异常类型
    public void afterThrowing(Exception e){

        System.out.println("有异常，messages: " + e);

    }
}
