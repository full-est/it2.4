package org.example;

public class Shop {
    private Device item;

    public Shop(Device item){
        this.item = item;
    }

    public void printInfo() {
        System.out.println("Устройство: " + item.getName());
        System.out.println(item.getDescription());
    }
}
