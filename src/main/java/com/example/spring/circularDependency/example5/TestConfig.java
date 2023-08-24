package com.example.spring.circularDependency.example5;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.example.spring.circularDependency.example5"})
public class TestConfig {
}
