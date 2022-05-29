package com.example.spring.injectingCollection.example1;

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
@ComponentScan(basePackages = { "com.example.spring.injectingCollection.example1" })
public class TestConfig {

    @Bean
    public TestBean testBean(){
        return new TestBean();
    }

    private static class TestBean {
        @Autowired
        @Qualifier("basicAccount")
      //  private Account[] accounts;
      //  private Map<String, Account> accounts;
        private Set<Account> accounts;

        @PostConstruct
        public void init() {
          //  System.out.println(Arrays.toString(accounts));
            System.out.println(accounts);
        }
    }

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(
                TestConfig.class);
    }
}