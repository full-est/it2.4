package org.example;
import org.springframework.stereotype.Component;

@Component("graphicTablet")
public class GraphicTablet implements Device {
    @Override
    public String getName(){
        return "Графический планшет";
    }
    @Override
    public String getDescription(){
        return "поддержка 8192 уровней нажатия";
    }
}
