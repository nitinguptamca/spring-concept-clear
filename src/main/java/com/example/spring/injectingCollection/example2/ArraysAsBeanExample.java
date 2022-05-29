package com.example.spring.injectingCollection.example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Configuration
public class ArraysAsBeanExample {

    @Bean
    public String[] fruits() {
        return new String[]{"apple", "banana", "orange"};
    }

    @Bean
    public List<String> fruits1() {
        return Arrays.asList("apple", "banana", "orange");
    }

    @Bean
    public Set<String> fruits2() {
        return new HashSet<>(Arrays.asList("apple", "banana", "orange"));
    }

    @Bean
    public TestBean testBean(){
        return new TestBean();
    }

    private static class TestBean {
        @Autowired
        private String[] fruits;

        @Autowired
        private List<String> fruits1;

        @Autowired
        private Set<String> fruits2;


        @PostConstruct
        public void postConstruct() {
            System.out.println(Arrays.toString(fruits));
            System.out.println(fruits1);
            System.out.println(fruits2);
        }
    }

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(
                TestConfig1.class);
    }
}
