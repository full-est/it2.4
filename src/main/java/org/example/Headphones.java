package org.example;

public class Headphones implements Device {
    @Override
    public String getName(){
        return "Наушники";
    }
    @Override
    public String getDescription(){
        return "беспроводные, шумоподавление";
    }
}
