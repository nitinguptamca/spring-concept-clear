package com.example.spring.circularDependency.example4.constructor;

import org.springframework.stereotype.Service;

@Service
public class ServiceA {
    private final ServiceB serviceB;

    public ServiceA(ServiceB serviceB) {
        this.serviceB = serviceB;
    }
}
