package com.example.spring.circularDependency.example1;


import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Data
public class Deptartment {
    private String deptName;
    private Emp emp;
}
