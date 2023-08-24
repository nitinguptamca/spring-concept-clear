package com.example.spring.circularDependency.example4.setter;

import org.springframework.stereotype.Service;

@Service
public class ServiceB {
    private  ServiceA serviceA;

    public void setServiceA(ServiceA serviceA) {
        this.serviceA = serviceA;
    }
}
