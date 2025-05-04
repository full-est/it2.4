package org.example;
import org.springframework.stereotype.Component;

@Component("keyboard")
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
