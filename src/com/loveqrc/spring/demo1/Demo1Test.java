package com.loveqrc.spring.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1Test {

    @Test
    public void originTest(){
        UserService userService= new UserServiceImpl();
        userService.sayHello();
    }

    @Test
    public void springTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userservice = (UserService) ac.getBean("userservice");
        userservice.sayHello();
    }
}
