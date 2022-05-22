package com.example.spring.circularDependency.example1;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Data
@Component
@Scope("singleton")
public class Emp {

   String  name ;
   int age;
}
