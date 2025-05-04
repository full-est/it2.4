package org.example;

public class Keyboard implements Device {
    @Override
    public String getName(){
        return "Клавиатура";
    }
    @Override
    public String getDescription(){
        return "механическая, RGB-подсветка";
    }
}
