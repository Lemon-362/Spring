package com.Lemon.Spring2.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class AfterHandler implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("3：初始化前");

        Person person = (Person) bean;

        if (person.getSex().equals("女")){
            person.setName("赵敏");
        }else {
            person.setName("张无忌");
        }

        return person;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("5：初始化后");

        return bean;
    }
}
