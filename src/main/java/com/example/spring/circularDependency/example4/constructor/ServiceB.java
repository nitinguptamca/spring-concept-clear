package com.example.spring.circularDependency.example4.constructor;

import org.springframework.stereotype.Service;

@Service
public class ServiceB {
    private final ServiceA serviceA;

    public ServiceB(ServiceA serviceA) {
        this.serviceA = serviceA;
    }
}
