package com.example.spring.circularDependency.example1;

import org.springframework.stereotype.Service;

@Service
public class HelloBean {

    public void sayHello() {
        System.out.println("Hello From Spring Framework");
    }
}
