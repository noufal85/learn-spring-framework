package com.noufal.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class app02GamingBasics {
    public static void main(String[] args) {
        // launch spring context

        var context= new AnnotationConfigApplicationContext(appConfiguration.class);

        // configure

        // retrieve beans managed by spring
        System.out.println(context.getBean("name"));

        System.out.println(context.getBean("name2"));
        System.out.println(context.getBean("person"));

        System.out.println(context.getBean("person3Parameters"));


    }
}
