package com.Lemon.Spring3.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyUtil {

    private MathImpl math;

    public ProxyUtil(MathImpl math) {
        this.math = math;
    }

    // 代理对象的方法
    public Object getProxy(){
        ClassLoader loader = this.getClass().getClassLoader();

        Class<?>[] interfaces = math.getClass().getInterfaces();

        return Proxy.newProxyInstance(loader, interfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                try{
                    // 日志
                    MyLogger.before(method.getName(), Arrays.toString(args));

                    Object result = method.invoke(math, args);
                    System.out.println("动态代理执行：" + result);

                    // 日志
                    MyLogger.after(method.getName(), result);

                    return result;
                }catch (Exception e){
                    // 日志
                    MyLogger.throwing();

                    e.printStackTrace();
                }finally {
                    System.out.println("哪都有我");
                }

                return null;
            }
        });
    }
}
