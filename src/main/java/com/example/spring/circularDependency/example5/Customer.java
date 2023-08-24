package com.example.spring.circularDependency.example5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class
Customer implements User {
    private Order order;
    public Customer(Order order) {
        this.order = order;
    }
}