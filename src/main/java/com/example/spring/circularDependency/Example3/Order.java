package com.example.spring.circularDependency.Example3;

import lombok.Data;

import java.util.Map;
import java.util.Properties;

@Data
public class Order {private String id;
    private Map<String, Item> itemMap;
    private Properties itemProp;
}
