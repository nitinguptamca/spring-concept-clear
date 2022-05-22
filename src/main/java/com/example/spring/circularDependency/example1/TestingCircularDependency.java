package com.example.spring.circularDependency.example1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class TestingCircularDependency {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TestConfig.class);

       // HelloBean helloBean = context.getBean(HelloBean.class);
      /*  Emp emp1 =context.getBean(Emp.class);
        emp1.setAge(30);
        emp1.setName("abc");

        Emp emp2 =context.getBean(Emp.class);
        emp2.setAge(44);
        emp2.setName("xyz");

        System.out.println(emp1 +" "+emp2 );
        System.out.println(emp1.hashCode() +" "+emp2.hashCode() )
        */

        Emp emp1 =context.getBean("emp3",Emp.class);
        emp1.setAge(30);
        emp1.setName("abc");

        Emp emp2 =context.getBean("emp3",Emp.class);
        emp2.setAge(44);
        emp2.setName("xyz");

        System.out.println(emp1 +" "+emp2 );
        System.out.println(emp1.hashCode() +" "+emp2.hashCode());

        Emp emp3 =context.getBean("emp3",Emp.class);
        emp3.setAge(30);
        emp3.setName("abc");

        Emp emp4 =context.getBean("emp4" ,Emp.class);
        emp4.setAge(44);
        emp4.setName("xyz");

        Welcome welcome =context.getBean(Welcome.class);
        welcome.setMsg("hello");

        Welcome welcome1 =context.getBean(Welcome.class);
        welcome1.setMsg("Hi");

     /*   System.out.println(emp1 +" "+emp2 );
        System.out.println(emp1.hashCode() +" "+emp2.hashCode() );
*/
        System.out.println(emp3 +" "+emp4 );
        System.out.println(emp3.hashCode() +" "+emp4.hashCode() );

        System.out.println(welcome +" "+welcome1 );
        System.out.println(welcome.hashCode() +" "+welcome1.hashCode() );

    }


}
