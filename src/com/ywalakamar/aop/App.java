package com.ywalakamar.aop;

import com.ywalakamar.aop.service.ShapeService;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) throws Exception {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
        System.out.println(shapeService.getCircle().getName());
        context.close();

    }
}
