package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean(name = "carBean")
    public Mercedes getBean() {
        return new Mercedes();
    }

    @Bean(name = "Keyboard")
    public Keyboard keyboard(){
        return new Keyboard();
    }

    @Bean(name = "Headphones")
    public Headphones headphones(){
        return new Headphones();
    }

    @Bean(name = "GraphicTablet")
    public GraphicTablet graphicTablet(){
        return new GraphicTablet();
    }
}

