package com.Lemon.Spring3.Proxy;

// 公共方法AOP：切面，存储公共功能的类
public class MyLogger {

    // 通常展示方法名和方法参数
    public static void before(String methodName, String args){

        System.out.println("method: " + methodName + ", arguments: " + args);

    }

    // 通常展示方法名和结果
    public static void after(String methodName, Object result){

        System.out.println("method: " + methodName + ", result: " + result);

    }

    public static void throwing(){

        System.out.println("有异常！");

    }

}
