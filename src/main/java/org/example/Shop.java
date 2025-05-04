package org.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("shop")
public class Shop {
    @Autowired
    @Qualifier("graphicTablet")
    private Device item;

    @Autowired
    @Qualifier("keyboard")
    private Device item2;

    @Autowired
    @Qualifier("headphones")
    private Device item3;

    public Shop(){}

    public void printInfo() {
        System.out.println("Устройство: " + item.getName());
        System.out.println(item.getDescription());
        System.out.println("Устройство: " + item2.getName());
        System.out.println(item2.getDescription());
        System.out.println("Устройство: " + item3.getName());
        System.out.println(item3.getDescription());
    }
}
