package com.noufal.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person(String name, int age, Address address) {
}

record Address(String city, String state) {
}

@Configuration
public class appConfiguration {
    @Bean
    public String name() {
        return "noufal";
    }

    @Bean
    public String name2() {
        return "noufal2";
    }

   @Bean
    public int age() {
        return 30;
    }

    @Bean
    public Person person() {
        return new Person("noufal", 30, address());
    }

    @Bean(name = "address2")
    public Address address() {
        return new Address("kochi", "kerala");
    }


    @Bean
    public Person person3Parameters(String name, int age, Address address2) {
        return new Person(name, age, address2);
    }

}
