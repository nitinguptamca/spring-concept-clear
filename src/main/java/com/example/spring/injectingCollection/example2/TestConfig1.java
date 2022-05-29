package com.example.spring.injectingCollection.example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Set;

/**
 * Spring - Injecting beans into Arrays/Collections, Using @Qualifiers And Specifying the Ordering<br>
 * This example uses both @Qualifier and @Order at a time.<Br>
 * https://www.logicbig.com/tutorials/spring-framework/spring-core/using-qualifiers-and-specifying-the-ordering.html
 */

@Configuration
@ComponentScan(basePackages = { "com.example.spring.injectingCollection.example2" })
public class TestConfig1 {
}