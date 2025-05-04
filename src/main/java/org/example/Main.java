package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Shop shop = context.getBean("shop", Shop.class);

        shop.printInfo();
        context.close();
    }
}
