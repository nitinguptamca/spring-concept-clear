package com.example.spring.circularDependency.example5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCircularDependency {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(TestConfig.class);
    }
}
