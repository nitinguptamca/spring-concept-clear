package com.example.spring.circularDependency.example5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class Order {
    private User user;
    public Order(User user) {
        this.user = user;
    }
}
