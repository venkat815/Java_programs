package com.example.spring_sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Studentt studentt() {
        Studentt s = new Studentt();
        s.setName("venkat"); 
        s.setAge(22);          
        return s;
    }
}