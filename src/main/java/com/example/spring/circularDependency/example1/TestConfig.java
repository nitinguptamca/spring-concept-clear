package com.example.spring.circularDependency.example1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.example.spring.circularDependency.example1" })
public class TestConfig {

    @Bean("emp3")
    Emp getEmployee(){
        return new Emp();
    }

    @Bean("emp4")
    Emp getEmployee1(){
        return new Emp();
    }
}