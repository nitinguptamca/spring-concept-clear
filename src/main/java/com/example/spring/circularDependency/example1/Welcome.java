package com.example.spring.circularDependency.example1;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Data
@Component
@Scope("prototype")
public class Welcome {
    private String msg;
    ///private LocalDate localDate;
}
