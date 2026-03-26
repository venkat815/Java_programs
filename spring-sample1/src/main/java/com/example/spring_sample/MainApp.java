package com.example.spring_sample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        // Load Spring context
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // Get bean
        Studentt student = context.getBean(Studentt.class);

        // Use bean
        student.display();

        // Close context
        context.close();
    }
}