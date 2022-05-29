package com.example.spring.circularDependency.Example3;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopesIntegrationTest {

    private static final String NAME = "John Smith";
    private static final String NAME_OTHER = "Anna Jones";

    @Ignore
    @Test
    public void givenSingletonScope_whenSetName_thenEqualNames() {
        final ApplicationContext applicationContext = new ClassPathXmlApplicationContext("scope.xml");

        final Person personSingletonA = (Person) applicationContext.getBean("personSingleton");
        final Person personSingletonB = (Person) applicationContext.getBean("personSingleton");

        personSingletonA.setName(NAME);
        personSingletonB.setName(NAME_OTHER);
      ///  Assert.assertEquals(NAME, personSingletonB.getName());
        Assert.assertEquals(personSingletonB.getName() ,personSingletonA.getName());

        ((AbstractApplicationContext) applicationContext).close();
    }
}
