package com.example.spring.circularDependency.example2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.example.spring.circularDependency.example2" })
public class TestConfig1 {
}