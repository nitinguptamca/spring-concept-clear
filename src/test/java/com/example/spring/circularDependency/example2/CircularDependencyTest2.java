package com.example.spring.circularDependency.example2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { TestConfig1.class })
public class CircularDependencyTest2 {

    @Autowired
    ApplicationContext context;

    @Bean
    public CircularDependencyA getCircularDependencyA() {
        return new CircularDependencyA();
    }

    @Bean
    public CircularDependencyB getCircularDependencyB() {
        return new CircularDependencyB();
    }

    @Test
    public void givenCircularDependency_whenSetterInjection_thenItWorks() {
        CircularDependencyA circA = context.getBean(CircularDependencyA.class);

        Assert.assertEquals("Hi!", circA.getCircB().getMessage());
    }
}