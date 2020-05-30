package com.Lemon.Spring3.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(0)
public class AspectJOrder {

    @Before(value = "execution(* com.Lemon.Spring3.aop.*.*(..))")
    public void before(){
        System.out.println("Order = 0");
    }

}
