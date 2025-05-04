package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Car car = context.getBean("carBean", Car.class);
        Device keyboard = context.getBean("Keyboard", Keyboard.class);
        Device headphones = context.getBean("Headphones", Headphones.class);
        Device graphicTablet = context.getBean("GraphicTablet", GraphicTablet.class);

        Dealer dealer = new Dealer(car);
        Shop shop = new Shop(keyboard);
        Shop shop2 = new Shop(headphones);
        Shop shop3 = new Shop(graphicTablet);
        shop.printInfo();
        shop2.printInfo();
        shop3.printInfo();
        dealer.printModel();
        context.close();
    }
}
