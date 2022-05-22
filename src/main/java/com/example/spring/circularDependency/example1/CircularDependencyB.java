package com.example.spring.circularDependency.example1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class CircularDependencyB {

    private CircularDependencyA circA;

    @Autowired
    public CircularDependencyB(@Lazy CircularDependencyA circA) {
        this.circA = circA;
    }
}
