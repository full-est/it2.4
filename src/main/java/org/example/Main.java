package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Shop shop = context.getBean("Shop", Shop.class);

        shop.printInfo();
        context.close();
    }
}
