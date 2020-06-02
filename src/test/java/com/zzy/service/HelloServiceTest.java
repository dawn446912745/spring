package com.zzy.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloServiceTest {
    @Test
    public void test1() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        HelloService helloService = (HelloService) context.getBean("helloService");
        helloService.hello();
    }
}
