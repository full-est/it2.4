package org.example;

public class Dealer {
    private Car car;

    // IoC
    public Dealer(Car model) {
        this.car = model;
    }

    public void printModel() {
        System.out.println("Car model: " + car.getModel());
    }
}
